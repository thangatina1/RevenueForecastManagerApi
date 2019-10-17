package com.RevenueForecastManagerApi.RevenueForecastManagerApi.entity;


import javax.persistence.*;

@Entity
@Table(name="project")
public class Project {

    @Id
    @Column(name="esa_project_id")
    private int esaProjectId;

    @Column(name="esa_project_name")
    private String esaProjectName;

    @Column(name="sow_project_id")
    private int sowProjectId;

    @Column(name="sow_project_name")
    private String sowProjectName;

    @Column(name="fixedbid_flag")
    private Boolean fixedBidFlag;

    @Column(name="tnm_flag")
    private Boolean tnmFlag;

    @Column(name="project_location")
    private String projectLocation;

    @Column(name="sbu")
    private String sbu;

    @Column(name="rate")
    private double rate;

    @Column(name="work_hours")
    private int workHours;

    @Column(name="active_status")
    private Boolean activeStatus;

    public Project(){}

    public Project(int esaProjectId, String esaProjectName, int sowProjectId, String sowProjectName, Boolean fixedBidFlag, Boolean tnmFlag, String projectLocation, String sbu, double rate, int workHours, Boolean activeStatus) {
        this.esaProjectId = esaProjectId;
        this.esaProjectName = esaProjectName;
        this.sowProjectId = sowProjectId;
        this.sowProjectName = sowProjectName;
        this.fixedBidFlag = fixedBidFlag;
        this.tnmFlag = tnmFlag;
        this.projectLocation = projectLocation;
        this.sbu = sbu;
        this.rate = rate;
        this.workHours = workHours;
        this.activeStatus = activeStatus;
    }

    public int getProject_id() {
        return esaProjectId;
    }

    public int getEsaProjectId() {
        return esaProjectId;
    }

    public void setEsaProjectId(int esaProjectId) {
        this.esaProjectId = esaProjectId;
    }

    public String getEsaProjectName() {
        return esaProjectName;
    }

    public void setEsaProjectName(String esaProjectName) {
        this.esaProjectName = esaProjectName;
    }

    public int getSowProjectId() {
        return sowProjectId;
    }

    public void setSowProjectId(int sowProjectId) {
        this.sowProjectId = sowProjectId;
    }

    public String getSowProjectName() {
        return sowProjectName;
    }

    public void setSowProjectName(String sowProjectName) {
        this.sowProjectName = sowProjectName;
    }

    public Boolean getFixedBidFlag() {
        return fixedBidFlag;
    }

    public void setFixedBidFlag(Boolean fixedBidFlag) {
        this.fixedBidFlag = fixedBidFlag;
    }

    public Boolean getTnmFlag() {
        return tnmFlag;
    }

    public void setTnmFlag(Boolean tnmFlag) {
        this.tnmFlag = tnmFlag;
    }

    public String getProjectLocation() {
        return projectLocation;
    }

    public void setProjectLocation(String projectLocation) {
        this.projectLocation = projectLocation;
    }

    public String getSbu() {
        return sbu;
    }

    public void setSbu(String sbu) {
        this.sbu = sbu;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public Boolean getActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(Boolean activeStatus) {
        this.activeStatus = activeStatus;
    }




}
