package com.yuantu.vo;

/**
 * @Author caobo
 * @Date:2020-05-29
 */
public class HotelInfoVo {
  private String address;//酒店地址
  private String businessDistrict;//酒店所属商圈
  private String introduction;//酒店简介
  private String facilities;//设施服务
  private String star;//酒店星级

  public HotelInfoVo() {
  }

  public HotelInfoVo(String address, String businessDistrict, String introduction, String facilities, String star) {
    this.address = address;
    this.businessDistrict = businessDistrict;
    this.introduction = introduction;
    this.facilities = facilities;
    this.star = star;
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
    return "HotelInfoVo{" +
      "address='" + address + '\'' +
      ", businessDistrict='" + businessDistrict + '\'' +
      ", introduction='" + introduction + '\'' +
      ", facilities='" + facilities + '\'' +
      ", star='" + star + '\'' +
      '}';
  }
}
