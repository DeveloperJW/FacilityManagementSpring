package com.oop.view;

import static org.junit.jupiter.api.Assertions.*;

import com.oop.model.Facility.Facility;
import com.oop.model.Facility.FacilityAddress;

class FacilityClientTest {
    protected FacilityClient facilityClient;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        facilityClient=new FacilityClient();

    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        facilityClient=null;
    }


    @org.junit.jupiter.api.Test
    void main() {
    }

    @org.junit.jupiter.api.Test
    void addNewFacilityTest() {
    }

    @org.junit.jupiter.api.Test
    void addNewDetailTest() {
    }

    @org.junit.jupiter.api.Test
    void getCapacityTest() {
        Facility facility=new Facility();
        facility.setCapacity(300);
        assertEquals(300, facility.getCapacity());
    }
}