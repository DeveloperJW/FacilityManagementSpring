package com.oop.model.FacilityUse;

public interface Customer {
    public String getCustomerId();

    public void setCustomerId(String newCustId);

    public String getFirstName();

    public void setFirstName(String newFirstName);

    public String getLastName();

    public void setLastName(String newLastName);

    public String getAddress();

    public void setAddress(String newAdd);

    public String getContactNumber();

    public void setContactNumber(String newNum);

    public String getSsn();

    public void setSsn(String newSsn);

    public String toString();
}
