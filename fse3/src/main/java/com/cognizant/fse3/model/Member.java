package com.cognizant.fse3.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "member")
public class Member {

    @Column(name = "name")
    private String name;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "yearsOfExperiance")
    private int yearsOfExperiance;

    @Column(name = "skillSet")
    private String skillSet;

    @Column(name = "additionalDescription")
    private String additionalDescription;

    @Column(name = "projectStartDt")
    private LocalDate projectStartDt;

    @Column(name = "projectEndDt")
    private LocalDate projectEndDt;

    @Column(name = "allocationPercentage")
    private int allocationPercentage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getYearsOfExperiance() {
        return yearsOfExperiance;
    }

    public void setYearsOfExperiance(int yearsOfExperiance) {
        this.yearsOfExperiance = yearsOfExperiance;
    }

    public String getSkillSet() {
        return skillSet;
    }

    public void setSkillSet(String skillSet) {
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

}
