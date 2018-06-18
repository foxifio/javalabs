from flask import Flask, abort
from flask_restful import Resource, fields, reqparse, marshal, Api

app = Flask(__name__, static_url_path="")
api = Api(app)

shoes = [
    {
        'Id': 0,
        'name': 'Default',
        'brand': 'Default',
        'size': 0,
        'price': 0.0,
    }
]

shoes_fields = {
    'id': fields.Integer,
    'name': fields.String,
    'brand': fields.String,
    'price': fields.Float,
    'size': fields.Integer,
}


class Shoe(Resource):
    def __init__(self):
        self.reqparse = reqparse.RequestParser()
        self.reqparse.add_argument('id', type=int, required=True, help='No Id provided', location='json')
        self.reqparse.add_argument('name', type=str, location='json')
        self.reqparse.add_argument('brand', type=str, location='json')
        self.reqparse.add_argument('price', type=float, location='json')
        self.reqparse.add_argument('size', type=int, location='json')
        super(Shoe, self).__init__()  # super().__init__() / Good.__init__(self)

    def get(self, id):
        shoe = [shoe for shoe in shoes if shoe.get('id') == id]
        if len(shoe) == 0:
            abort(404)
        return {'Shoe': marshal(shoe[0], shoes_fields)}

    def delete(self, id):
        shoe = [shoe for shoe in shoes if shoe.get('id') == id]
        if len(shoe) == 0:
            abort(404)
        shoes.remove(shoe[0])
        return {'result': True}

    def put(self):
        args = self.reqparse.parse_args()
        shoe = {
            'Id': shoes[-1]['Id'] + 1,
            'id': args['id'],
            'name': args['name'],
            'brand': args['brand'],
            'price': args['price'],
            'size': args['size']
        }
        shoes.append(shoe)
        return {'Shoe': marshal(shoe, shoes_fields)}, 201

    def post(self):
        args = self.reqparse.parse_args()
        shoe = [shoe for shoe in shoes if shoe.get('id') == args['id']]
        if len(shoe) == 0:
            abort(404)
        shoe = shoe[0]
        args = self.reqparse.parse_args()
        for k, v in args.items():
            if v is not None:
                shoe[k] = v


api.add_resource(Shoe, '/shoes', endpoint='shoes')
api.add_resource(Shoe, '/shoes/<int:id>', endpoint='shoe')

if __name__ == '__main__':
    app.run(debug=True)