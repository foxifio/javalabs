package ua.lviv.iot.lab3;

import ua.lviv.iot.lab3.Brand;
import ua.lviv.iot.lab3.Size;
import ua.lviv.iot.lab3.Type;
import ua.lviv.iot.lab3.Shoe;

public class Loafers extends Shoe {
    private String laceMaterial;
    private String soleMaterial;

    public Loafers(String name, Type type, Brand brand, Size size, String color, double price, String material, String laceMaterial, String soleMaterial) {
        super(name, type, brand, size, color, price, material);
        this.laceMaterial = laceMaterial;
        this.soleMaterial = soleMaterial;
    }

    public String getSoleMaterial() {
        return soleMaterial;
    }

    public void setSoleMaterial(String soleMaterial) {
        this.soleMaterial = soleMaterial;
    }
}
