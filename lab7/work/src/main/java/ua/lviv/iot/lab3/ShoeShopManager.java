package ua.lviv.iot.lab3;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.Map;

public class ShoeShopManager {
    private String shopName;
    private String shopAddress;
    private int shoesAmount;

    public ShoeShopManager(final String shopName, final String shopAddress, final int shoesAmount) {
        this.shopName = shopName;
        this.shopAddress = shopAddress;
        this.shoesAmount = shoesAmount;
    }

    private  static Map<Integer,Shoe> shoesMap = new HashMap<>();

    public final Map<Integer,Shoe> findByType(final Type type) {
        final Map<Integer,Shoe> result = new HashMap<>();
        for (Map.Entry<Integer,Shoe> shoe : shoesMap.entrySet()) {
            if (shoe.getValue().getType()==Type.SPORT) {
                result.put(shoe.getKey(), shoe.getValue());
            }
        }
        return result;
    }


    public final Map<Integer,Shoe> getShoes() {
        return shoesMap;
    }
}
