package com.yuantu.po;

public class Room {
    private Integer id;
    private Integer hotelId;
    private String roomType;
    private Double price;
    private Integer rooms;

    public Room() {
    }

    public Room(Integer id, Integer hotelId, String roomType, Double price, Integer rooms) {
        this.id = id;
        this.hotelId = hotelId;
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

    public Integer getHotelId() {
        return hotelId;
    }

    public void setHotelId(Integer hotelId) {
        this.hotelId = hotelId;
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
        return "Room{" +
                "id=" + id +
                ", hotelId=" + hotelId +
                ", roomType='" + roomType + '\'' +
                ", price=" + price +
                ", rooms=" + rooms +
                '}';
    }
}
