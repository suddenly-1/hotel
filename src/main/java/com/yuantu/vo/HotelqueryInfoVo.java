package com.yuantu.vo;

public class HotelqueryInfoVo {
  private Integer id;
  private String hotelName;//酒店名称
  private String address;//酒店地址
  private String businessDistrict;//酒店所属商圈
  private String introduction;//酒店简介
  private String facilities;//设施服务
  private Integer star;//酒店星级
  private Double score;//酒店评分
  private Integer price;//酒店价格
  private String roomType;//房间类型
  private Integer rooms;//房间数量
  private Integer roomNumber;//订购数量
  private Integer numbers;//剩余房间
  private String  state;//房间状态


  public HotelqueryInfoVo() {
  }

  public HotelqueryInfoVo(Integer id, String hotelName, String address, String businessDistrict, String introduction, String facilities, Integer star, Double score, Integer price, String roomType, Integer rooms, Integer roomNumber, Integer numbers, String state) {
    this.id = id;
    this.hotelName = hotelName;
    this.address = address;
    this.businessDistrict = businessDistrict;
    this.introduction = introduction;
    this.facilities = facilities;
    this.star = star;
    this.score = score;
    this.price = price;
    this.roomType = roomType;
    this.rooms = rooms;
    this.roomNumber = roomNumber;
    this.numbers = numbers;
    this.state = state;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getHotelName() {
    return hotelName;
  }

  public void setHotelName(String hotelName) {
    this.hotelName = hotelName;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getBusinessDistrict() {
    return businessDistrict;
  }

  public void setBusinessDistrict(String businessDistrict) {
    this.businessDistrict = businessDistrict;
  }

  public String getIntroduction() {
    return introduction;
  }

  public void setIntroduction(String introduction) {
    this.introduction = introduction;
  }

  public String getFacilities() {
    return facilities;
  }

  public void setFacilities(String facilities) {
    this.facilities = facilities;
  }

  public Integer getStar() {
    return star;
  }

  public void setStar(Integer star) {
    this.star = star;
  }

  public Double getScore() {
    return score;
  }

  public void setScore(Double score) {
    this.score = score;
  }

  public Integer getPrice() {
    return price;
  }

  public void setPrice(Integer price) {
    this.price = price;
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
    return "HotelqueryInfoVo{" +
      "id=" + id +
      ", hotelName='" + hotelName + '\'' +
      ", address='" + address + '\'' +
      ", businessDistrict='" + businessDistrict + '\'' +
      ", introduction='" + introduction + '\'' +
      ", facilities='" + facilities + '\'' +
      ", star=" + star +
      ", score=" + score +
      ", price=" + price +
      ", roomType='" + roomType + '\'' +
      ", rooms=" + rooms +
      ", roomNumber=" + roomNumber +
      ", numbers=" + numbers +
      ", state='" + state + '\'' +
      '}';
  }
}
