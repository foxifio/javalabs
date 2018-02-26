package Main;
import CS.ShoesShopManager;
import Enums.*;
import SHoe.Shoe;
import ShoesTypes.Desert;
import ShoesTypes.Loafer;
import ShoesTypes.Sneaker;

import java.util.LinkedList;
import java.util.List;

import static Enums.Type.SPORT;

public class Main {
    public static void PrintList(List<Shoe> List){
        List.forEach((Shoe x) -> {
         System.out.println(x.toString());
        });
    }
    public static void main(String[] args) {
        ShoesShopManager shoesShopManager = new ShoesShopManager("ShoesDream", "S.Petlyru 4", 1820);
        shoesShopManager.addShoe(new Loafer(Brand.GUCCI, "MARK I", 1, 1150, "White",
                Size.INT_39, Type.DEMI, Gender.MALE, "Leather", "Western", "plastic"));
        shoesShopManager.addShoe(new Loafer(Brand.GUCCI, "MARK II", 2, 1200, "White/Black",
                Size.INT_40, Type.DEMI, Gender.MALE, "Leather", "Glory", "rubber"));
        shoesShopManager.addShoe(new Loafer(Brand.GUCCI, "MARK", 4, 1000, "White/Black",
                Size.INT_41, Type.DEMI, Gender.MALE, "Leather", "Champion", "rubber"));
        shoesShopManager.addShoe(new Sneaker(Brand.ADIDAS, "ZTX-911", 2, 1550, "Blue/White/Black",
                Size.INT_41, Type.SPORT, Gender.MALE, "syntetic leather", SportType.BASKETBALL, "syntetic"));
        shoesShopManager.addShoe(new Sneaker(Brand.ADIDAS, "ZTX-911", 1, 1550, "Blue/White/Black",
                Size.INT_40, Type.SPORT, Gender.MALE, "syntetic leather", SportType.BASKETBALL, "syntetic"));
        shoesShopManager.addShoe(new Sneaker(Brand.ADIDAS, "ZTX-911", 3, 1550, "Yellow",
                Size.INT_38, Type.SPORT, Gender.FEMALE, "syntetic leather", SportType.BASKETBALL, "syntetic"));
        shoesShopManager.addShoe(new Sneaker(Brand.PEAK, "ICQ-560", 5, 1130, "Blue",
                Size.INT_40, Type.SPORT, Gender.MALE, "syntetic", SportType.VALLEYBALL, "syntetic"));
        shoesShopManager.addShoe(new Sneaker(Brand.CHAMPION, "GR-500", 2, 1550, "Purple",
                Size.INT_42, Type.SPORT, Gender.MALE, "syntetic leather", SportType.FOOTBALL, "syntetic"));
        shoesShopManager.addShoe(new Desert(Brand.ORACLE, "Viper", 2, 2500, "Browm",
                Size.INT_43, Type.DEMI, Gender.MALE, 15, "syntetic leather", "rubber"));
        shoesShopManager.addShoe(new Desert(Brand.ORACLE, "Viper", 2, 2500, "Black",
                Size.INT_42, Type.DEMI, Gender.MALE, 15, "syntetic leather", "rubber"));
       // System.out.println(shoesShopManager.toString());
        PrintList(shoesShopManager.getShoes());

        List<Shoe> availableShoes = shoesShopManager.findByType(Type.SPORT);
        for (Shoe shoe: availableShoes){
            System.out.println(shoe);

        }


    }


    }
