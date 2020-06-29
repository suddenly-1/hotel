package com.yuantu.vo;

public class HotelWorkInfoVo {
  private Integer id;
  private String hotelName;
  private String address;
  private String businessDistrict;
  private String userName;
  private String accountNumber;
  private String password;
  private String phone;
  private String birthday;

  public HotelWorkInfoVo() {
  }

  public HotelWorkInfoVo(Integer id, String hotelName, String address, String businessDistrict, String userName, String accountNumber, String password, String phone, String birthday) {
    this.id = id;
    this.hotelName = hotelName;
    this.address = address;
    this.businessDistrict = businessDistrict;
    this.userName = userName;
    this.accountNumber = accountNumber;
    this.password = password;
    this.phone = phone;
    this.birthday = birthday;
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

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getBirthday() {
    return birthday;
  }

  public void setBirthday(String birthday) {
    this.birthday = birthday;
  }

  @Override
  public String toString() {
    return "HotelWorkInfoVo{" +
      "id=" + id +
      ", hotelName='" + hotelName + '\'' +
      ", address='" + address + '\'' +
      ", businessDistrict='" + businessDistrict + '\'' +
      ", userName='" + userName + '\'' +
      ", accountNumber='" + accountNumber + '\'' +
      ", password='" + password + '\'' +
      ", phone='" + phone + '\'' +
      ", birthday='" + birthday + '\'' +
      '}';
  }
}
