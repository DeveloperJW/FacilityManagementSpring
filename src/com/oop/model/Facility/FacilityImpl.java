package com.oop.model.Facility;

import java.util.ArrayList;

public class FacilityImpl implements Facility{
    private String facilityId;
    private String facilityName;
    private int capacity;
    private String facilityType;
    private FacilityAddress facilityAddress;
    private String facilityDetail="";
    private Boolean isInUse=false;

    public FacilityImpl(){
        //default constructor
    }

    public String getFacilityId(){
        return facilityId;
    }
    public void setFacilityId(String newFacilityId){
        this.facilityId=newFacilityId;
    }
    public String getFacilityName(){
        return facilityName;
    }
    public void setFacilityName(String newFacilityName){
        this.facilityName=newFacilityName;
    }
    public int getCapacity(){
        return capacity;
    }
    public void setCapacity(int newCapacity){
        this.capacity=newCapacity;
    }
    public String getfacilityType(){
        return facilityType;
    }
    public void setFacilityType(String newFacilityType){
        this.facilityType=newFacilityType;
    }
    public FacilityAddress getFacilityAddress(){
        return facilityAddress;
    }
    public void setFacilityAddress(FacilityAddress newFacilityAddress){
        this.facilityAddress=newFacilityAddress;
    }
    // getter and setter for Facility Detail
    public String getFacilityDetail() {
        return facilityDetail;
    }

    public void setFacilityDetail(String newDetails){
        facilityDetail=newDetails;
    }

    public Boolean getInUse() { return isInUse; }

    public void setInUse(Boolean inUse) { isInUse = inUse; }

    //DONE: add a method to add details or connect Facility with Facility Details
    public void addFacilityDetail(String newDetail){
        facilityDetail+=newDetail;
    }

    public String toString(){
        String result="";
        result="FacilityID: "+this.facilityId+"\n";
        result+="FacilityName: "+this.facilityName+"\n";
        result+="Capacity: "+this.capacity+"\n";
        result+="Address: "+this.facilityAddress.toString()+"\n";
        result+="Facility Detail"+this.getFacilityDetail()+"\n";
        result+="Facility occupied?: "+this.getInUse().toString()+"\n";
        return result;
    }

    public String getFacilityInformation(){
        String result="";
        result="FacilityID: "+this.facilityId+"\n";
        result+="FacilityName: "+this.facilityName+"\n";
        result+="Capacity: "+this.capacity+"\n";
        result+="Address: "+this.facilityAddress.toString()+"\n";
        result+="Facility Detail"+this.getFacilityDetail()+"\n";
        result+="Facility occupied?: "+this.getInUse().toString()+"\n";
        return result;
    }



}
