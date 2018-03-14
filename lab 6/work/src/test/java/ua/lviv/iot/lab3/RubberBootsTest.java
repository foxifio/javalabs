package ua.lviv.iot.lab3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RubberBootsTest {
    private RubberBoots rubberBoots;

    @BeforeEach
    void setUp() {
        rubberBoots = new RubberBoots("Duck",Type.DEMI,Brand.DUNLOP,Size.INT_39,
                "Green",700,"Rubber","Plastic");
    }

    @Test
    void getSoleMaterial() {
        assertEquals("Plastic",rubberBoots.getSoleMaterial());
    }

    @Test
    void setSoleMaterial() {
        rubberBoots.setSoleMaterial("Plastic");
        assertEquals("Plastic",rubberBoots.getSoleMaterial());
    }

}