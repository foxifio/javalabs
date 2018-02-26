package ShoesTypes;
import Enums.Brand;
import Enums.Gender;
import Enums.Size;
import SHoe.Shoe;
import Enums.Type;

public class RubberBoot extends Shoe {
    private String rubberType;
    private final Enums.Type type = Type.DEMI;
    private final Enums.Size size = Size.INT_38;

    public RubberBoot(Brand brand, String name, int amount, double price, String color, Size size, Type type, Gender gender, String rubberType) {
        super(brand, name, amount, price, color, size, type, gender);
        this.rubberType = rubberType;
    }

    @Override
    public String toString() {
        return "RubberBoot{" +
                "rubberType='" + rubberType + '\'' +
                ", type=" + type +
                ", size=" + size +
                '}';
    }

    public String getRubberType() {
        return rubberType;
    }

    public void setRubberType(String rubberType) {
        this.rubberType = rubberType;
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
