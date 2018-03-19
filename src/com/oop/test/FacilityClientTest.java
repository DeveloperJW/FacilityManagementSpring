package com.oop.test;

import com.oop.model.Facility.FacilityImpl;
import com.oop.model.Facility.FacilityManagementImpl;
import com.oop.view.FacilityClient;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class FacilityClientTest {
    protected FacilityClient facilityClient;

    @BeforeEach
    void setUp() {
        facilityClient=new FacilityClient();
    }

    @AfterEach
    void tearDown() {
        facilityClient=null;
    }

    @org.junit.jupiter.api.Test
    void getCapacityTest(){
        FacilityImpl facility=new FacilityImpl();
        facility.setCapacity(300);
        assertEquals(300,facility.getCapacity());

    }

    @org.junit.jupiter.api.Test
    void addFacilityDetailTest(){
        FacilityImpl facility=new FacilityImpl();
        facility.addFacilityDetail("This is a test string. ");
        assertTrue(facility.getFacilityDetail()!="");
    }

    @org.junit.jupiter.api.Test
    void removeFacilityTest(){
        FacilityManagementImpl facilityManagement=new FacilityManagementImpl();
        FacilityImpl facility=new FacilityImpl();
        facilityManagement.addFacility(facility);
        assertTrue(facilityManagement.getFacilityArrayList().size()==1);
        facilityManagement.removeFacility(facility);
        assertTrue(facilityManagement.getFacilityArrayList().size()==0);
    }
}