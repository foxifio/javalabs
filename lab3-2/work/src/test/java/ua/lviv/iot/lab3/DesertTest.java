package ua.lviv.iot.lab3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DesertTest {
    private Desert desert;

    @BeforeEach
    void setUp() {
        desert = new Desert("Sheriff",Type.DEMI,Brand.GUCCI,Size.INT_40,
                "Black",3000,"Leather","Rubber");
    }

    @Test
    void getSoleMaterial() {
        assertEquals("Rubber",desert.getSoleMaterial());
    }

    @Test
    void setSoleMaterial() {
        desert.setSoleMaterial("Rubber");
        assertEquals("Rubber",desert.getSoleMaterial());
    }
}