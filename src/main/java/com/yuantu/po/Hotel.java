package com.yuantu.po;

import java.util.List;

public class Hotel {
    private Integer id;
    private String hotelName;
    private String address;
    private String businessDistrict;
    private String introduction;
    private String facilities;
    private Integer star;
    private Integer score;
    private Integer averagePrice;

    public Hotel() {
    }

    public Hotel(Integer id, String hotelName, String address, String businessDistrict, String introduction, String facilities, Integer star, Integer score, Integer averagePrice) {
        this.id = id;
        this.hotelName = hotelName;
        this.address = address;
        this.businessDistrict = businessDistrict;
        this.introduction = introduction;
        this.facilities = facilities;
        this.star = star;
        this.score = score;
        this.averagePrice = averagePrice;
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

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getAveragePrice() {
        return averagePrice;
    }

    public void setAveragePrice(Integer averagePrice) {
        this.averagePrice = averagePrice;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "id=" + id +
                ", hotelName='" + hotelName + '\'' +
                ", address='" + address + '\'' +
                ", businessDistrict='" + businessDistrict + '\'' +
                ", introduction='" + introduction + '\'' +
                ", facilities='" + facilities + '\'' +
                ", star=" + star +
                ", score=" + score +
                ", averagePrice=" + averagePrice +
                '}';
    }
}
