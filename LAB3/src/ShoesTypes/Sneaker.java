package ShoesTypes;
import Enums.*;
import SHoe.Shoe;

public class Sneaker extends Shoe {
    private String material;
    private SportType sportType;
    private String laceMaterial;
    private final Enums.Type type = Type.SPORT;
    private final Enums.Size size = Size.INT_42;

    public Sneaker(Brand brand, String name, int amount, double price, String color, Size size, Type type, Gender gender, String material, SportType sportType, String laceMaterial) {
        super(brand, name, amount, price, color, size, type, gender);
        this.material = material;
        this.sportType = sportType;
        this.laceMaterial = laceMaterial;
    }

    @Override
    public String toString() {
        return "Sneaker{" +
                "material='" + material + '\'' +
                ", sportType=" + sportType +
                ", laceMaterial='" + laceMaterial + '\'' +
                ", type=" + type +
                ", size=" + size +
                '}';
    }

    public String getLaceMaterial() {
        return laceMaterial;
    }

    public void setLaceMaterial(String laceMaterial) {
        this.laceMaterial = laceMaterial;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public SportType getSportType() {
        return sportType;
    }

    public void setSportType(SportType sportType) {
        this.sportType = sportType;
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
