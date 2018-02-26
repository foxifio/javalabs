package ShoesTypes;
import Enums.Brand;
import Enums.Gender;
import Enums.Size;
import SHoe.Shoe;
import Enums.Type;

public class Desert extends Shoe {
    private double height;
    private String material;
    private String soleMaterial;

    private final Enums.Type type = Type.DEMI;
    private final Enums.Size size = Size.INT_39;



    public Desert(Brand brand, String name, int amount, double price, String color, Size size, Type type, Gender gender, double height, String material, String soleMaterial) {
        super(brand, name, amount, price, color, size, type, gender);
        this.height = height;
        this.material = material;
        this.soleMaterial = soleMaterial;
    }


    @Override
    public String toString() {
        return "Desert{" +
                "height=" + height +
                ", material='" + material + '\'' +
                ", soleMaterial='" + soleMaterial + '\'' +
                ", type=" + type +
                ", size=" + size +
                '}';
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getSoleMaterial() {
        return soleMaterial;
    }

    public void setSoleMaterial(String soleMaterial) {
        this.soleMaterial = soleMaterial;
    }


    /*@Override
    public Enums.Type getShoesType() {
        return type;
    }

    @Override
    public Enums.Size getShoesSize() {
        return size;
    }*/
    @Override
    public Type getSType(){
        return type;
    }
}
