package com.yuantu.vo;

public class UserLogin {
    private String accountNumber;
    private String password;

    public UserLogin() {
    }

    public UserLogin(String accountNumber, String password) {
        this.accountNumber = accountNumber;
        this.password = password;
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

    @Override
    public String toString() {
        return "UserLogin{" +
                "accountNumber='" + accountNumber + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
