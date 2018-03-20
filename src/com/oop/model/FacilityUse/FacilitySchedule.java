package com.oop.model.FacilityUse;

import java.util.Date;

public interface FacilitySchedule {

    //methods
    public String getScheduleId();
    public void setScheduleId(String newSId);
    public String getFacilityId();
    public void setFacilityId(String newUnitId);
    public String getCustomerId();
    public void setCustomerId(String newCustId);
    public Date getStartDateTime();
    public void setStartDateTime(Date newStartDate);
    public Date getEndDateTime();
    public void setEndDateTime(Date newEndDate);
}
