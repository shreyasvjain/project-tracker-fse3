package com.cognizant.fse3.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;
import java.util.List;

public class MemberResource {
    @NotNull
    private String name;
    private long id;
    private int yearsOfExperiance;
    private List<String> skillSet;
    private String additionalDescription;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate projectStartDt;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate projectEndDt;
    private int allocationPercentage;
    private TaskDetailsResource taskDetails;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getYearsOfExperiance() {
        return yearsOfExperiance;
    }

    public void setYearsOfExperiance(int yearsOfExperiance) {
        this.yearsOfExperiance = yearsOfExperiance;
    }

    public List<String> getSkillSet() {
        return skillSet;
    }

    public void setSkillSet(List<String> skillSet) {
        this.skillSet = skillSet;
    }

    public String getAdditionalDescription() {
        return additionalDescription;
    }

    public void setAdditionalDescription(String additionalDescription) {
        this.additionalDescription = additionalDescription;
    }

    public LocalDate getProjectStartDt() {
        return projectStartDt;
    }

    public void setProjectStartDt(LocalDate projectStartDt) {
        this.projectStartDt = projectStartDt;
    }

    public LocalDate getProjectEndDt() {
        return projectEndDt;
    }

    public void setProjectEndDt(LocalDate projectEndDt) {
        this.projectEndDt = projectEndDt;
    }

    public int getAllocationPercentage() {
        return allocationPercentage;
    }

    public void setAllocationPercentage(int allocationPercentage) {
        this.allocationPercentage = allocationPercentage;
    }

    public TaskDetailsResource getTaskDetails() {
        return taskDetails;
    }

    public void setTaskDetails(TaskDetailsResource taskDetails) {
        this.taskDetails = taskDetails;
    }
}
