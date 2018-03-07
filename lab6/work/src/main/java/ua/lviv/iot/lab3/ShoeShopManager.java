package ua.lviv.iot.lab3;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ShoeShopManager {
    private String shopName;
    private String shopAddress;
    private int shoesAmount;

    public ShoeShopManager(final String shopName, final String shopAddress, final int shoesAmount) {
        this.shopName = shopName;
        this.shopAddress = shopAddress;
        this.shoesAmount = shoesAmount;
    }

    private List<Shoe> shoes = new LinkedList<>();

    public final List<Shoe> findByType(final Type type) {
        List<Shoe> result = new LinkedList<>();
        for (Shoe shoe : shoes) {
            if (shoe.getType() == type) {
                result.add(shoe);
            }
        }
        return result;
    }


    public final List<Shoe> getShoes() {
        return shoes;
    }

    public final void setShoes(final List<Shoe> shoes) {
        this.shoes = shoes;
    }
}
