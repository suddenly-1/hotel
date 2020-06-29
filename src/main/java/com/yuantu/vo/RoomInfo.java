package com.yuantu.vo;

public class RoomInfo {
    private Integer room_id;//id
    private Integer hotel_id;//酒店id
    private String roomType;//房间类型
    private Double price;//房间价格
    private Integer rooms;//房间数量
    private Integer roomNumber;//订购数量
    private Integer numbers;//剩余房间
    private String state;//房间状态

    public RoomInfo() {
    }

    public RoomInfo(Integer room_id, Integer hotel_id, String roomType, Double price, Integer rooms, Integer roomNumber, Integer numbers, String state) {
        this.room_id = room_id;
        this.hotel_id = hotel_id;
        this.roomType = roomType;
        this.price = price;
        this.rooms = rooms;
        this.roomNumber = roomNumber;
        this.numbers = numbers;
        this.state = state;
    }

    public Integer getRoom_id() {
        return room_id;
    }

    public void setRoom_id(Integer room_id) {
        this.room_id = room_id;
    }

    public Integer getHotel_id() {
        return hotel_id;
    }

    public void setHotel_id(Integer hotel_id) {
        this.hotel_id = hotel_id;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getRooms() {
        return rooms;
    }

    public void setRooms(Integer rooms) {
        this.rooms = rooms;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Integer getNumbers() {
        return numbers;
    }

    public void setNumbers(Integer numbers) {
        this.numbers = numbers;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "RoomInfo{" +
                "room_id=" + room_id +
                ", hotel_id=" + hotel_id +
                ", roomType='" + roomType + '\'' +
                ", price=" + price +
                ", rooms=" + rooms +
                ", roomNumber=" + roomNumber +
                ", numbers=" + numbers +
                ", state='" + state + '\'' +
                '}';
    }
}
