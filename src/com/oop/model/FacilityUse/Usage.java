package com.oop.model.FacilityUse;

import com.oop.model.Facility.Facility;
import com.oop.model.Facility.FacilityAddress;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public interface Usage {

    public Facility getFacility() ;

    public void setFacility(Facility facility) ;

    public ArrayList<Facility> getFacilities_In_Use() ;
    public void setFacilities_In_Use(ArrayList<Facility> facilities_In_Use) ;

    public Customer getCustomer() ;
    public void setCustomer(Customer customer) ;
    public FacilitySchedule getFacilitySchedule() ;
    public void setFacilitySchedule(FacilitySchedule facilitySchedule) ;

    //isInUseDuringInterval()
    public boolean isInUseDuringInterval(Date date, int duration);

    public void assignFacilityToUse(Facility facility);

    public void vacateFacility(Facility facility);

    public void listActualUsage();

    public String calcUsageRate(Date s, Date e);

    public String toString();
}
