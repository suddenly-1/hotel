package com.yuantu.vo;

import java.util.Arrays;

public class RoomDto {
    private Integer hotelId;//酒店id
    private String startTime;//起始时间
    private String endTime;//结束时间

    public RoomDto() {
    }

    public RoomDto(Integer hotelId, String startTime, String endTime) {
        this.hotelId = hotelId;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public Integer getHotelId() {
        return hotelId;
    }

    public void setHotelId(Integer hotelId) {
        this.hotelId = hotelId;
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

    @Override
    public String toString() {
        return "RoomDto{" +
                "hotelId=" + hotelId +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                '}';
    }
}

