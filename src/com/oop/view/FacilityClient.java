package com.oop.view;

import com.oop.model.Facility.Facility;
import com.oop.model.Facility.FacilityAddress;
import com.oop.model.Facility.FacilityManagement;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class FacilityClient {
    public static void main(String args[]) throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/app-context.xml");
        System.out.println("********** Application Context instantiated! **********");
        //Spring to inject the right object implementation in FacilityService for facility using Setter Injection
        //Also, bootstrapping the FacilityService instantiation using factory.
        //FacilityService facilityService = (FacilityService) context.getBean("facilityService");
        //Facility facility = facilityService.getFacility();
        Facility facility=(Facility) context.getBean("facility");
        facility.setFacilityId("1");
        facility.setFacilityName("Loyola Hall");
        facility.setCapacity(100);
        facility.addFacilityDetail("This is a resident hall for students. The name of the facility is Loyola Hall.");
        facility.setInUse(false);

        //Spring to inject the right object implementation in Facility object for Facility Address using Setter Injection
        FacilityAddress facilityAddress = facility.getFacilityAddress();

        facilityAddress.setAddressId("1");
        facilityAddress.setStreet("1234 W Loyola Hall");
        facilityAddress.setUnit("Unit 111");
        facilityAddress.setCity("Chicago");
        facilityAddress.setState("IL");
        facilityAddress.setZip("606026");
        //call getFacilityInformation and check if information is added correctly.
        System.out.println(facility.getFacilityInformation());

        //set up for 2nd facility and facility address
        //FacilityService facilityService2 = (FacilityService) context.getBean("facilityService");
        Facility facility2 = (Facility) context.getBean("facility");
        facility2.setFacilityId("2");
        facility2.setFacilityName("Cuneo Hall");
        facility2.setCapacity(300);
        facility2.addFacilityDetail("This is a classroom building. The name of the facility is Cuneo Hall. ");
        facility2.setInUse(false);

        //Spring to inject the right object implementation in Facility object for Facility Address using Setter Injection
        FacilityAddress facilityAddress2 = facility2.getFacilityAddress();
        facilityAddress2.setAddressId("2");
        facilityAddress2.setStreet("5678 W Loyola Hall");
        facilityAddress2.setUnit("Unit 333");
        facilityAddress2.setCity("Chicago");
        facilityAddress2.setState("IL");
        facilityAddress2.setZip("606026");
        //call getFacilityInformation and check if information is added correctly.
        System.out.println(facility2.getFacilityInformation());

        //Bootstrapping the FacilityManagement instantiation using factory
        FacilityManagement facilityManagement = (FacilityManagement) context.getBean("facilityManagement");
        facilityManagement.addFacility(facility);
        facilityManagement.addFacility(facility2);

        //System.out.println(facilityManagement.listFacilityDetail());

        // Print out an order summary
        facilityManagement.listFacilities();

        //Now we need to test if add detail works
        System.out.println("*****************************************************************");
        facility2.addFacilityDetail("This building is under some construction now. ");
        System.out.println("After adding some details to Facility 2. The results are: ");
        facilityManagement.listFacilities();

        //now we need to test if remove works
        System.out.println("*****************************************************************");
        facilityManagement.removeFacility(facility);
        System.out.println("After removing the first facility, the results are as: ");
        facilityManagement.listFacilities();
    }
}