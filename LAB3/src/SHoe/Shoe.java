package SHoe;

import Enums.Brand;
import Enums.Size;
import Enums.Type;
import Enums.Gender;

public abstract class Shoe {
    private Brand brand;
    private String name;
    private int amount;
    private double price;
    private String color;
    private Size size;
    private Type type;
    private Gender gender;

    //public abstract Enums.Type getShoesType();
    //public abstract Enums.Size getShoesSize();

    public Shoe(Brand brand, String name, int amount, double price, String color, Size size, Type type, Gender gender) {
        this.brand = brand;
        this.name = name;
        this.amount = amount;
        this.price = price;
        this.color = color;
        this.size = size;
        this.type = type;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Shoe{" +
                "brand=" + brand +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", size=" + size +
                ", type=" + type +
                ", gender=" + gender +
                '}';
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
    public abstract Type getSType();
}
