package com.vipsystem.pojo;

import java.time.LocalDateTime;

public class Member {
    private int mID;
    private String username;
    private LocalDateTime joinDate;
    private LocalDateTime lastLogin;
    private boolean isActive;

    // 无参构造
    public Member() {
    }

    // 全参构造
    public Member(int mID, String username, LocalDateTime joinDate, LocalDateTime lastLogin, boolean isActive) {
        this.mID = mID;
        this.username = username;
        this.joinDate = joinDate;
        this.lastLogin = lastLogin;
        this.isActive = isActive;
    }

    // GETTER / SETTER
    public int getmID() {
        return mID;
    }

    public void setmID(int mID) {
        this.mID = mID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public LocalDateTime getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(LocalDateTime joinDate) {
        this.joinDate = joinDate;
    }

    public LocalDateTime getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(LocalDateTime lastLogin) {
        this.lastLogin = lastLogin;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    // toString
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
}