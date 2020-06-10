package com.yuantu.vo;

import java.util.Date;

public class UserForm {
    private String username;
    private String accountNumber;
    private String password;
    private String phone;
    private Double credit;
    private String userType;
    private Date birthday;
    private String companyName;
    private Integer hotel_id;

    public UserForm() {
    }

    public UserForm(String username, String accountNumber, String password, String phone, Double credit, String userType, Date birthday, String companyName, Integer hotel_id) {
        this.username = username;
        this.accountNumber = accountNumber;
        this.password = password;
        this.phone = phone;
        this.credit = credit;
        this.userType = userType;
        this.birthday = birthday;
        this.companyName = companyName;
        this.hotel_id = hotel_id;
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

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Integer getHotel_id() {
        return hotel_id;
    }

    public void setHotel_id(Integer hotel_id) {
        this.hotel_id = hotel_id;
    }

    @Override
    public String toString() {
        return "UserForm{" +
                "username='" + username + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", credit=" + credit +
                ", userType='" + userType + '\'' +
                ", birthday=" + birthday +
                ", companyName='" + companyName + '\'' +
                ", hotel_id=" + hotel_id +
                '}';
    }
}
