from shoes.Shoes import *
from enums.Type import Type


class HikingBoots(Shoes):
    type = Type.SPORT

    def __init__(self, name, brand, size, price, colour):
        self.name = name
        self.brand = brand
        self.size = size
        self.price = price
        self.colour = colour

    def __str__(self):
        return "Name: " + self.name + " Brand " + str(self.brand.name) + " Size " + str(self.size) + " Colour: " + str(
            self.colour) + " Type: " + str(self.type.name) + " Price " + str(self.price)
