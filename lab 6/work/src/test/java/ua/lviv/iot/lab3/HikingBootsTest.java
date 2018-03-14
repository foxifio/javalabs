package ua.lviv.iot.lab3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HikingBootsTest {
    private HikingBoots hikingBoots;

    @BeforeEach
    void setUp() {
        hikingBoots = new HikingBoots("DOT",Type.SPORT,Brand.TIMBERLAND,Size.INT_40,
                "Grey",3500,"Plastic","Metal");
    }

    @Test
    void getSoleMaterial() {
        assertEquals("Metal",hikingBoots.getSoleMaterial());
    }

    @Test
    void setSoleMaterial() {
        hikingBoots.setSoleMaterial("Metal");
        assertEquals("Metal",hikingBoots.getSoleMaterial());
    }
}