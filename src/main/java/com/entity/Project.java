package com.entity;

public class Project {
    private Integer id;

    private String proName;

    private Integer declarerTeacherNum;

    private String passFlag;

    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName == null ? null : proName.trim();
    }

    public Integer getDeclarerTeacherNum() {
        return declarerTeacherNum;
    }

    public void setDeclarerTeacherNum(Integer declarerTeacherNum) {
        this.declarerTeacherNum = declarerTeacherNum;
    }

    public String getPassFlag() {
        return passFlag;
    }

    public void setPassFlag(String passFlag) {
        this.passFlag = passFlag == null ? null : passFlag.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}