package ShoesTypes;
import Enums.Brand;
import Enums.Gender;
import Enums.Size;
import Enums.Type;
import SHoe.Shoe;

public class SnowBoot extends Shoe {
    private String material;
    private String soleMaterial;
    private double height;
    private final Enums.Type type = Type.WINTER;
    private final Enums.Size size = Size.INT_38;

    public SnowBoot(Brand brand, String name, int amount, double price, String color, Size size, Type type, Gender gender, String material, String soleMaterial, double height) {
        super(brand, name, amount, price, color, size, type, gender);
        this.material = material;
        this.soleMaterial = soleMaterial;
        this.height = height;

    }

    @Override
    public String toString() {
        return "SnowBoot{" +
                "material='" + material + '\'' +
                ", soleMaterial='" + soleMaterial + '\'' +
                ", height=" + height +
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
