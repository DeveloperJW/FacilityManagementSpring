package com.oop.model.Facility;

public interface FacilityAddress {
    public String getAddressId();

    public void setAddressId(String newAddressId);
    //street
    public String getStreet();

    public void setStreet(String newStreet);
    //unit
    public String getUnit();

    public void setUnit(String newwUnit);
    //city
    public String getCity();

    public void setCity(String newCity);
    //state
    public String getState();

    public void setState(String newState);
    //zip code
    public String getZip();

    public void setZip(String newZip);

    public String toString();
}
