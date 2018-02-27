package shoeTypes;

import enums.Brand;
import enums.Size;
import enums.Type;
import shoe.Shoe;

public class HikingBoots extends Shoe {
    private String soleMaterial;

    public HikingBoots(String name, Type type, Brand brand, Size size, String color, double price, String material, String soleMaterial) {
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
