package ua.lviv.iot.lab3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlipFlopsTest {
    private FlipFlops flipFlops;

    @BeforeEach
    void setUp() {
        flipFlops = new FlipFlops("Sun",Type.SUMMER,Brand.PEAK,Size.INT_40,
                "Yellow",400,"Rubber","Rubber");
    }

    @Test
    void getSoleMaterial() {
        assertEquals("Rubber",flipFlops.getSoleMaterial());
    }

    @Test
    void setSoleMaterial() {
    flipFlops.setSoleMaterial("Rubber");
    assertEquals("Rubber",flipFlops.getSoleMaterial());
    }

}