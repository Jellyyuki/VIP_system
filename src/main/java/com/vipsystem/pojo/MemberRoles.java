package com.vipsystem.pojo;

public class MemberRoles {
    private int rID; // 对应 R_ID
    private String authority; // 对应 Authority
    private String description; // 对应 Description

    // 构造方法
    public MemberRoles() {
    }

    public MemberRoles(Integer rID, String authority, String description) {
        this.rID = rID;
        this.authority = authority;
        this.description = description;
    }

    // Getters 和 Setters
    public int getrID() {
        return rID;
    }

    public void setrID(Integer rID) {
        this.rID= rID;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority= authority;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description=  description;
    }

    // toString 方法，方便打印信息
    @Override
    public String toString() {
        return "MemberRoles{" +
                "rID=" + rID +
                ", authority='" + authority + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
