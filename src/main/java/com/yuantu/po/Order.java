package com.yuantu.po;

import java.util.Date;

public class Order {
    private Integer id;
    private String orderNumber;
    private String phone;
    private String userName;
    private Integer user_id;
    private Integer hotel_id;
    private Integer room_id;
    private String hotelName;
    private Date generationDate;
    private Date startDate;
    private Date endDate;
    private Date latestDate;
    private Date actualTime;
    private String roomType;
    private Integer rooms;
    private Integer number;
    private Integer child;
    private String status;
    private Double amount;
    private Double score;
    private String comment;
    private Date revocationTime;

    public Order() {
    }

    public Order(Integer id, String orderNumber, String phone, String userName, Integer user_id, Integer hotel_id, Integer room_id, String hotelName, Date generationDate, Date startDate, Date endDate, Date latestDate, Date actualTime, String roomType, Integer rooms, Integer number, Integer child, String status, Double amount, Double score, String comment, Date revocationTime) {
        this.id = id;
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
        this.actualTime = actualTime;
        this.roomType = roomType;
        this.rooms = rooms;
        this.number = number;
        this.child = child;
        this.status = status;
        this.amount = amount;
        this.score = score;
        this.comment = comment;
        this.revocationTime = revocationTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Date getGenerationDate() {
        return generationDate;
    }

    public void setGenerationDate(Date generationDate) {
        this.generationDate = generationDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getLatestDate() {
        return latestDate;
    }

    public void setLatestDate(Date latestDate) {
        this.latestDate = latestDate;
    }

    public Date getActualTime() {
        return actualTime;
    }

    public void setActualTime(Date actualTime) {
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

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getRevocationTime() {
        return revocationTime;
    }

    public void setRevocationTime(Date revocationTime) {
        this.revocationTime = revocationTime;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", orderNumber='" + orderNumber + '\'' +
                ", phone='" + phone + '\'' +
                ", userName='" + userName + '\'' +
                ", user_id=" + user_id +
                ", hotel_id=" + hotel_id +
                ", room_id=" + room_id +
                ", hotelName='" + hotelName + '\'' +
                ", generationDate=" + generationDate +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", latestDate=" + latestDate +
                ", actualTime=" + actualTime +
                ", roomType='" + roomType + '\'' +
                ", rooms=" + rooms +
                ", number=" + number +
                ", child=" + child +
                ", status='" + status + '\'' +
                ", amount=" + amount +
                ", score=" + score +
                ", comment='" + comment + '\'' +
                ", revocationTime=" + revocationTime +
                '}';
    }
}
