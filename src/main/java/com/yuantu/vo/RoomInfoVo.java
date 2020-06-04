package com.yuantu.vo;

public class RoomInfoVo {
  private String roomType;
  private Double price;
  private Integer rooms;

  public RoomInfoVo() {
  }

  public RoomInfoVo(String roomType, Double price, Integer rooms) {
    this.roomType = roomType;
    this.price = price;
    this.rooms = rooms;
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
      "roomType='" + roomType + '\'' +
      ", price=" + price +
      ", rooms=" + rooms +
      '}';
  }
}
