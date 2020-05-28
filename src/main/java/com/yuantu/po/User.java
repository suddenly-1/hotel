package com.yuantu.po;

import java.util.Date;

public class User {
    private Integer id;
    private String username;
    private String accountNumber;
    private String password;
    private String phone;
    private String credit;
    private String vip;
    private String userType;
    private Date birthday;
    private String companyName;
    private String hotelName;
    private Integer hotel_id;

    public User() {
    }

    public User(Integer id, String username, String accountNumber, String password, String phone, String credit, String vip, String userType, Date birthday, String companyName, String hotelName, Integer hotel_id) {
        this.id = id;
        this.username = username;
        this.accountNumber = accountNumber;
        this.password = password;
        this.phone = phone;
        this.credit = credit;
        this.vip = vip;
        this.userType = userType;
        this.birthday = birthday;
        this.companyName = companyName;
        this.hotelName = hotelName;
        this.hotel_id = hotel_id;
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

    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }

    public String getVip() {
        return vip;
    }

    public void setVip(String vip) {
        this.vip = vip;
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

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public Integer getHotel_id() {
        return hotel_id;
    }

    public void setHotel_id(Integer hotel_id) {
        this.hotel_id = hotel_id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", credit='" + credit + '\'' +
                ", vip='" + vip + '\'' +
                ", userType='" + userType + '\'' +
                ", birthday=" + birthday +
                ", companyName='" + companyName + '\'' +
                ", hotelName='" + hotelName + '\'' +
                ", hotel_id=" + hotel_id +
                '}';
    }
}
