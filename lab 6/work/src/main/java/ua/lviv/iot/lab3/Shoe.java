package ua.lviv.iot.lab3;

import ua.lviv.iot.lab3.Brand;
import ua.lviv.iot.lab3.Size;
import ua.lviv.iot.lab3.Type;

public class Shoe {
    private String name;
    private Type type;
    private Brand brand;
    private Size size;
    private String color;
    private double price;
    private String material;


    public Shoe(String name, Type type, Brand brand, Size size, String color, double price, String material) {
        this.name = name;
        this.type = type;
        this.brand = brand;
        this.size = size;
        this.color = color;
        this.price = price;
        this.material = material;
    }

    @Override
    public String toString() {
        return "Shoe{" +"name=" + name +
                ",type=" + type +
                ", brand=" + brand +
                ", size=" + size +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaterial() {
        return material;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
