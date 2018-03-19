package com.oop.view;

import com.oop.model.Facility.*;
import com.oop.model.FacilityMaintenance.*;
import com.oop.model.FacilityUse.*;
import com.oop.model.Service.FacilityService;
import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class FacilityMaintClient {
    public static void main(String args[]) throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/app-context.xml");
        System.out.println("********** Application(FacilityMaintClient) Context instantiated! **********");
        //Spring to inject the right object implementation in FacilityService for facility using Setter Injection
        //Also, bootstrapping the FacilityService instantiation using factory.
        //FacilityService facilityService = (FacilityService) context.getBean("facilityService");
        //Facility facility = facilityService.getFacility();


    }
}