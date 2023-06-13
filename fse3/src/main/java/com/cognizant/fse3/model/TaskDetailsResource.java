package com.cognizant.fse3.model;

import java.util.Date;

public class TaskDetailsResource {
    private String taskName;
    private String deliverables;
    private Date taskStartDt;
    private Date taskEndDt;

    public TaskDetailsResource(String taskName, String deliverables, Date taskStartDt, Date taskEndDt) {
        this.taskName = taskName;
        this.deliverables = deliverables;
        this.taskStartDt = taskStartDt;
        this.taskEndDt = taskEndDt;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getDeliverables() {
        return deliverables;
    }

    public void setDeliverables(String deliverables) {
        this.deliverables = deliverables;
    }

    public Date getTaskStartDt() {
        return taskStartDt;
    }

    public void setTaskStartDt(Date taskStartDt) {
        this.taskStartDt = taskStartDt;
    }

    public Date getTaskEndDt() {
        return taskEndDt;
    }

    public void setTaskEndDt(Date taskEndDt) {
        this.taskEndDt = taskEndDt;
    }
}
