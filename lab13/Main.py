from shoes.Sneakers import *
from shoes.SnowBoots import *
from shoes.HikingBoots import *
from ShoeManager import *
from enums.Brand import *

if __name__ == '__main__':
    shoeManager = ShoeManager()

    hiking_boots = HikingBoots("Expeditor", Brand.ADIDAS, 44, 500.54, "blue")
    sneakers = Sneakers("Neo", Brand.PUMA, 45, 200.0, "black")
    snow_boots = SnowBoots("Perfect", Brand.NIKE, 42, 300.2, "yellow")

    shoeManager.shoes = [hiking_boots, sneakers, snow_boots]
    print("Initial list:")
    shoeManager.print_list()

    shoeManager.sort_by_brand()
    print("Sorted list")
    shoeManager.print_list()

    shoeManager.shoes = shoeManager.find_by_type(Type.SPORT, 44)
    print("Found list:")
    shoeManager.print_list()

    pass
