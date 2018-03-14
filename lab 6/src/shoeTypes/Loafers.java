package shoeTypes;

import enums.Brand;
import enums.Size;
import enums.Type;
import shoe.Shoe;

public class Loafers extends Shoe {
    private String laceMaterial;
    private String soleMaterial;

    public Loafers(String name, Type type, Brand brand, Size size, String color, double price, String material, String laceMaterial, String soleMaterial) {
        super(name, type, brand, size, color, price, material);
        this.laceMaterial = laceMaterial;
        this.soleMaterial = soleMaterial;
    }

    public String getLaceMaterial() {
        return laceMaterial;
    }

    public void setLaceMaterial(String laceMaterial) {
        this.laceMaterial = laceMaterial;
    }

    public String getSoleMaterial() {
        return soleMaterial;
    }

    public void setSoleMaterial(String soleMaterial) {
        this.soleMaterial = soleMaterial;
    }
}
