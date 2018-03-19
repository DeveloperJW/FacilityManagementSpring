package com.oop.model.Facility;

import java.util.ArrayList;

public interface FacilityManagement {
    public ArrayList<Facility> getFacilityArrayList();
    public void setFacilityArrayList(ArrayList<Facility> someList);
    //added manager classes and methods
    public void addFacility(Facility someFacility);
    public void removeFacility(Facility facilityToRemove);
    public void listFacilities();
    public int requestAvailableCapacity();
    public String listFacilityDetail();
}

