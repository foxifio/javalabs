package shoeTypes;

import enums.Brand;
import enums.Size;
import enums.Type;
import shoe.Shoe;

public class SnowBoots extends Shoe{
    private double height;

    public SnowBoots(String name, Type type, Brand brand, Size size, String color, double price, String material, double height) {
        super(name, type, brand, size, color, price, material);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
