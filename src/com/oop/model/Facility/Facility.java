package com.oop.model.Facility;

public interface Facility {
    public String getFacilityId();
    public void setFacilityId(String newFacilityId);
    public String getFacilityName();
    public void setFacilityName(String newFacilityName);
    public int getCapacity();
    public void setCapacity(int newCapacity);
    public String getfacilityType();
    public void setFacilityType(String newFacilityType);
    public FacilityAddress getFacilityAddress();
    public void setFacilityAddress(FacilityAddress newFacilityAddress);
    // getter and setter for Facility Detail
    public String getFacilityDetail();
    public void setFacilityDetail(String newDetails);
    public Boolean getInUse();
    public void setInUse(Boolean inUse);
    //DONE: add a method to add details or connect Facility with Facility Details
    public void addFacilityDetail(String newDetail);
    public String toString();
    public String getFacilityInformation();
}
