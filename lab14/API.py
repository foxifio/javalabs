from flask import Flask, abort
from flask_restful import Api, Resource, reqparse, fields, marshal
from shoes.Shoe import *

app = Flask(__name__, static_url_path="")
api = Api(app)

shoes = {}

shoes_fields = {
    'id': fields.Integer,
    'name': fields.String,
    'brand': fields.String,
    'price': fields.Float,
    'size': fields.Integer,
    'shoes_colour': fields.String,
    'shoes_type': fields.String
}


class Shoes(Resource):
    def __init__(self):
        self.reqparse = reqparse.RequestParser()
        self.reqparse.add_argument('id', type=int, location='json')
        self.reqparse.add_argument('name', type=str, location='json')
        self.reqparse.add_argument('brand', type=str, location='json')
        self.reqparse.add_argument('price', type=float, location='json')
        self.reqparse.add_argument('size', type=int, location='json')
        self.reqparse.add_argument('shoes_colour', type=str, location='json')
        self.reqparse.add_argument('shoes_type', type=str, location='json')
        super(Shoes, self).__init__()  # super().__init__() / Good.__init__(self)

    @app.route('/shoes')
    def put(self):
        args = self.reqparse.parse_args()
        shoe = {
            'id': args['id'],
            'name': args['name'],
            'brand': args['brand'],
            'price': args['price'],
            'size': args['size'],
            'shoes_colour': args['shoes_colour'],
            'shoes_type': args['shoes_type']
        }
        shoes.update(shoe)
        return marshal(shoe, shoes_fields), 201

    @app.route('/shoes')
    def post(self):
        args = self.reqparse.parse_args()
        shoe = [shoe for shoe in shoes if shoes.get('id') == args['id']]
        if len(shoe) == 0:
            abort(404)
        shoes.pop(shoe[0])
        new_shoe = {
            'id': args['id'],
            'name': args['name'],
            'manufacturer': args['manufacturer'],
            'price': args['price'],
            'size': args['size'],
            'shoes_colour': args['shoes_colour'],
            'shoes_type': args['shoes_type']
        }
        shoes.update(new_shoe)
        return marshal(new_shoe, shoes_fields)

    @app.route('/shoes/<int:id>')
    def get(self, id):
        shoe = [shoe for shoe in shoes if shoes.get('id') == id]
        if len(shoe) == 0:
            abort(404)
        return marshal(shoe[0], shoes_fields)

    @app.route('/shoes/<int:id>')
    def delete(self, id):
        shoe = [shoe for shoe in shoes if shoes.get('id') == id]
        if len(shoe) == 0:
            abort(404)
        shoes.pop(shoe[0])
        return {'result': True}


api.add_resource(Shoes, '/shoes', endpoint='shoes')
api.add_resource(Shoes, '/shoes/<int:id>', endpoint='shoe')

if __name__ == '__main__':
    app.run(debug=True)