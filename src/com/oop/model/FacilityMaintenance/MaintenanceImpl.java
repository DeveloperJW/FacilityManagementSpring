package com.oop.model.FacilityMaintenance;

import java.util.Date;

public class MaintenanceImpl {
    private String maintenanceId;
    private String facilityId;
    private String workerName;
    private String workerContactNum;
    private Date startDateTime;
    private Date endDateTime;
    private MaintenanceRequest maintenanceRequest;
    private MaintenanceCost maintenanceCost;
    private FacilityProblem facilityProblem;

    public MaintenanceImpl(){
        //default constructor
    }
    //methods
    public String getMaintenanceId(){
        return maintenanceId;
    }

    public void setMaintenanceId(String newMaintId){
        this.maintenanceId=newMaintId;
    }

    public String getFacilityId(){
        return facilityId;
    }

    public void setFacilityId(String newBuildingId){
        this.facilityId=newBuildingId;
    }

    public String getWorkerName(){
        return workerName;
    }

    public void setWorkerName(String newWorkerName){
        this.workerName=newWorkerName;
    }

    public String getWorkerContactNum(){
        return workerContactNum;
    }

    public void setWorkerContactNum(String newNumber){
        this.workerContactNum=newNumber;
    }

    public Date getStartDateTime() {
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

    public MaintenanceRequest getMaintenanceRequest() {
        return maintenanceRequest;
    }

    public void setMaintenanceRequest(MaintenanceRequest maintenanceRequest) {
        this.maintenanceRequest = maintenanceRequest;
    }

    public MaintenanceCost getMaintenanceCost() {
        return maintenanceCost;
    }

    public void setMaintenanceCost(MaintenanceCost maintenanceCost) {
        this.maintenanceCost = maintenanceCost;
    }

    public FacilityProblem getFacilityProblem() {
        return facilityProblem;
    }

    public void setFacilityProblem(FacilityProblem facilityProblem) {
        this.facilityProblem = facilityProblem;
    }
    /**
     * Helper method takes startDate and endDate and return time duration in hours
     * @param start
     * @param end
     * @return
     */
    public long getTimeDurationInHour(Date start, Date end){
        return (end.getTime()-start.getTime())/(60*60*1000);
    }

    public double calcDownTimeForFacility(){
        double duration=1;
        duration=getTimeDurationInHour(startDateTime,endDateTime);
        return duration;
    }

    public double calcMaintenanceCostForFacility(){
        double costAmt=0;
        costAmt=maintenanceCost.getTotalCost();
        return costAmt;
    }

    public double calcProblemRateForFacility() {
        double rate = calcMaintenanceCostForFacility() / calcDownTimeForFacility();
        return rate;
    }



    public String toString(){
        String result="";
        result="MaintenanceID: "+this.maintenanceId+"\n";
        result+="Problem Type: "+facilityProblem.getMaintProblemType()+"\n";
        result+="Worker Name: "+this.workerName+"\n";
        result+="Estimated downtime: "+getTimeDurationInHour(startDateTime,endDateTime)+"\n";
        result+="Estimated problem rate per hour is: "+calcProblemRateForFacility()+"\n";
        return result;
    }
}
