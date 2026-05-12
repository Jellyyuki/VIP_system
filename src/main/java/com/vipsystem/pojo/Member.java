package com.vipsystem.pojo;

public class Member {
    private int mID; // 对应 M_ID
    private String username; // 对应 Username
    private java.time.LocalDateTime joinDate; // 对应 JoinDate
    private java.time.LocalDateTime lastLogin; // 对应 LastLogin
    private boolean isActive; // 对应 IsActive

    // 默认构造方法
    public Member() {
    }

    // 带参数的构造方法
    public Member(int mID, String username, java.time.LocalDateTime joinDate, java.time.LocalDateTime lastLogin, boolean isActive) {
        this.mID = mID;
        this.username = username;
        this.joinDate = joinDate;
        this.lastLogin = lastLogin;
        this.isActive = isActive;
    }

    // Getters 和 Setters
    public int getmID() {
        return mID;
    }

    public void setmID(int mID) {
        this.mID=mID;
    }



    public void setUsername(String username) {
        this.username=username;
    }

    public java.time.LocalDateTime getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(java.time.LocalDateTime joinDate) {
        this.joinDate = joinDate;
    }

    public java.time.LocalDateTime getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(java.time.LocalDateTime lastLogin) {
        this.lastLogin = lastLogin;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    // toString 方法，方便打印信息
    @Override
    public String toString() {
        return "Member{" +
                "mID=" + mID +
                ", username='" + username + '\'' +
                ", joinDate=" + joinDate +
                ", lastLogin=" + lastLogin +
                ", isActive=" + isActive +
                '}';
    }
    public String getUsername(int i) {
        return username;
    }

}
