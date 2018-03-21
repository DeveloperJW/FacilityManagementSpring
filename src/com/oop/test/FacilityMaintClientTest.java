package com.oop.test;

import com.oop.model.FacilityMaintenance.FacilityProblemImpl;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class FacilityMaintClientTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void facilityProblemTest(){
        FacilityProblemImpl facilityProblem=new FacilityProblemImpl();
        facilityProblem.setMaintProblemDetails("This is test.");
        assertEquals("This is test.",facilityProblem.getMaintProblemDetails());
    }

}