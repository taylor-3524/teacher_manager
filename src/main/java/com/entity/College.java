package com.entity;

public class College {
    private Integer id;

    private String depName;

    private Integer depNum;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName == null ? null : depName.trim();
    }

    public Integer getDepNum() {
        return depNum;
    }

    public void setDepNum(Integer depNum) {
        this.depNum = depNum;
    }
}