package com.oop.view;

import com.oop.model.Facility.*;
import com.oop.model.FacilityMaintenance.*;
import com.oop.model.FacilityUse.*;
import com.oop.model.Service.CustomerService;
import com.oop.model.Service.FacilityService;
import com.oop.model.Service.MaintenanceService;
import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.SimpleDateFormat;
import java.util.Date;


public class FacilityMaintClient {
    public static void main(String args[]) throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/app-context.xml");
        System.out.println("********** Application(FacilityMaintClient) Context instantiated! **********");
        //Spring to inject the right object implementation in FacilityService for facility using Setter Injection
        //Also, bootstrapping the FacilityService instantiation using factory.
        CustomerService customerService=(CustomerService) context.getBean("customerService");
        Customer customer=customerService.getCustomer();
        customer.setCustomerId("Cust-1");
        customer.setFirstName("Zhen");
        customer.setLastName("Hou");
        customer.setContactNumber("812-333-6666");
        customer.setAddress("1000 Escalon Ave, Sunnyvale, CA, 94085");
        customer.setSsn("123-45-6789");
        //next, set up second customer
        Customer customer2=customerService.getCustomer();
        customer2.setCustomerId("Cust-2");
        customer2.setFirstName("Ning");
        customer2.setLastName("Kang");
        customer2.setContactNumber("812-666-9999");
        customer2.setAddress("2000 Chicago Ave, Chicago, IL, 60610");
        customer2.setSsn("222-11-33333");

        //now set up facility examples
        //assign some facility examples
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
        //System.out.println(facility.getFacilityInformation());

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

        //Spring to inject the right object implementation for Maintenance using Setter Injection
        //Also, bootstrapping the InspectionMgt using factory.

        //set up facility problem example
        FacilityProblem facilityProblem=(FacilityProblem) context.getBean("facilityProblem");
        facilityProblem.setMaintProblemId("Problem-1");
        facilityProblem.setMaintProblemType("Electric Issue");
        facilityProblem.setFixedOrNot(false);
        facilityProblem.setMaintProblemDetails("The power is off due to electric issue. ");

        //set up second facility problem example
        FacilityProblem facilityProblem2=(FacilityProblem) context.getBean("facilityProblem");
        facilityProblem2.setMaintProblemId("Problem-2");
        facilityProblem2.setMaintProblemType("Blackboard Issue");
        facilityProblem2.setFixedOrNot(false);
        facilityProblem2.setMaintProblemDetails("The blackboard is broken. Need to be fixed ASAP. ");

        //set up Maintenance request
        MaintenanceRequest maintenanceRequest=(MaintenanceRequest) context.getBean("maintenanceRequest");
        maintenanceRequest.setCustomer(customer);
        maintenanceRequest.setFacility(facility);
        maintenanceRequest.setReqId("Req-1");
        /** simpleDateFormat*/
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date reqDate=sdf.parse("09/03/2018");
        maintenanceRequest.setReqDate(reqDate);

        //set up second maintenance request
        MaintenanceRequest maintenanceRequest2=(MaintenanceRequest) context.getBean("maintenanceRequest");
        maintenanceRequest2.setCustomer(customer2);
        maintenanceRequest2.setFacility(facility2);
        maintenanceRequest2.setReqId("Req-2");
        Date reqDate2=sdf.parse("13/03/2018");
        maintenanceRequest2.setReqDate(reqDate2);


        //set up the first example Maintenance
        Maintenance maintenance=(Maintenance) context.getBean("maintenance");
        //MaintenanceImpl maintenance=new MaintenanceImpl();
        maintenance.setWorkerName("Mike Rose");
        maintenance.setMaintenanceId("Maintenance-1");
        Date d_s = sdf.parse("10/03/2018");
        Date d_e=sdf.parse("12/03/2018");
        maintenance.setStartDateTime(d_s);
        maintenance.setEndDateTime(d_e);
        maintenance.setFacilityProblem(facilityProblem);
        //might change from String to Facility Problem

        //set up the second example Maintenance
        Maintenance maintenance2=(Maintenance) context.getBean("maintenance");
        //MaintenanceImpl maintenance2=new MaintenanceImpl();
        maintenance2.setFacilityId(facility.getFacilityId());
        maintenance2.setWorkerName("Mike Rose");
        maintenance2.setMaintenanceId("Maintenance-2");
        Date d_s2 = sdf.parse("15/03/2018");
        Date d_e2=sdf.parse("17/03/2018");
        maintenance2.setStartDateTime(d_s2);
        maintenance2.setEndDateTime(d_e2);
        maintenance2.setFacilityProblem(facilityProblem2);

        //set up the first example Maintenance cost
        MaintenanceCost maintenanceCost=(MaintenanceCost) context.getBean("maintenanceCost");
        maintenanceCost.setMaterialCost(100);
        maintenanceCost.setLaborCost(maintenanceCost.getLaborCost(maintenance.getStartDateTime(),maintenance.getEndDateTime()));


        //set up the second example Maintenance cost
        MaintenanceCost maintenanceCost2=(MaintenanceCost) context.getBean("maintenanceCost");
        maintenanceCost2.setMaterialCost(1000);
        maintenanceCost2.setLaborCost(maintenanceCost2.getLaborCost(maintenance2.getStartDateTime(),maintenance2.getEndDateTime()));

        //assign example maintenanceCost to example maintenance
        maintenance.setMaintenanceCost(maintenanceCost);
        maintenance2.setMaintenanceCost(maintenanceCost2);

        //
        System.out.println(maintenance.toString());
        System.out.println(maintenance2.toString());

        //scheduleMaintenance() test
        MaintenanceMgt maintenanceMgt=(MaintenanceMgt) context.getBean("maintenanceMgt");
        maintenanceMgt.scheduleMaintenance(maintenance);
        maintenanceMgt.scheduleMaintenance(maintenance2);
        //list FacilityProblems
        maintenanceMgt.listFacilityProblems();
        //list Maintenance
        maintenanceMgt.listMaintenance();
        //list MaintenanceRequests
        maintenanceMgt.listMaintenanceRequests();
        //calc downtime
        System.out.println("The downtime of the facility is: ");
        System.out.println(maintenance.calcDownTimeForFacility());
        //calcMiantenanceCostForFacility
        System.out.println("The Miantenance Cost is: ");
        System.out.println(maintenance.calcMaintenanceCostForFacility());
        //calc rate
        System.out.println("The problem rate per hour is: ");
        System.out.println(maintenance.calcProblemRateForFacility());

    }
}