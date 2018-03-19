package com.oop.model.Service;

import com.oop.model.Facility.Facility;

import java.util.ArrayList;

public class FacilityManagementService {
    private ArrayList<Facility> facilityArrayList;

    public ArrayList<Facility> getFacilityArrayList() {
        return facilityArrayList;
    }

    public void setFacilityArrayList(ArrayList<Facility> facilityArrayList) {
        this.facilityArrayList = facilityArrayList;
    }
}
