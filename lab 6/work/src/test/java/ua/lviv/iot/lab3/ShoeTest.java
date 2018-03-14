package ua.lviv.iot.lab3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShoeTest {
    private Shoe shoe;

    @BeforeEach
    void setUp() {
        shoe = new Shoe("Tor",Type.SPORT,Brand.PEAK,Size.INT_40,"Black",4000,"Leather");
    }

    @Test
    void getName() {
        assertEquals("Tor",shoe.getName());
    }

    @Test
    void setName() {
        shoe.setName("Tor");
        assertEquals("Tor",shoe.getName());
    }

    @Test
    void getMaterial() {
        assertEquals("Leather",shoe.getMaterial());
    }

    @Test
    void getType() {
        assertEquals(Type.SPORT,shoe.getType());
    }

    @Test
    void setType() {
        shoe.setType(Type.SPORT);
        assertEquals(Type.SPORT,shoe.getType());
    }

    @Test
    void getBrand() {
        assertEquals(Brand.PEAK,shoe.getBrand());
    }

    @Test
    void setBrand() {
        shoe.setBrand(Brand.PEAK);
    }

    @Test
    void getSize() {
        assertEquals(Size.INT_40,shoe.getSize());
    }

    @Test
    void setSize() {
        shoe.setSize(Size.INT_40);
        assertEquals(Size.INT_40,shoe.getSize());

    }

    @Test
    void getColor() {
        assertEquals("Black",shoe.getColor());
    }

    @Test
    void setColor() {
        shoe.setColor("Black");
        assertEquals("Black",shoe.getColor());
    }
    @Test
    void getPrice() {
        assertEquals(4000,shoe.getPrice());
    }
    @Test
    void setPrice() {
        shoe.setPrice(4000);
        assertEquals(4000,shoe.getPrice());
    }
}