package com.oop.model.FacilityMaintenance;

import java.util.Date;

public interface Maintenance {

    public String getMaintenanceId();

    public void setMaintenanceId(String newMaintId);

    public String getFacilityId();

    public void setFacilityId(String newBuildingId);

    public String getWorkerName();

    public void setWorkerName(String newWorkerName);

    public String getWorkerContactNum();

    public void setWorkerContactNum(String newNumber);

    public Date getStartDateTime();

    public void setStartDateTime(Date newStartDate);

    public Date getEndDateTime();

    public void setEndDateTime(Date newEndDate);

    public MaintenanceRequest getMaintenanceRequest();

    public void setMaintenanceRequest(MaintenanceRequest maintenanceRequest);

    public MaintenanceCost getMaintenanceCost();

    public void setMaintenanceCost(MaintenanceCost maintenanceCost);

    public FacilityProblem getFacilityProblem();

    public void setFacilityProblem(FacilityProblem facilityProblem);

    public long getTimeDurationInHour(Date start, Date end);

    public double calcDownTimeForFacility();

    public double calcMaintenanceCostForFacility();

    public double calcProblemRateForFacility();

    public String toString();
}
