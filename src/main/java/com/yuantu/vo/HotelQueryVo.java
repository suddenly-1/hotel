package com.yuantu.vo;


public class HotelQueryVo {
    private String address;//目的地
    private String hotelName;//酒店名称
    private String startTime;//起始时间
    private String endTime;//结束时间
    private String businessDistrict;//商圈
    private Integer star;//酒店星级
    private Double score1;//酒店评分
    private Double score2;//酒店评分
    private Double price1;//酒店价格
    private Double price2;//酒店价格
    private String roomType;//房间类型
    private Integer roomNumber;//房间数量
    private String starSort;//星级排序
    private String scoreSort;//评分排序
    private String priceSort;//价格排序

    public HotelQueryVo() {
    }

    public HotelQueryVo(String address, String hotelName, String startTime, String endTime, String businessDistrict, Integer star, Double score1, Double score2, Double price1, Double price2, String roomType, Integer roomNumber, String starSort, String scoreSort, String priceSort) {
        this.address = address;
        this.hotelName = hotelName;
        this.startTime = startTime;
        this.endTime = endTime;
        this.businessDistrict = businessDistrict;
        this.star = star;
        this.score1 = score1;
        this.score2 = score2;
        this.price1 = price1;
        this.price2 = price2;
        this.roomType = roomType;
        this.roomNumber = roomNumber;
        this.starSort = starSort;
        this.scoreSort = scoreSort;
        this.priceSort = priceSort;
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

    public Double getScore1() {
        return score1;
    }

    public void setScore1(Double score1) {
        this.score1 = score1;
    }

    public Double getScore2() {
        return score2;
    }

    public void setScore2(Double score2) {
        this.score2 = score2;
    }

    public Double getPrice1() {
        return price1;
    }

    public void setPrice1(Double price1) {
        this.price1 = price1;
    }

    public Double getPrice2() {
        return price2;
    }

    public void setPrice2(Double price2) {
        this.price2 = price2;
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

    public String getStarSort() {
        return starSort;
    }

    public void setStarSort(String starSort) {
        this.starSort = starSort;
    }

    public String getScoreSort() {
        return scoreSort;
    }

    public void setScoreSort(String scoreSort) {
        this.scoreSort = scoreSort;
    }

    public String getPriceSort() {
        return priceSort;
    }

    public void setPriceSort(String priceSort) {
        this.priceSort = priceSort;
    }

    @Override
    public String toString() {
        return "HotelQueryVo{" +
                "address='" + address + '\'' +
                ", hotelName='" + hotelName + '\'' +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", businessDistrict='" + businessDistrict + '\'' +
                ", star=" + star +
                ", score1=" + score1 +
                ", score2=" + score2 +
                ", price1=" + price1 +
                ", price2=" + price2 +
                ", roomType='" + roomType + '\'' +
                ", roomNumber=" + roomNumber +
                ", starSort='" + starSort + '\'' +
                ", scoreSort='" + scoreSort + '\'' +
                ", priceSort='" + priceSort + '\'' +
                '}';
    }
}
