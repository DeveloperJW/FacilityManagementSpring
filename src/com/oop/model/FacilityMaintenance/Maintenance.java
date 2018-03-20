package com.oop.model.FacilityMaintenance;

import java.util.Date;

public interface Maintenance {
    //methods
    public String getMaintenanceId();

    public void setMaintenanceId(String newMaintId);

    public String getFacilityId();

    public void setFacilityId(String newBuildingId);

    public String getProblemType();

    public void setProblemType(String newProblemType);

    public String getWorkerName();

    public void setWorkerName(String newWorkerName);

    public String getWorkerContactNum();

    public void setWorkerContactNum(String newNumber);

    public Date getStartDateTime() ;
    public void setStartDateTime(Date newStartDate);

    public Date getEndDateTime();

    public void setEndDateTime(Date newEndDate);

    public long getTimeDurationInHour(Date start, Date end);

    public MaintenanceRequest getRequest();

    public String toString();
}
