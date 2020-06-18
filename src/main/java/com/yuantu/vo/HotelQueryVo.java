package com.yuantu.vo;


import java.util.Arrays;

public class HotelQueryVo {
  private String address;//目的地
  private String hotelName;//酒店名称
  private String startTime;//起始时间
  private String endTime;//结束时间
  private String businessDistrict;//商圈
  private Integer star;//酒店星级
  private Double[] score;//酒店评分
  private Double[] price;//酒店价格
  private String roomType;//房间类型
  private Integer roomNumber;//房间数量

  public HotelQueryVo() {
  }

  public HotelQueryVo(String address, String hotelName, String startTime, String endTime, String businessDistrict, Integer star, Double[] score, Double[] price, String roomType, Integer roomNumber) {
    this.address = address;
    this.hotelName = hotelName;
    this.startTime = startTime;
    this.endTime = endTime;
    this.businessDistrict = businessDistrict;
    this.star = star;
    this.score = score;
    this.price = price;
    this.roomType = roomType;
    this.roomNumber = roomNumber;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getHotelName() {
    return hotelName;
  }

  public void setHotelName(String hotelName) {
    this.hotelName = hotelName;
  }

  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  public String getBusinessDistrict() {
    return businessDistrict;
  }

  public void setBusinessDistrict(String businessDistrict) {
    this.businessDistrict = businessDistrict;
  }

  public Integer getStar() {
    return star;
  }

  public void setStar(Integer star) {
    this.star = star;
  }

  public Double[] getScore() {
    return score;
  }

  public void setScore(Double[] score) {
    this.score = score;
  }

  public Double[] getPrice() {
    return price;
  }

  public void setPrice(Double[] price) {
    this.price = price;
  }

  public String getRoomType() {
    return roomType;
  }

  public void setRoomType(String roomType) {
    this.roomType = roomType;
  }

  public Integer getRoomNumber() {
    return roomNumber;
  }

  public void setRoomNumber(Integer roomNumber) {
    this.roomNumber = roomNumber;
  }

  @Override
  public String toString() {
    return "HotelQueryDto{" +
      "address='" + address + '\'' +
      ", hotelName='" + hotelName + '\'' +
      ", startTime='" + startTime + '\'' +
      ", endTime='" + endTime + '\'' +
      ", businessDistrict='" + businessDistrict + '\'' +
      ", star=" + star +
      ", score=" + Arrays.toString(score) +
      ", price=" + Arrays.toString(price) +
      ", roomType='" + roomType + '\'' +
      ", roomNumber=" + roomNumber +
      '}';
  }
}
