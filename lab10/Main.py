class Printer:
    name = "LG 0P006"
    length, width, price, weight = 0, 0, 0.0, 0.0
    total_capacity = 0

    def __init__(self, name="LG 0P006", length=0, width=0, price=0.0, weight=0.0):
        self.name = name
        self.length = length
        self.width = width
        self.price = price
        self.weight = weight
        Printer.total_price += self.price

    def to_string(self):
        print("Name: " + self.name + ", length: " + str(self.length)
              + ", width: " + str(self.width) + ", price: "
              + str(self.price) + ", weight: " + str(self.weight))

    def print_sum(self):
        print("A printer called " + self.name + " has price " + str(self.price))

    @staticmethod
    def print_static_sum():
        print("Total price of all printers = " + str(Printer.total_price))


if __name__ == "__main__":
    LG = Printer()
    Canon = Printer("Canon 7779", 251, 36, 5000, 5.56)
    Lenovo = Printer("LENOVO P221", 150, 2500, 5)
    LG.to_string()
    Canon.to_string()
    Lenovo.to_string()
    Printer.print_static_sum()
    Canon.print_sum()
    Lenovo.print_sum()