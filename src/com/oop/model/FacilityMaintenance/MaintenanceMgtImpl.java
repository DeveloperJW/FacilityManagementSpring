package com.oop.model.FacilityMaintenance;

//import com.oop.view.Main;

import java.util.ArrayList;

public class MaintenanceMgtImpl implements MaintenanceMgt {

    private ArrayList<Maintenance> maintenances=new ArrayList<Maintenance>();


    public MaintenanceMgtImpl(){
        //default constructor
    }

    public ArrayList<Maintenance> getMaintenances() {
        return maintenances;
    }

    public void setMaintenances(ArrayList<Maintenance> maintenances) {
        this.maintenances = maintenances;
    }

    public void listMaintenance(){
        for (Maintenance maint: maintenances){
            System.out.println(maint);
        }
    }

    public void listMaintenanceRequests(){
        for (Maintenance maintenance:maintenances){
            System.out.println(maintenance.getMaintenanceRequest());
        }
    }

    public void scheduleMaintenance(Maintenance newM){
        maintenances.add(newM);
        System.out.println("New Maintenance is scheduled. ");
    }

    public void addMaintenance(Maintenance newM){
        maintenances.add(newM);
    }

    public void finishMaintenance(Maintenance finishedM){
        if (maintenances.contains(finishedM)){
            maintenances.remove(finishedM);
            System.out.println("The maintenance is removed from todo list and added to done list. ");
        }
        else{
            System.out.println("Error. Please check your entry.");
        }
    }

    public void listFacilityProblems(){
        for (Maintenance maintenance: maintenances){
            System.out.println(maintenance.getFacilityProblem());
        }
    }



}
