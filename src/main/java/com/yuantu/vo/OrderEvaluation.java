package com.yuantu.vo;

public class OrderEvaluation {

    private String orderNumber;     //订单号
    private Double score;           //评分
    private String comment;         //评论

    public OrderEvaluation() {
    }

    public OrderEvaluation(String orderNumber, Double score, String comment) {
        this.orderNumber = orderNumber;
        this.score = score;
        this.comment = comment;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "OrderEvaluation{" +
                "orderNumber='" + orderNumber + '\'' +
                ", score=" + score +
                ", comment='" + comment + '\'' +
                '}';
    }
}
