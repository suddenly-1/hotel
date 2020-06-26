package com.yuantu.vo;

public class UserLogin {
    private Integer id;
    private String accountNumber;
    private String password;
    private String remember;
    private String usertype;

    public UserLogin() {
    }

    public UserLogin(Integer id, String accountNumber, String password, String remember, String usertype) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.password = password;
        this.remember = remember;
        this.usertype = usertype;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getRemember() {
        return remember;
    }

    public void setRemember(String remember) {
        this.remember = remember;
    }

    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }

    @Override
    public String toString() {
        return "UserLogin{" +
                "id=" + id +
                ", accountNumber='" + accountNumber + '\'' +
                ", password='" + password + '\'' +
                ", remember='" + remember + '\'' +
                ", usertype='" + usertype + '\'' +
                '}';
    }
}
