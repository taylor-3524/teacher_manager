package com.entity;

public class Department {
    private Integer id;

    private Integer teaDepNum;

    private String teaJob;

    private Integer teaNum;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTeaDepNum() {
        return teaDepNum;
    }

    public void setTeaDepNum(Integer teaDepNum) {
        this.teaDepNum = teaDepNum;
    }

    public String getTeaJob() {
        return teaJob;
    }

    public void setTeaJob(String teaJob) {
        this.teaJob = teaJob == null ? null : teaJob.trim();
    }

    public Integer getTeaNum() {
        return teaNum;
    }

    public void setTeaNum(Integer teaNum) {
        this.teaNum = teaNum;
    }
}