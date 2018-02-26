package ShoesTypes;
import Enums.Brand;
import Enums.Gender;
import Enums.Size;
import Enums.Type;
import SHoe.Shoe;

public class Loafer extends Shoe {
    private String material;
    private String laceType;
    private String soleMaterial;

    private final Enums.Type type = Type.DEMI;
    private final Enums.Size size = Size.INT_42;

    public Loafer(Brand brand, String name, int amount, double price, String color, Size size, Type type, Gender gender, String material, String laceType, String soleMaterial) {
        super(brand, name, amount, price, color, size, type, gender);
        this.material = material;
        this.laceType = laceType;
        this.soleMaterial = soleMaterial;
    }

    @Override
    public String toString() {
        return "Loafer{" +
                "material='" + material + '\'' +
                ", laceType='" + laceType + '\'' +
                ", soleMaterial='" + soleMaterial + '\'' +
                ", type=" + type +
                ", size=" + size +
                '}';
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getLaceType() {
        return laceType;
    }

    public void setLaceType(String laceType) {
        this.laceType = laceType;
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
