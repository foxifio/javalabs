package ShoesTypes;
import Enums.Brand;
import Enums.Gender;
import Enums.Size;
import SHoe.Shoe;
import Enums.Type;

public class FlipFlop extends Shoe {
    private String material;
    private final Enums.Type type = Type.SPORT;
    private final Enums.Size size = Size.INT_40;

    public FlipFlop(Brand brand, String name, int amount, double price, String color, Size size, Type type, Gender gender, String material) {
        super(brand, name, amount, price, color, size, type, gender);
        this.material = material;
    }

    @Override
    public String toString() {
        return "FlipFlop{" +
                "material='" + material + '\'' +
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
