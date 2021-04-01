package com.ashraf.primeveraxereditor;

import java.util.Date;

/*
* DataModel for XER file, choosen 8 data column for viewable area
*/
public class XERDataModel {

    String uniqueID, activityID, WBS, taskName, predecessor, successor;
    Date startDate, endDate;

    public XERDataModel(String uniqueID, String activityID, String WBS, String taskName,
            Date startDate, Date endDate, String predecessor, String successor) {
        this.uniqueID = uniqueID;
        this.activityID = activityID;
        this.WBS = WBS;
        this.taskName = taskName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.predecessor = predecessor;
        this.successor = successor;
    }

    /*
    * Getter and Setter
    */
    public String getActivityID() {
        return activityID;
    }

    public void setActivityID(String activityID) {
        this.activityID = activityID;
    }

    public String getWBS() {
        return WBS;
    }

    public void setWBS(String wBS) {
        WBS = wBS;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getPredecessor() {
        return predecessor;
    }

    public void setPredecessor(String predecessor) {
        this.predecessor = predecessor;
    }

    public String getSuccessor() {
        return successor;
    }

    public void setSuccessor(String successor) {
        this.successor = successor;
    }

    public void setUniqueID(String uniqueID) {
        this.uniqueID = uniqueID;
    }

    public String getUniqueID() {
        return uniqueID;
    }

}
