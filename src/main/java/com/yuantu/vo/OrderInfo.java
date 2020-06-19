package com.yuantu.vo;



public class OrderInfo {
    private String orderNumber;     //订单号
    private Integer user_id;        //用户id
    private Integer hotel_id;       //酒店id
    private String hotelName;       //酒店名称
    private String generationDate;  //订单生成日期
    private String startDate;       //开始时间
    private String endDate;         //退房时间
    private String latestDate;      //最晚执行订单时间
    private String roomType;        //房型
    private Integer rooms;          //间数
    private Integer number;         //人数
    private Integer child;          //有无儿童
    private String status;          //状态（已完成、未完成、已撤销、异常）
    private Double amount;          //金额
    private Double score;           //评分
    private String revocationTime;  //撤销时间

    public OrderInfo() {
    }

    public OrderInfo(String orderNumber, Integer user_id, Integer hotel_id, String hotelName, String generationDate, String startDate, String endDate, String latestDate, String roomType, Integer rooms, Integer number, Integer child, String status, Double amount, Double score, String revocationTime) {
        this.orderNumber = orderNumber;
        this.user_id = user_id;
        this.hotel_id = hotel_id;
        this.hotelName = hotelName;
        this.generationDate = generationDate;
        this.startDate = startDate;
        this.endDate = endDate;
        this.latestDate = latestDate;
        this.roomType = roomType;
        this.rooms = rooms;
        this.number = number;
        this.child = child;
        this.status = status;
        this.amount = amount;
        this.score = score;
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

    public Integer getHotel_id() {
        return hotel_id;
    }

    public void setHotel_id(Integer hotel_id) {
        this.hotel_id = hotel_id;
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

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getRevocationTime() {
        return revocationTime;
    }

    public void setRevocationTime(String revocationTime) {
        this.revocationTime = revocationTime;
    }

    @Override
    public String toString() {
        return "OrderInfo{" +
                "orderNumber='" + orderNumber + '\'' +
                ", user_id=" + user_id +
                ", hotel_id=" + hotel_id +
                ", hotelName='" + hotelName + '\'' +
                ", generationDate='" + generationDate + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", latestDate='" + latestDate + '\'' +
                ", roomType='" + roomType + '\'' +
                ", rooms=" + rooms +
                ", number=" + number +
                ", child=" + child +
                ", status='" + status + '\'' +
                ", amount=" + amount +
                ", score=" + score +
                ", revocationTime='" + revocationTime + '\'' +
                '}';
    }
}
