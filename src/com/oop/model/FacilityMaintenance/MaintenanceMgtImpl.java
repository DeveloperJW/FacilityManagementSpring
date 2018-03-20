package com.oop.model.FacilityMaintenance;

//import com.oop.view.Main;

import java.util.ArrayList;

public class MaintenanceMgtImpl {
    private ArrayList<Maintenance> maintenances=new ArrayList<Maintenance>();
    private ArrayList<MaintenanceRequest> maintReqList=new ArrayList<MaintenanceRequest>();
    private ArrayList<Maintenance> maintDoneList=new ArrayList<Maintenance>();
    private ArrayList<FacilityProblem> problemsList=new ArrayList<FacilityProblem>();


    public MaintenanceMgtImpl(){
        //default constructor
    }

    public ArrayList<Maintenance> getMaintenances() {
        return maintenances;
    }

    public ArrayList<MaintenanceRequest> listMaintRequests(){
        return maintReqList;
    }

    public void listMaintenance(){
        for (Maintenance maint: maintenances){
            System.out.println(maint);
        }
    }

    public Object listMaintenanceRequests(){
        return maintReqList;
    }

    public void scheduleMaintenance(MaintenanceRequest newReq,FacilityProblem newPro){
        maintReqList.add(newReq);
        //when new maintenance is scheduled, we also need to add facility problem to list
        problemsList.add(newPro);
        System.out.println("The maintenance request is saved. ");
    }

    public void addMaintenance(Maintenance newM){
        maintenances.add(newM);
    }

    public void finishMaintenance(Maintenance finishedM){
        if (maintenances.contains(finishedM)){
            maintenances.remove(finishedM);
            maintDoneList.add(finishedM);
            System.out.println("The maintenance is removed from todo list and added to done list. ");
        }
        else{
            System.out.println("Error. Please check your entry.");
        }
    }


    public double calcMaintenanceCostForFacility(MaintenanceCost newMCost){
        double costAmt=newMCost.getTotalCost();
        return costAmt;
    }

    public double calcProblemRateForFacility(MaintenanceCost newMCost){
        double rate=calcMaintenanceCostForFacility(newMCost)/calcDownTimeForFacility(newMCost);
        return rate;

    }

    public double calcDownTimeForFacility(Maintenance newM){
        return newM.getTimeDurationInHour(newM.getStartDateTime(),newM.getEndDateTime());
    }

    public Object listFacilityProblems(){
        return problemsList;
    }


}
