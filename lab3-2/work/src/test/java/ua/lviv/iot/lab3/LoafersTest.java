package ua.lviv.iot.lab3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoafersTest {
    private Loafers loafers;

    @BeforeEach
    void setUp() {
        loafers = new Loafers("Mark I", Type.SUMMER, Brand.GUCCI, Size.INT_42, "Black",
                4500, "Leather", "Leather", "Rubber");
    }

    @Test
    void getSoleMaterial() {
        assertEquals("Rubber",loafers.getSoleMaterial());
    }

    @Test
    void setSoleMaterial() {
    loafers.setSoleMaterial("Rubber");
        assertEquals("Rubber",loafers.getSoleMaterial());
    }
}