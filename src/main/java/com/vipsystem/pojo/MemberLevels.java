package com.vipsystem.pojo;

public class MemberLevels {
    private int lID; // 对应 L_ID
    private String lName; // 对应 L_Name
    private String description; // 对应 Description

    // 构造方法
    public MemberLevels() {
    }

    public MemberLevels(Integer lID, String lName, String description) {
        this.lID = lID;
        this.lName = lName;
        this.description = description;
    }

    // Getters 和 Setters
    public int getlID() {
        return this.lID= lID;
    }

    public void setlID(Integer lID) {
        this.lID=lID;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // toString 方法，方便打印信息
    @Override
    public String toString() {
        return "MemberLevels{" +
                "lID=" + lID +
                ", lName='" + lName + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
    public String getlName(int i) {
        return lName;
    }
}