class ShoeManager:
    shoes = []

    def __init__(self):
        pass

    def sort_by_brand(self):
        self.shoes.sort(key=lambda stuff: stuff.brand.name)

    def find_by_type(self, type, size):
        found_stuff = []

        for stuff in self.shoes:
            if (stuff.type == type) & (stuff.size == size):
                found_stuff.append(stuff)

        return found_stuff

    def add_shoe(self, stuff):
        self.shoes += stuff

    def print_list(self):
        for stuff in self.shoes:
            print(stuff)
        print("\n")

