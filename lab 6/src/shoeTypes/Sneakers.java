package shoeTypes;

import enums.Brand;
import enums.Size;
import enums.SportType;
import enums.Type;
import shoe.Shoe;

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

    public SportType getSportType() {
        return sportType;
    }

    public void setSportType(SportType sportType) {
        this.sportType = sportType;
    }

    public String getSoleMaterial() {
        return soleMaterial;
    }

    public void setSoleMaterial(String soleMaterial) {
        this.soleMaterial = soleMaterial;
    }

    public String getLaceMaterial() {
        return laceMaterial;
    }

    public void setLaceMaterial(String laceMaterial) {
        this.laceMaterial = laceMaterial;
    }
}
