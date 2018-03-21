package com.oop.model.FacilityMaintenance;

//import com.oop.view.Main;

import java.util.ArrayList;

public interface MaintenanceMgt {

    public ArrayList<Maintenance> getMaintenances();

    public void setMaintenances(ArrayList<Maintenance> maintenances);

    public void listMaintenance();

    public void listMaintenanceRequests();

    public void scheduleMaintenance(Maintenance newM);

    public void addMaintenance(Maintenance newM);

    public void finishMaintenance(Maintenance finishedM);

    public void listFacilityProblems();
}
