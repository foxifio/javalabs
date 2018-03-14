package ua.lviv.iot.lab3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SnowBootsTest {
    private SnowBoots snowBoots;

    @BeforeEach
    void setUp() {
        snowBoots = new SnowBoots("Wolf", Type.WINTER, Brand.TIMBERLAND, Size.INT_40,
                "Grey", 4500, "Leather", 20);
    }

    @Test
    void getHeight() {
        assertEquals(20,snowBoots.getHeight());
    }

    @Test
    void setHeight() {
        snowBoots.setHeight(20);
        assertEquals(20,snowBoots.getHeight());
    }


}