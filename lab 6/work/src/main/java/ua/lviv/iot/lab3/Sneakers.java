package ua.lviv.iot.lab3;

import ua.lviv.iot.lab3.Brand;
import ua.lviv.iot.lab3.Size;
import ua.lviv.iot.lab3.SportType;
import ua.lviv.iot.lab3.Type;
import ua.lviv.iot.lab3.Shoe;

public class Sneakers extends Shoe {
    private SportType sportType;
    private String soleMaterial;
    private String laceMaterial;

    public Sneakers(String name, Type type, Brand brand, Size size, String color, double price, String material, SportType sportType, String soleMaterial, String laceMaterial) {
        super(name, type, brand, size, color, price, material);
        this.sportType = sportType;
        this.soleMaterial = soleMaterial;
        this.laceMaterial = laceMaterial;
    }

    public String getSoleMaterial() {
        return soleMaterial;
    }

    public void setSoleMaterial(String soleMaterial) {
        this.soleMaterial = soleMaterial;
    }

}
