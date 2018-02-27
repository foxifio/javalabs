package main;

import customer.Customer;
import enums.*;
import shoe.Shoe;
import shoe.ShoeShopManager;
import shoeTypes.*;

import java.util.List;

public class Main {
    public static void PrintList(List<Shoe> List) {
        List.forEach((Shoe x) -> {
            System.out.println(x.toString());
        });
    }

    public static void main(String[] args) {
        Customer Jaden = new Customer("Jaden", "Smith", Gender.MALE, Size.INT_40, 236786.5);
        ShoeShopManager shoeShopManager = new ShoeShopManager("SoleStore", "George st 4,California,USA", 3456);

        shoeShopManager.addShoe(new Sneakers("ZTX90", Type.SPORT, Brand.ADIDAS, Size.INT_40, "White with black dots",
                1220, "syntetic leather", SportType.BASKETBALL, "Rubber", "Plastic"));
        shoeShopManager.addShoe(new Sneakers("DAME", Type.SPORT, Brand.PUMA, Size.INT_41, "Red",
                1000, "syntetic leather", SportType.RUNNING, "Rubber", "syntetic"));
        shoeShopManager.addShoe(new Sneakers("RONALDO", Type.SPORT, Brand.ADIDAS, Size.INT_40, "Black and gold stripes",
                1560, "syntetic leather", SportType.FOOTBALL, "Rubber", "Plastic"));
        shoeShopManager.addShoe(new Loafers("Mark II", Type.SUMMER, Brand.GUCCI, Size.INT_40, "Brown",
                5000, "Leather", "Leather", "Rubber"));
        shoeShopManager.addShoe(new Loafers("Mark I", Type.SUMMER, Brand.GUCCI, Size.INT_42, "Black",
                4500, "Leather", "Leather", "Rubber"));
        shoeShopManager.addShoe(new RubberBoots("Duck", Type.DEMI, Brand.DUNLOP, Size.INT_39, "Green", 700, "Rubber", "Plastic"));
        shoeShopManager.addShoe(new FlipFlops("Sun", Type.SUMMER, Brand.PEAK, Size.INT_40, "Yellow", 400, "Rubber", "Rubber"));
        shoeShopManager.addShoe(new SnowBoots("Wolf", Type.WINTER, Brand.TIMBERLAND, Size.INT_40, "Grey", 4500, "Leather", 20));
        shoeShopManager.addShoe(new Desert("Sheriff",Type.DEMI,Brand.GUCCI,Size.INT_40,"Black",3000,"Leather","Rubber"));
        shoeShopManager.addShoe(new HikingBoots("DOT",Type.SPORT,Brand.TIMBERLAND,Size.INT_40,"Grey",3500,"Plastic","Metal"));
        PrintList(shoeShopManager.getShoes());
        System.out.println("Shoes for" + Jaden.getName() + "sorted by brand:");



      //if(Jaden.getSize()==shoe.getSize()) {
        List<Shoe> shoes = shoeShopManager.findByType(Type.SPORT);
        shoeShopManager.sortByBrand(shoes);
        for (Shoe shoe : shoes) {
            System.out.println(shoe);
        }
       }
    }
