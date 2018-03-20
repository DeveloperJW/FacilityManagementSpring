package com.oop.model.FacilityUse;
import java.util.Date;

public class InspectionImpl implements Inspection {
    private String inspectionId;
    private String facilityId;
    private String inspectorName;
    private String inspectionResult;
    private Date InspectionDate;

    public InspectionImpl(){
        //default constructor
    }
    ///methods
    public String getInspectionId(){
        return inspectionId;
    }

    public void setInspectionId(String newInspectionId){
        this.inspectionId=newInspectionId;
    }

    public String getFacilityId(){
        return facilityId;
    }

    public void setFacilityId(String newUnitId){
        this.facilityId=newUnitId;
    }

    public String getInspectorName(){
        return inspectorName;
    }

    public void setInspectorName(String newName){
        this.inspectorName=newName;
    }

    public String getInspectionResult(){
        return inspectionResult;
    }

    public void setInspectionResult(String newResult){
        this.inspectionResult=newResult;
    }

    public Date getInspectionDate(){
        return InspectionDate;
    }

    public void setInspectionDate(Date newDate){
        this.InspectionDate=newDate;
    }

    public String toString(){
        String result="";
        result="The information about Inspection is as followings:"+"\n";
        result+="Inspection performed by "+inspectorName+"\n";
        result+="Inspection requested on date "+InspectionDate+"\n";
        result+="Inspection result is :"+inspectionResult+"\n";
        return result;
    }

}
