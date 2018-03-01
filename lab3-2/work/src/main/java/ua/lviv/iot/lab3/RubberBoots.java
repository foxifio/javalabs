package ua.lviv.iot.lab3;

import ua.lviv.iot.lab3.Brand;
import ua.lviv.iot.lab3.Size;
import ua.lviv.iot.lab3.Type;
import ua.lviv.iot.lab3.Shoe;

public class RubberBoots extends Shoe {
    private String soleMaterial;

    public RubberBoots(String name, Type type, Brand brand, Size size, String color, double price, String material, String soleMaterial) {
        super(name, type, brand, size, color, price, material);
        this.soleMaterial = soleMaterial;

    }

    public String getSoleMaterial() {
        return soleMaterial;
    }

    public void setSoleMaterial(String soleMaterial) {
        this.soleMaterial = soleMaterial;
    }
}

