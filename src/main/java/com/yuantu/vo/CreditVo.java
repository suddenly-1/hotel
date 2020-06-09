package com.yuantu.vo;


public class CreditVo {
    private String time;
    private String orderNumber;
    private String action;
    private String creditChange;
    private Integer creditResult;

    public CreditVo() {
    }

    public CreditVo(String time, String orderNumber, String action, String creditChange, Integer creditResult) {
        this.time = time;
        this.orderNumber = orderNumber;
        this.action = action;
        this.creditChange = creditChange;
        this.creditResult = creditResult;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
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
        return "CreditVo{" +
                "time='" + time + '\'' +
                ", orderNumber='" + orderNumber + '\'' +
                ", action='" + action + '\'' +
                ", creditChange='" + creditChange + '\'' +
                ", creditResult=" + creditResult +
                '}';
    }
}
