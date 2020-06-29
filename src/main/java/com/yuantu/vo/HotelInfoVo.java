package com.yuantu.vo;


/**
 * @Author caobo
 * @Date:2020-05-29
 */
public class HotelInfoVo {
  private Integer id;
  private String hotelName;//酒店名称
  private String address;//酒店地址
  private String businessDistrict;//酒店所属商圈
  private String introduction;//酒店简介
  private String facilities;//设施服务
  private Integer star;//酒店星级
  private Integer score;//酒店评分
  private Integer averagePrice;//平均价格

  public HotelInfoVo() {
  }

  public HotelInfoVo(Integer id, String hotelName, String address, String businessDistrict, String introduction, String facilities, Integer star, Integer score, Integer averagePrice) {
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
    return "HotelInfoVo{" +
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
