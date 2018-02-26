package CS;

import Enums.Type;
import SHoe.Shoe;

import java.util.LinkedList;
import java.util.List;

public class ShoesShopManager {
    private String shopName;
    private String shopAddres;
    private int amountOfShoes;
    private List<Shoe> shoes = new LinkedList<>();

    public ShoesShopManager(String shopName, String shopAddres, int amountOfShoes) {
        this.shopName = shopName;
        this.shopAddres = shopAddres;
        this.amountOfShoes = amountOfShoes;
    }

    public void addShoe(Shoe shoe) {
        this.shoes.add(shoe);
    }

    public List<Shoe> availableShoes = new LinkedList<>();


    public List<Shoe> findByType(Type type) {
        List<Shoe> result = new LinkedList<>();
        for (Shoe shoe : availableShoes) {
            if (shoe.getSType() == type) {
                result.add(shoe);
            }
        }
        return result;
    }


         public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopAddres() {
        return shopAddres;
    }

    public void setShopAddres(String shopAddres) {
        this.shopAddres = shopAddres;
    }

    public int getAmountOfShoes() {
        return amountOfShoes;
    }

    public void setAmountOfShoes(int amountOfShoes) {
        this.amountOfShoes = amountOfShoes;
    }

    public List<Shoe> getShoes() {
        return shoes;
    }

    public void setShoes(List<Shoe> shoes) {
        this.shoes = shoes;
    }

    public List<Shoe> getAvailableShoes() {
        return availableShoes;
    }

    public void setAvailableShoes(List<Shoe> availableShoes) {
        this.availableShoes = availableShoes;
    }

    @Override
    public String toString() {
        return "ShoesShopManager{" +
                "shopName='" + shopName + '\'' +
                ", shopAddres='" + shopAddres + '\'' +
                ", amountOfShoes=" + amountOfShoes +
                ", shoes=" + shoes +
                ", availableShoes=" + availableShoes +
                '}';
    }
}
