from shoes.Shoe import *
from enums.Type import Type


class SnowBoots(Shoe):
    shoes_type = Type.WINTER

    def __init__(self, name, id, brand, size, price, colour, shoes_colour, shoes_type):
        super().__init__(id, name, brand, price, size, shoes_colour, shoes_type)
        self.id = id
        self.name = name
        self.brand = brand
        self.size = size
        self.price = price
        self.colour = colour

    def __str__(self):
        return "Name: " + self.name + " Brand " + str(self.brand.name) + " Size " + str(self.size) + "  colour: " + str(
            self.colour) + " Type: " + str(self.type.name) + " price " + str(self.price)
