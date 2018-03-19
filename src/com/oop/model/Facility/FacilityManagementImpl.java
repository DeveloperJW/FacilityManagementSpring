package com.oop.model.Facility;

import java.util.ArrayList;

public class FacilityManagementImpl implements FacilityManagement {
    ArrayList<Facility> facilityArrayList;

    public FacilityManagementImpl(){
        //default constructor
        this.facilityArrayList=new ArrayList<Facility>();
    }

    public ArrayList<Facility> getFacilityArrayList() {
        return facilityArrayList;
    }

    public void setFacilityArrayList(ArrayList<Facility> someList){
        this.facilityArrayList=someList;
    }

    //added manager classes and methods
    public void addFacility(Facility someFacility){
        this.facilityArrayList.add(someFacility);
        System.out.println("New Facility Added. ");
    }
    public void removeFacility(Facility facilityToRemove){
        if (this.facilityArrayList.contains(facilityToRemove)){
            this.facilityArrayList.remove(facilityToRemove);
            System.out.println("The Facility is removed. ");
        }else{
            System.out.println("The Facility you entered is not in the list. Please double check your entry.");
        }
    }

    public void listFacilities(){
        for (Facility facility: facilityArrayList){
            System.out.println(facility);
        }
    }

    public int requestAvailableCapacity(){
        int total=0;
        for (Facility facility: facilityArrayList){
            total+=facility.getCapacity();
        }
        return total;
    }


    public String listFacilityDetail(){
        String result="The details about the facility is as followings: "+"\n";
        for (Facility facility: facilityArrayList){
            result+=facility.getFacilityDetail()+"\n";
        }
        return result;
    }

}
