package com.oop.model.FacilityUse;

import java.util.ArrayList;

public interface InspectionMgt {
    public ArrayList<Inspection> getInspectionsList();
    public void setInspectionsList(ArrayList<Inspection> inspectionsList);
    public void addInspection(Inspection inspection);
    public void listInspections();
}
