package ua.lviv.iot.lab3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SneakersTest {
    private Sneakers sneakers;

    @BeforeEach
    void setUp() {
        sneakers = new Sneakers("ZTX90", Type.SPORT, Brand.ADIDAS, Size.INT_40, "White with black dots",
                1220, "syntetic leather", SportType.BASKETBALL, "Rubber", "Plastic");
    }

    @Test
    void getSoleMaterial() {
    assertEquals("Plastic",sneakers.getSoleMaterial());
    }

    @Test
    void setSoleMaterial() {
        sneakers.setSoleMaterial("Plastic");
        assertEquals("Plastic",sneakers.getSoleMaterial());
    }

}