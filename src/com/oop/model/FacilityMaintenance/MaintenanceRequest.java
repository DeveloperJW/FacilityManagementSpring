package com.oop.model.FacilityMaintenance;

import com.oop.model.Facility.Facility;
import com.oop.model.FacilityUse.Customer;

import java.util.Date;

public interface MaintenanceRequest{

    //methods
    public String getReqId();
    public void setReqId(String newReqId);

    public Date getReqDate();

    public void setReqDate(Date newReqDate);

    public String getCustomerId();

    public void setCustomerId(String newCustId);

    public String getUnitId();

    public void setUnitId(String newUnitId);

    public Customer getCustomer();

    public void setCustomer(Customer customer);

    public Facility getFacility();

    public void setFacility(Facility facility);

    public String toString();
}
