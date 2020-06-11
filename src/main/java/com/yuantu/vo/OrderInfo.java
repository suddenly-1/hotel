package com.yuantu.vo;


public class OrderInfo {
    private String orderNumber;     //    订单号
    private String hotelName;       //    酒店名称
    private String rooms;           //    数量
    private String startDate;         //    开始时间
    private String endDate;           //    退房时间
    private String status;          //    状态（已完成、未完成、已撤销、异常）

    public OrderInfo() {
    }

    public OrderInfo(String orderNumber, String hotelName, String rooms, String startDate, String endDate, String status) {
        this.orderNumber = orderNumber;
        this.hotelName = hotelName;
        this.rooms = rooms;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getRooms() {
        return rooms;
    }

    public void setRooms(String rooms) {
        this.rooms = rooms;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "OrderInfo{" +
                "orderNumber='" + orderNumber + '\'' +
                ", hotelName='" + hotelName + '\'' +
                ", rooms='" + rooms + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
