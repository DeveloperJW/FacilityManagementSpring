package com.oop.test;

import com.oop.model.FacilityUse.Customer;
import com.oop.model.FacilityUse.CustomerImpl;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class FacilityUseClientTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
    @org.junit.jupiter.api.Test
    void customerTest(){
        CustomerImpl customer=new CustomerImpl();
        customer.setCustomerId("Cust-1");
        customer.setFirstName("Zhen");
        customer.setLastName("Hou");
        customer.setContactNumber("812-333-6666");
        customer.setAddress("1000 Escalon Ave, Sunnyvale, CA, 94085");
        customer.setSsn("123-45-6789");
        assertEquals("Zhen",customer.getFirstName());
    }
}