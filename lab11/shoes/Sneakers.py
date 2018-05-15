from shoes.Shoes import *
from enums.Type import Type


class Sneakers(Shoes):
    type = Type.SPORT

    def __init__(self, name, brand, size, price, colour):
        self.name = name
        self.brand = brand
        self.size = size
        self.price = price
        self.colour = colour

    def __str__(self):
        return "Name: " + self.name + " Brand " + str(self.brand.name)+ " Size " + str(self.size) + "  colour: " + str(
            self.colour) + " Type: " + str(self.type.name) + " price " + str(self.price)
