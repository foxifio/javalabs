import configparser
from flask_sqlalchemy import SQLAlchemy
from flask import Flask, jsonify, request

application = Flask(__name__)

config = configparser.ConfigParser()
config.read('D:\lab14/products_db.conf')

application.config['SQLALCHEMY_DATABASE_URI'] = 'mysql://' + config.get('DB', 'user') + \
                                                ':' + config.get('DB', 'password') + '@' + \
                                                config.get('DB', 'host') + '/' + config.get('DB', 'db')

application.config['SQLALCHEMY_TRACK_MODIFICATIONS'] = True

mysql = SQLAlchemy()
mysql.init_app(application)


class Products(mysql.Model):
    __tablename__ = 'shoe'
    id = mysql.Column(mysql.Integer, primary_key=True)
    brand = mysql.Column(mysql.String, nullable=False)
    name = mysql.Column(mysql.String(128), nullable=False)
    price = mysql.Column(mysql.Float, nullable=False)
    size = mysql.Column(mysql.Integer, nullable=False)

    def __repr__(self):
        return '<Products (%s, %s, %s, %s) >' % (self.brand, self.name, self.price, self.size)


@application.route("/")
def hello():
    return "Hello World!"


@application.route('/shoe', methods=['POST'])
def create_product():
    id = request.get_json()["id"]
    brand = request.get_json()["brand"]
    name = request.get_json()["name"]
    price = request.get_json()["price"]
    size = request.get_json()["size"]
    curr_session = mysql.session

    product = Products(id=id, brand=brand, name=name, price=price, size=size)

    try:
        curr_session.add(product)
        curr_session.commit()
    except:
        curr_session.rollback()
        curr_session.flush()

    product_id = product.id
    data = Products.query.filter_by(id=product_id).first()

    config.read('D:\lab14/products_db.conf')

    result = [data.name, data.brand, data.price, data.size]

    return jsonify(session=result)


@application.route('/shoe', methods=['GET'])
def get_product():
    data = Products.query.all()

    data_all = []

    for product in data:
        data_all.append([product.id, product.name, product.brand, product.price, product.size])

    return jsonify(products=data_all)


@application.route('/shoe', methods=['PATCH'])
def update_product():
    global product
    product_id = request.get_json()["id"]
    brand = request.get_json()["brand"]
    name = request.get_json()["name"]
    price = request.get_json()["price"]
    size = request.get_json()["size"]
    curr_session = mysql.session

    try:
        product = Products.query.filter_by(id=product_id).first()
        product.brand = brand
        product.name = name
        product.price = price
        product.size = size
        curr_session.commit()
    except:
        curr_session.rollback()
        curr_session.flush()

    product_id = product.id
    data = Products.query.filter_by(id=product_id).first()

    config.read('D:\lab14/products_db.conf')

    result = [data.name, data.brand, data.price, data.size]

    return jsonify(session=result)


@application.route('/shoe/<int:product_id>', methods=['DELETE'])
def delete_product(product_id):
    curr_session = mysql.session

    Products.query.filter_by(id=product_id).delete()
    curr_session.commit()

    return get_product()


if __name__ == "__main__":
    application.run()