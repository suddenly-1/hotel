package com.yuantu.po;

public class Hotel {
    private Integer id;
    private String hotelDame;
    private String address;
    private String businessDistrict;
    private String introduction;
    private String facilities;
    private String star;

    public Hotel() {
    }

    public Hotel(Integer id, String hotelDame, String address, String businessDistrict, String introduction, String facilities, String star) {
        this.id = id;
        this.hotelDame = hotelDame;
        this.address = address;
        this.businessDistrict = businessDistrict;
        this.introduction = introduction;
        this.facilities = facilities;
        this.star = star;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHotelDame() {
        return hotelDame;
    }

    public void setHotelDame(String hotelDame) {
        this.hotelDame = hotelDame;
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

    public String getStar() {
        return star;
    }

    public void setStar(String star) {
        this.star = star;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "id=" + id +
                ", hotelDame='" + hotelDame + '\'' +
                ", address='" + address + '\'' +
                ", businessDistrict='" + businessDistrict + '\'' +
                ", introduction='" + introduction + '\'' +
                ", facilities='" + facilities + '\'' +
                ", star='" + star + '\'' +
                '}';
    }
}
