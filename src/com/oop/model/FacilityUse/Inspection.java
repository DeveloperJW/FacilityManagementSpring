package com.oop.model.FacilityUse;
import java.util.Date;

public interface Inspection {
    ///methods
    public String getInspectionId();

    public void setInspectionId(String newInspectionId);

    public String getFacilityId();

    public void setFacilityId(String newUnitId);

    public String getInspectorName();

    public void setInspectorName(String newName);

    public String getInspectionResult();

    public void setInspectionResult(String newResult);

    public Date getInspectionDate();

    public void setInspectionDate(Date newDate);

    public String toString();

}
