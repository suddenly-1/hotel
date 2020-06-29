package com.yuantu.vo;

public class RoomInfoVo {
    private Integer id;
    private String roomType;
    private Double price;
    private Integer rooms;

    public RoomInfoVo() {
    }

    public RoomInfoVo(Integer id, String roomType, Double price, Integer rooms) {
        this.id = id;
        this.roomType = roomType;
        this.price = price;
        this.rooms = rooms;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "RoomInfoVo{" +
                "id=" + id +
                ", roomType='" + roomType + '\'' +
                ", price=" + price +
                ", rooms=" + rooms +
                '}';
    }
}
