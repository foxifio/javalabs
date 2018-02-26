package ShoesTypes;
import Enums.Brand;
import Enums.Gender;
import Enums.Size;
import SHoe.Shoe;
import Enums.Type;

public class MoonBoot extends Shoe {
    private String plasticType;
    private String material;
    private String soleType;
    private String soleMaterial;

    private final Enums.Type type = Type.WINTER;
    private final Enums.Size size = Size.INT_42;

    public MoonBoot(Brand brand, String name, int amount, double price, String color, Size size, Type type, Gender gender, String plasticType, String material, String soleType, String soleMaterial) {
        super(brand, name, amount, price, color, size, type, gender);
        this.plasticType = plasticType;
        this.material = material;
        this.soleType = soleType;
        this.soleMaterial = soleMaterial;
    }



    public String getPlasticType() {
        return plasticType;
    }

    public void setPlasticType(String plasticType) {
        this.plasticType = plasticType;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getSoleType() {
        return soleType;
    }

    public void setSoleType(String soleType) {
        this.soleType = soleType;
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
