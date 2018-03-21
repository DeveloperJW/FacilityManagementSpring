package com.oop.model.FacilityMaintenance;

import com.oop.model.Facility.Facility;

import java.util.Date;

public class MaintenanceCostImpl implements MaintenanceCost{
    private String maintenanceReqId;
    private double materialCost;
    private static double laborHourlyRate=25;
    private double laborCost;
    private boolean paidOrNot;

    public MaintenanceCostImpl(){

    }

    //methods


    public String getMaintenanceReqId(){
        return maintenanceReqId;
    }

    public void setMaintenanceReqId(String newReqId){
        this.maintenanceReqId=newReqId;
    }

    public double getMaterialCost(){
        return materialCost;
    }

    public void setMaterialCost(double newMaterialCost){
        this.materialCost=newMaterialCost;
    }

    /**
     * getLaborCost() method
     * @return the total labor cost based on maintenance time duration
     */
    public double getLaborCost(Date start, Date end){
        long TimeDuration=(end.getTime()-start.getTime())/(60*60*1000);
        return TimeDuration*laborHourlyRate;
    }

    public void setLaborCost(double newLaborCost){
        this.laborCost=newLaborCost;
    }

    public double getTotalCost(){
        return materialCost+laborCost;
    }

    public boolean getPaidOrNot(){
        return paidOrNot;
    }

    public void setPaidOrNot(Boolean newPaymentStatus){
        this.paidOrNot=newPaymentStatus;
    }

}
