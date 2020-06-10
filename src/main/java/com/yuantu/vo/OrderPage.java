package com.yuantu.vo;

public class OrderPage {
    private Integer hotel_id;
    private Integer user_id;            //用户id
    private String status;              //状态（已完成、未完成、已撤销、异常）
    private Integer pageNum;            //页数
    private Integer pageSize;           //每页记录条数

    public OrderPage() {
    }

    public OrderPage(Integer hotel_id, Integer user_id, String status, Integer pageNum, Integer pageSize) {
        this.hotel_id = hotel_id;
        this.user_id = user_id;
        this.status = status;
        this.pageNum = pageNum;
        this.pageSize = pageSize;
    }

    public Integer getHotel_id() {
        return hotel_id;
    }

    public void setHotel_id(Integer hotel_id) {
        this.hotel_id = hotel_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    @Override
    public String toString() {
        return "OrderPage{" +
                "hotel_id=" + hotel_id +
                ", user_id=" + user_id +
                ", status='" + status + '\'' +
                ", pageNum=" + pageNum +
                ", pageSize=" + pageSize +
                '}';
    }
}
