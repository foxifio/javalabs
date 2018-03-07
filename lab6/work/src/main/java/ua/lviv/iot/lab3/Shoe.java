package ua.lviv.iot.lab3;

public class Shoe {
    private String name;
    private Type type;
    private Brand brand;
    private Size size;
    private String color;
    private double price;
    private String material;


    public Shoe(final String name, final Type type, final Brand brand, final Size size, final String color, final double price, final String material) {
        this.name = name;
        this.type = type;
        this.brand = brand;
        this.size = size;
        this.color = color;
        this.price = price;
        this.material = material;
    }

    @Override
    public final String toString() {
        return "Shoe{" + "name=" + name + ",type=" + type + ", brand=" + brand + ", size=" + size + ", color='" + color + '\'' + ", price=" + price + '}';
    }

    public final String getName() {
        return name;
    }

    public final void setName(final String name) {
        this.name = name;
    }

    public final String getMaterial() {
        return material;
    }

    public final void setMaterial(final String material) {
        this.material = material;
    }

    public final Type getType() {
        return type;
    }

    public final void setType(final Type type) {
        this.type = type;
    }

    public final Brand getBrand() {
        return brand;
    }

    public final void setBrand(final Brand brand) {
        this.brand = brand;
    }

    public final Size getSize() {
        return size;
    }

    public final void setSize(final Size size) {
        this.size = size;
    }

    public final String getColor() {
        return color;
    }

    public final void setColor(final String color) {
        this.color = color;
    }

    public final double getPrice() {
        return price;
    }

    public final void setPrice(final double price) {
        this.price = price;
    }
}
