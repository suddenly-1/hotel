package com.yuantu.vo;


public class OrderVo {
    private String orderNumber;     //订单号
    private String phone;           //手机号
    private String userName;        //用户名
    private Integer user_id;        //用户ID
    private Integer hotel_id;       //酒店ID
    private Integer room_id;        //房间id
    private String hotelName;       //酒店名
    private String generationDate;    //订单生成日期
    private String startDate;         //开始时间
    private String endDate;           //退房时间
    private String latestDate;        //最晚订单执行时间
    private String room_number;     //房间号
    private String actualCheckInTime; //实际入住时间
    private String actualTime;        //实际退房时间
    private String roomType;        //房间类型
    private Integer rooms;          //房间数量
    private Integer number;         //入住人数
    private Integer child;          //有无儿童
    private String status;          //状态（已完成、未完成、已撤销、异常）
    private Double amount;          //金额
    private String revocationTime;    //撤销时间

    public OrderVo() {
    }

    public OrderVo(String orderNumber, String phone, String userName, Integer user_id, Integer hotel_id, Integer room_id, String hotelName, String generationDate, String startDate, String endDate, String latestDate, String room_number, String actualCheckInTime, String actualTime, String roomType, Integer rooms, Integer number, Integer child, String status, Double amount, String revocationTime) {
        this.orderNumber = orderNumber;
        this.phone = phone;
        this.userName = userName;
        this.user_id = user_id;
        this.hotel_id = hotel_id;
        this.room_id = room_id;
        this.hotelName = hotelName;
        this.generationDate = generationDate;
        this.startDate = startDate;
        this.endDate = endDate;
        this.latestDate = latestDate;
        this.room_number = room_number;
        this.actualCheckInTime = actualCheckInTime;
        this.actualTime = actualTime;
        this.roomType = roomType;
        this.rooms = rooms;
        this.number = number;
        this.child = child;
        this.status = status;
        this.amount = amount;
        this.revocationTime = revocationTime;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getHotel_id() {
        return hotel_id;
    }

    public void setHotel_id(Integer hotel_id) {
        this.hotel_id = hotel_id;
    }

    public Integer getRoom_id() {
        return room_id;
    }

    public void setRoom_id(Integer room_id) {
        this.room_id = room_id;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getGenerationDate() {
        return generationDate;
    }

    public void setGenerationDate(String generationDate) {
        this.generationDate = generationDate;
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

    public String getLatestDate() {
        return latestDate;
    }

    public void setLatestDate(String latestDate) {
        this.latestDate = latestDate;
    }

    public String getRoom_number() {
        return room_number;
    }

    public void setRoom_number(String room_number) {
        this.room_number = room_number;
    }

    public String getActualCheckInTime() {
        return actualCheckInTime;
    }

    public void setActualCheckInTime(String actualCheckInTime) {
        this.actualCheckInTime = actualCheckInTime;
    }

    public String getActualTime() {
        return actualTime;
    }

    public void setActualTime(String actualTime) {
        this.actualTime = actualTime;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public Integer getRooms() {
        return rooms;
    }

    public void setRooms(Integer rooms) {
        this.rooms = rooms;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getChild() {
        return child;
    }

    public void setChild(Integer child) {
        this.child = child;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getRevocationTime() {
        return revocationTime;
    }

    public void setRevocationTime(String revocationTime) {
        this.revocationTime = revocationTime;
    }

    @Override
    public String toString() {
        return "OrderVo{" +
                "orderNumber='" + orderNumber + '\'' +
                ", phone='" + phone + '\'' +
                ", userName='" + userName + '\'' +
                ", user_id=" + user_id +
                ", hotel_id=" + hotel_id +
                ", room_id=" + room_id +
                ", hotelName='" + hotelName + '\'' +
                ", generationDate='" + generationDate + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", latestDate='" + latestDate + '\'' +
                ", room_number='" + room_number + '\'' +
                ", actualCheckInTime='" + actualCheckInTime + '\'' +
                ", actualTime='" + actualTime + '\'' +
                ", roomType='" + roomType + '\'' +
                ", rooms=" + rooms +
                ", number=" + number +
                ", child=" + child +
                ", status='" + status + '\'' +
                ", amount=" + amount +
                ", revocationTime='" + revocationTime + '\'' +
                '}';
    }
}
