package ua.lviv.iot.lab3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShoeShopManagerTest {
    private ShoeShopManager manager;
    private List<Shoe> shoes;
    private Shoe shoe1;
    private Shoe shoe2;
    private Shoe shoe3;
    private Shoe shoe4;
    private Shoe shoe5;

    @BeforeEach
    void setUp() {
        Customer jaden = new Customer("Jaden", "Smith", Gender.MALE, Size.INT_40, 236786.5);
        manager = new ShoeShopManager("SoleStore", "George st 4,California,USA", 3456);
        shoes = new LinkedList<>();
        shoe1 = new Sneakers("ZTX90", Type.SPORT, Brand.ADIDAS, Size.INT_40, "White with black dots", 1220, "syntetic leather", SportType.BASKETBALL, "Rubber", "Plastic");
        shoe2 = new SnowBoots("Wolf", Type.WINTER, Brand.TIMBERLAND, Size.INT_40, "Grey", 4500, "Leather", 20);
        shoe3 = new Sneakers("RONALDO", Type.SPORT, Brand.ADIDAS, Size.INT_40, "Black and gold stripes", 1560, "syntetic leather", SportType.FOOTBALL, "Rubber", "Plastic");
        shoe4 = new FlipFlops("Sun", Type.SUMMER, Brand.PEAK, Size.INT_40, "Yellow", 400, "Rubber", "Rubber");
        shoe5 = new Loafers("Mark I", Type.SUMMER, Brand.GUCCI, Size.INT_42, "Black", 4500, "Leather", "Leather", "Rubber");

        shoes.add(shoe1);
        shoes.add(shoe2);
        shoes.add(shoe3);
        shoes.add(shoe4);
        shoes.add(shoe5);
        manager.setShoes(shoes);
    }
    @Test
    void testCustomer(){


    }

    @Test
    void testFirstShoe(){
        shoe1.getBrand();
        shoe1.getType();
        shoe1.getColor();
        shoe1.getMaterial();
        shoe1.getName();
        shoe1.getSize();
        shoe1.setName("ZTX90");
        shoe1.setBrand(Brand.ADIDAS);
        shoe1.setColor("White with black dots");
        shoe1.setPrice(1220);
        shoe1.setSize(Size.INT_40);
        shoe1.setType(Type.SPORT);
    }

    @Test
    void testSecondShoe(){
        shoe2.getBrand();
        shoe2.getType();
        shoe2.getColor();
        shoe2.getMaterial();
        shoe2.getName();
        shoe2.getSize();
        shoe2.setName("Wolf");
        shoe2.setBrand(Brand.TIMBERLAND);
        shoe2.setColor("Grey");
        shoe2.setPrice(4500);
        shoe2.setSize(Size.INT_40);
        shoe2.setType(Type.WINTER);
    }
    @Test
    void testThirdShoe(){
        shoe3.getBrand();
        shoe3.getType();
        shoe3.getColor();
        shoe3.getMaterial();
        shoe3.getName();
        shoe3.getSize();
        shoe3.setName("RONALDO");
        shoe3.setBrand(Brand.ADIDAS);
        shoe3.setColor("Black and gold stripes");
        shoe3.setPrice(1560);
        shoe3.setSize(Size.INT_40);
        shoe3.setType(Type.SPORT);
    }

    @Test
    void findByType() {
        manager.findByType(Type.SPORT);
        assertEquals(shoe1, manager.getShoes().get(0));

    }


}