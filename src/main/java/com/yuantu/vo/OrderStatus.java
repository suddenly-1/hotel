package com.yuantu.vo;

public class OrderStatus {
    private String orderNumber;         //订单号
    private Integer user_id;            //用户id
    private String status;              //状态（已完成、未完成、已撤销、异常）
    private String revocationTime;      //撤销时间

    public OrderStatus() {
    }

    public OrderStatus(String orderNumber, Integer user_id, String status, String revocationTime) {
        this.orderNumber = orderNumber;
        this.user_id = user_id;
        this.status = status;
        this.revocationTime = revocationTime;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRevocationTime() {
        return revocationTime;
    }

    public void setRevocationTime(String revocationTime) {
        this.revocationTime = revocationTime;
    }

    @Override
    public String toString() {
        return "OrderStatus{" +
                "orderNumber='" + orderNumber + '\'' +
                ", user_id=" + user_id +
                ", status='" + status + '\'' +
                ", revocationTime='" + revocationTime + '\'' +
                '}';
    }
}
