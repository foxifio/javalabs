package ua.lviv.iot.lab3;

import ua.lviv.iot.lab3.Brand;
import ua.lviv.iot.lab3.Size;
import ua.lviv.iot.lab3.Type;
import ua.lviv.iot.lab3.Shoe;

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
