package com.oop.model.FacilityMaintenance;

import com.oop.model.Facility.Facility;

import java.util.Date;

public interface MaintenanceCost extends Maintenance{

    //methods
    public String getMaintenanceReqId();

    public void setMaintenanceReqId(String newReqId);

    public double getMaterialCost();

    public void setMaterialCost(double newMaterialCost);

    /**
     * getLaborCost() method
     * @return the total labor cost based on maintenance time duration
     */
    public double getLaborCost();

    public void setLaborCost(double newLaborCost);

    public double getTotalCost();

    public boolean getPaidOrNot();

    public void setPaidOrNot(Boolean newPaymentStatus);

}
