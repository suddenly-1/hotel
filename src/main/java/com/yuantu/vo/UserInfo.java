package com.yuantu.vo;

import java.util.Date;

public class UserInfo {
    private Integer id;
    private String username;
    private String accountNumber;
    private String phone;
    private Double credit;
    private String birthday;
    private String companyName;
    private String vip;

    public UserInfo() {
    }

    public UserInfo(Integer id, String username, String accountNumber, String phone, Double credit, String birthday, String companyName, String vip) {
        this.id = id;
        this.username = username;
        this.accountNumber = accountNumber;
        this.phone = phone;
        this.credit = credit;
        this.birthday = birthday;
        this.companyName = companyName;
        this.vip = vip;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Double getCredit() {
        return credit;
    }

    public void setCredit(Double credit) {
        this.credit = credit;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getVip() {
        return vip;
    }

    public void setVip(String vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", phone='" + phone + '\'' +
                ", credit=" + credit +
                ", birthday='" + birthday + '\'' +
                ", companyName='" + companyName + '\'' +
                ", vip='" + vip + '\'' +
                '}';
    }
}
