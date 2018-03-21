package com.oop.model.FacilityMaintenance;

import com.oop.model.Facility.Facility;

public interface FacilityProblem {

    public String getMaintProblemId();

    public void setMaintProblemId(String newMainProblemId);

    public String getMaintProblemType();

    public void setMaintProblemType(String newProblemType);

    public String getMaintProblemDetails();

    public void setMaintProblemDetails(String newDetails);

    public boolean getFixedOrnot();

    public void setFixedOrNot(Boolean newStatus);

    public String toString();
}
