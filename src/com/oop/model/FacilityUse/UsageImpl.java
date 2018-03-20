package com.oop.model.FacilityUse;

import com.oop.model.Facility.Facility;
import com.oop.model.Facility.FacilityAddress;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class UsageImpl implements Usage {
    private Facility facility;
    private ArrayList<Facility> facilities_In_Use=new ArrayList<Facility>();
    private Customer customer;
    private FacilitySchedule facilitySchedule;
    private static double usageHourlyRate=500;

    public UsageImpl(){
        //default constructor
    }

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }

    public ArrayList<Facility> getFacilities_In_Use() {
        return facilities_In_Use;
    }

    public void setFacilities_In_Use(ArrayList<Facility> facilities_In_Use) {
        this.facilities_In_Use = facilities_In_Use;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public FacilitySchedule getFacilitySchedule() {
        return facilitySchedule;
    }

    public void setFacilitySchedule(FacilitySchedule facilitySchedule) {
        this.facilitySchedule = facilitySchedule;
    }


    public void assignFacilityToUse(Facility facility){
        facilities_In_Use.add(facility);
        System.out.println("New reservation is assigned.");
    }

    public void vacateFacility(Facility facility){
        facilities_In_Use.remove(facility);
        System.out.println("The facility is been vacated.");
    }


    public void listActualUsage(){
        for (Facility facility: facilities_In_Use){
            System.out.println("Facility: "+facility);
        }
    }

    public String calcUsageRate(Date s, Date e){
        //long start=facilitySchedule.getStartDateTime().getTime();
        long start=s.getTime();
        long end=e.getTime();
        //long end=facilitySchedule.getEndDateTime().getTime();
        double durationInHours=(end-start)/(60*60*1000)%24;
        double rate=durationInHours*usageHourlyRate;
        String result="The usage rate is: "+rate+" dollars for "+durationInHours+" hours. ";
        return result;
    }

    //isInUseDuringInterval()
    public boolean isInUseDuringInterval(Date date, int duration){
        Date startTime= facilitySchedule.getStartDateTime();
        Date endTime=facilitySchedule.getEndDateTime();
        Calendar calendar=Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.HOUR,duration);
        Date estResevedEndTime=new Date();
        estResevedEndTime=calendar.getTime();

        boolean result=false;
        //Done: check the logic of the scheduling
        result=(startTime.compareTo(date)*endTime.compareTo(estResevedEndTime)<0);
        return result;
    }

    public String toString(){
        String result="";
        result="The information about Usage is as followings:"+"\n";
        result+="Usage about Facility: "+facility.getFacilityName()+"\n";
        result+="Is reserved by Customer: "+customer.getLastName()+"\n";
        result+="Is reserved between "+facilitySchedule.getStartDateTime()+" and "+facilitySchedule.getEndDateTime()+"\n";
        return result;
    }

}
