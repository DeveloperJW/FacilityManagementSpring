package com.oop.view;

import com.oop.model.Facility.*;
import com.oop.model.FacilityMaintenance.*;
import com.oop.model.FacilityUse.*;
import com.oop.model.Service.CustomerService;
import com.oop.model.Service.FacilityService;
import javafx.application.Application;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.text.*;
import java.util.Date;


public class FacilityUseClient {
    public static void main(String args[]) throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/app-context.xml");
        System.out.println("********** Application(FacilityUseClient) Context instantiated! **********");
        System.out.println("        Test Inspections first      "+"\n");
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

        //Spring to inject the right object implementation for inspection using Setter Injection
        //Also, bootstrapping the InspectionMgt using factory.
        Inspection inspection=(Inspection) context.getBean("inspection");
        inspection.setInspectionId("Inspect-1");
        inspection.setInspectorName("Ray Allen");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date d = sdf.parse("21/12/2017");
        inspection.setInspectionDate(d);
        inspection.setInspectionResult("Inspection clear: There is no problem or issue with the facility. ");

        //set up the second example inspection
        Inspection inspection2=(Inspection) context.getBean("inspection");
        inspection2.setInspectionId("Inspect-2");
        inspection2.setInspectorName("Jeremy Lin");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
        Date d2 = sdf2.parse("15/03/2018");
        inspection2.setInspectionDate(d2);
        inspection2.setInspectionResult("Inspection Attention: The facility needs some upgrades. ");

        //add the above two inspections to inspectionMgt
        InspectionMgt inspectionMgt=(InspectionMgt) context.getBean("inspectionMgt");
        inspectionMgt.addInspection(inspection);
        inspectionMgt.addInspection(inspection2);
        //Call listInspections method to check the result
        inspectionMgt.listInspections();

        //Now we need to test if Facility Schedule, Usage and etc. works
        System.out.println("*****************************************************************");
        System.out.println("            test on assignFacilityToUse");
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
        //call getFacilityInformation and check if information is added correctly.
        //System.out.println(facility2.getFacilityInformation());
        System.out.println("*****************************************************************");
        System.out.println("            set up example FacilitySchedule        ");
        FacilitySchedule facilitySchedule=(FacilitySchedule) context.getBean("facilitySchedule");
        facilitySchedule.setCustomerId(customer.getCustomerId());
        facilitySchedule.setFacilityId(facility.getFacilityId());
        SimpleDateFormat sdf_s = new SimpleDateFormat("dd/MM/yyyy");
        Date d_s = sdf_s.parse("15/10/2017");
        Date d_e=sdf_s.parse("17/10/2017");
        facilitySchedule.setStartDateTime(d_s);
        facilitySchedule.setEndDateTime(d_e);
        //now set up the second example
        FacilitySchedule facilitySchedule2=(FacilitySchedule) context.getBean("facilitySchedule");
        facilitySchedule2.setCustomerId(customer2.getCustomerId());
        facilitySchedule2.setFacilityId(facility2.getFacilityId());
        Date d_s2 = sdf.parse("1/1/2018");
        Date d_e2=sdf.parse("3/1/2017");
        facilitySchedule2.setStartDateTime(d_s2);
        facilitySchedule2.setEndDateTime(d_e2);
        //now we need to set up usage object
        Usage usage=(Usage) context.getBean("usage");
        usage.assignFacilityToUse(facility);
        usage.setCustomer(customer);
        usage.setFacility(facility);
        usage.setFacilitySchedule(facilitySchedule);
        Date d_during=sdf.parse("16/10/2017");
        System.out.println("What is the cost related to this facility schedule?");
        System.out.println("The rate of using this facility is: "+usage.calcUsageRate(facilitySchedule.getStartDateTime(),facilitySchedule.getEndDateTime()));
        System.out.println("Is the facility being used on Oct 16th, 2017 with duration of 1 hour?");
        System.out.println("The answer is :"+usage.isInUseDuringInterval(d_during,1));
        //set up second usage object
        Usage usage2=(Usage) context.getBean("usage");
        usage2.assignFacilityToUse(facility2);
        usage2.setCustomer(customer2);
        usage2.setFacility(facility2);
        usage2.setFacilitySchedule(facilitySchedule2);
        System.out.println("What is the cost related to this facility schedule?");
        System.out.println("The rate of using this facility is: "+usage2.calcUsageRate(facilitySchedule2.getStartDateTime(),facilitySchedule2.getEndDateTime()));
        Date d_during_2=sdf.parse("16/10/2018");
        System.out.println("Is the facility being used on Oct 16th, 2018 with duration of 1 hour?");
        System.out.println("The answer is :"+usage.isInUseDuringInterval(d_during_2,1));
        System.out.println("*****************************************************************");
        System.out.println("            Now we need to test listActualUsage with usageMgt       ");
        UsageMgt usageMgt=(UsageMgt) context.getBean("usageMgt");
        usageMgt.addUsage(usage);
        usageMgt.addUsage(usage2);
        usageMgt.listActualUsage();

    }
}