package com.oop.model.FacilityMaintenance;

//import com.oop.view.Main;

import java.util.ArrayList;

public interface MaintenanceMgt {

    public ArrayList<Maintenance> getMaintenances();
    public ArrayList<MaintenanceRequest> listMaintRequests();

    public void listMaintenance();

    public Object listMaintenanceRequests();

    public void scheduleMaintenance(MaintenanceRequest newReq,FacilityProblem newPro);

    public void addMaintenance(Maintenance newM);

    public void finishMaintenance(Maintenance finishedM);

    public double calcMaintenanceCostForFacility(Maintenance newM);

    public double calcProblemRateForFacility(Maintenance newM);

    public double calcDownTimeForFacility(Maintenance newM);

    public Object listFacilityProblems();
}
