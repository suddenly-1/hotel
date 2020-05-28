package com.yuantu.po;

import java.util.Date;

public class Credit {
    private Integer id;
    private Integer userId;
    private Date time;
    private String orderNumber;
    private String action;
    private String creditChange;
    private Integer creditResult;

    public Credit() {
    }

    public Credit(Integer id, Integer userId, Date time, String orderNumber, String action, String creditChange, Integer creditResult) {
        this.id = id;
        this.userId = userId;
        this.time = time;
        this.orderNumber = orderNumber;
        this.action = action;
        this.creditChange = creditChange;
        this.creditResult = creditResult;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getCreditChange() {
        return creditChange;
    }

    public void setCreditChange(String creditChange) {
        this.creditChange = creditChange;
    }

    public Integer getCreditResult() {
        return creditResult;
    }

    public void setCreditResult(Integer creditResult) {
        this.creditResult = creditResult;
    }

    @Override
    public String toString() {
        return "Credit{" +
                "id=" + id +
                ", userId=" + userId +
                ", time=" + time +
                ", orderNumber='" + orderNumber + '\'' +
                ", action='" + action + '\'' +
                ", creditChange='" + creditChange + '\'' +
                ", creditResult=" + creditResult +
                '}';
    }
}
