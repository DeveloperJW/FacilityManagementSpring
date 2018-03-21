package com.oop.model.FacilityMaintenance;

import com.oop.model.Facility.Facility;

import java.util.Date;

public interface MaintenanceCost{

    //methods

    public String getMaintenanceReqId();

    public void setMaintenanceReqId(String newReqId);

    public double getMaterialCost();

    public void setMaterialCost(double newMaterialCost);

    public double getLaborCost(Date start, Date end);

    public void setLaborCost(double newLaborCost);

    public double getTotalCost();

    public boolean getPaidOrNot();

    public void setPaidOrNot(Boolean newPaymentStatus);

}
