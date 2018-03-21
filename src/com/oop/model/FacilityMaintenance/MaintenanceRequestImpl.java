package com.oop.model.FacilityMaintenance;

import com.oop.model.Facility.Facility;
import com.oop.model.FacilityUse.Customer;

import java.util.Date;

public class MaintenanceRequestImpl implements MaintenanceRequest{
    private String reqId;
    private Date reqDate;
    private Customer customer;
    private Facility facility;

    public MaintenanceRequestImpl(){

    }

    //methods
    public String getReqId(){
        return reqId;
    }

    public void setReqId(String newReqId){
        this.reqId=newReqId;
    }

    public Date getReqDate(){
        return reqDate;
    }

    public void setReqDate(Date newReqDate){
        this.reqDate=newReqDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }

    public String makeFacilityMaintRequest(){
        String result="Making new Facility Maintenance request: ";
        result+="The maintenance request is made by "+this.customer.getLastName()+"\n";
        result+="Request date: "+this.reqDate+"\n";
        result+="Facility :"+this.facility.getFacilityName()+"\n";
        return result;

    }


    public String toString(){
        String result="The maintenance request is made by "+this.customer.getLastName()+"\n";
        result+="Request date: "+this.reqDate+"\n";
        result+="Facility :"+this.facility.getFacilityName()+"\n";
        return result;
    }

}
