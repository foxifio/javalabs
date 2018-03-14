package ua.lviv.iot.lab3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static ua.lviv.iot.lab3.Size.INT_40;

class CustomerTest {
    private Customer customer;

    @BeforeEach
    void setUp() {
        customer = new Customer("Jaden","Smith",Gender.MALE,INT_40,23000);
    }

    @Test
    void getName() {
        assertEquals("Jaden",customer.getName());
    }

    @Test
    void setName() {
        customer.setName("Jaden");
        assertEquals("Jaden",customer.getName());
    }

    @Test
    void getSize() {
        assertEquals(INT_40,customer.getSize());

    }

    @Test
    void setSize() {
        customer.setSize(INT_40);
        assertEquals(INT_40,customer.getSize());
    }
}