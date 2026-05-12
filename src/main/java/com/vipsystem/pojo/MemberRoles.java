package com.vipsystem.pojo;

public class MemberRoles {
    // 成员变量
    private int rID;
    private String authority;
    private String description;

    // 无参构造
    public MemberRoles() {
    }

    // 全参构造
    public MemberRoles(int rID, String authority, String description) {
        this.rID = rID;
        this.authority = authority;
        this.description = description;
    }

    // Getter & Setter
    public int getrID() {
        return rID;
    }

    public void setrID(int rID) {
        this.rID = rID;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
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
        return "MemberRoles{" +
                "rID=" + rID +
                ", authority='" + authority + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}