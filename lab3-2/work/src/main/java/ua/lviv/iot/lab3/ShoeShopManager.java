package ua.lviv.iot.lab3;

import ua.lviv.iot.lab3.Type;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ShoeShopManager {
    private String shopName;
    private String shopAddress;
    private int shoesAmount;

    public ShoeShopManager(String shopName, String shopAddress, int shoesAmount) {
        this.shopName = shopName;
        this.shopAddress = shopAddress;
        this.shoesAmount = shoesAmount;
    }

    private List<Shoe> shoes = new LinkedList<>();

    public List<Shoe> findByType(Type type) {
        List<Shoe> result = new LinkedList<>();
        for (Shoe shoe : shoes) {
            if (shoe.getType() == type) {
                result.add(shoe);
            }
        }
        return result;
    }

    public void addShoe(Shoe shoe) {
        this.shoes.add(shoe);
    }

    public void sortByBrand(List<Shoe> list) {
        list.sort(Comparator.comparing(Shoe::getBrand));
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopAddress() {
        return shopAddress;
    }

    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress;
    }

    public int getShoesAmount() {
        return shoesAmount;
    }

    public void setShoesAmount(int shoesAmount) {
        this.shoesAmount = shoesAmount;
    }

    public List<Shoe> getShoes() {
        return shoes;
    }

    public void setShoes(List<Shoe> shoes) {
        this.shoes = shoes;
    }
}
