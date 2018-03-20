package com.oop.model.FacilityUse;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FacilityScheduleImpl implements FacilitySchedule{
    private String scheduleId;
    private String facilityId;
    private Date startDateTime;
    private Date endDateTime;
    private String customerId;
    private String usageStatus="Open";
    private ArrayList<Usage> usageList;

    public FacilityScheduleImpl(){
        //default constructor
    }

    //methods
    public String getScheduleId(){
        return scheduleId;
    }

    public void setScheduleId(String newSId){
        this.scheduleId=newSId;
    }

    public String getFacilityId(){
        return facilityId;
    }

    public void setFacilityId(String newUnitId){
        this.facilityId=newUnitId;
    }

    public String getCustomerId(){
        return customerId;
    }

    public void setCustomerId(String newCustId){
        this.customerId=newCustId;
    }

    public Date getStartDateTime(){
        return startDateTime;
    }

    public void setStartDateTime(Date newStartDate){
        this.startDateTime=newStartDate;
    }

    public Date getEndDateTime(){
        return endDateTime;
    }

    public void setEndDateTime(Date newEndDate){
        this.endDateTime=newEndDate;
    }

    public String getUsageStatus() {
        return usageStatus;
    }

    public void setUsageStatus(String usageStatus) {
        this.usageStatus = usageStatus;
    }

    //assignFacilityToUse?
    public void assignFacilityToUse(Usage usage){
        if (usageStatus=="Open"){
            usageList.add(usage);
        }
        else{
            throw new IllegalStateException("The facility is in inspection or been occupied now.");
        }
    }



}
