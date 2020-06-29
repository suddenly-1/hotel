package com.yuantu.vo;

import java.util.Date;

public class UserInfoVo {
    private String username;
    private String accountNumber;
    private String password;
    private String phone;
    private Double credit;
    private String vip;
    private String birthday;
    private String companyName;

    public UserInfoVo() {
    }

    public UserInfoVo(String username, String accountNumber, String password, String phone, Double credit, String vip, String birthday, String companyName) {
        this.username = username;
        this.accountNumber = accountNumber;
        this.password = password;
        this.phone = phone;
        this.credit = credit;
        this.vip = vip;
        this.birthday = birthday;
        this.companyName = companyName;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getVip() {
        return vip;
    }

    public void setVip(String vip) {
        this.vip = vip;
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

    @Override
    public String toString() {
        return "UserInfoVo{" +
                "username='" + username + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", credit='" + credit + '\'' +
                ", vip='" + vip + '\'' +
                ", birthday=" + birthday +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
