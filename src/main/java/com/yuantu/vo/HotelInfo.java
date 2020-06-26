package com.yuantu.vo;

import java.util.List;

public class HotelInfo {
    private Integer id;
    private String hotelName;//酒店名称
    private String address;//酒店地址
    private String businessDistrict;//酒店所属商圈
    private String introduction;//酒店简介
    private String facilities;//设施服务
    private Integer star;//酒店星级
    private Double score;//酒店评分
    private Double price;//酒店评分
    private List<RoomInfo> roomInfo;//房间list

    public HotelInfo() {
    }

    public HotelInfo(Integer id, String hotelName, String address, String businessDistrict, String introduction, String facilities, Integer star, Double score, Double price, List<RoomInfo> roomInfo) {
        this.id = id;
        this.hotelName = hotelName;
        this.address = address;
        this.businessDistrict = businessDistrict;
        this.introduction = introduction;
        this.facilities = facilities;
        this.star = star;
        this.score = score;
        this.price = price;
        this.roomInfo = roomInfo;
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public List<RoomInfo> getRoomInfo() {
        return roomInfo;
    }

    public void setRoomInfo(List<RoomInfo> roomInfo) {
        this.roomInfo = roomInfo;
    }

    @Override
    public String toString() {
        return "HotelInfo{" +
                "id=" + id +
                ", hotelName='" + hotelName + '\'' +
                ", address='" + address + '\'' +
                ", businessDistrict='" + businessDistrict + '\'' +
                ", introduction='" + introduction + '\'' +
                ", facilities='" + facilities + '\'' +
                ", star=" + star +
                ", score=" + score +
                ", price=" + price +
                ", roomInfo=" + roomInfo +
                '}';
    }
}
