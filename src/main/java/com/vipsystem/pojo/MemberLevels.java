package com.vipsystem.pojo;

public class MemberLevels {
    private int lID;
    private String lName;
    private String description;

    // 无参构造
    public MemberLevels() {
    }

    // 全参构造
    public MemberLevels(int lID, String lName, String description) {
        this.lID = lID;
        this.lName = lName;
        this.description = description;
    }

    // GETTER / SETTER
    public int getlID() {
        return lID;
    }

    public void setlID(int lID) {
        this.lID = lID;
    }

    public String getlName() {
        return lName;
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

    // toString
    @Override
    public String toString() {
        return "MemberLevels{" +
                "lID=" + lID +
                ", lName='" + lName + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}