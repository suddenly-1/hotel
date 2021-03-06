package com.yuantu.data.order;

import com.yuantu.po.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface OrderMapper {

    /**
     * 增加订单
     *
     * @param order
     */
    void addOrder(Order order);

    /**
     * 修改订单
     *
     * @param order
     */
    void updateOrder(Order order);

    /**
     * 按状态查询订单
     *
     * @param order
     */
    List<Order> queryOrderByStatus(Order order);

    /**
     * 按订单号查询
     *
     * @param orderNumber
     */
    Order queryOrderByOrderNumber(String orderNumber);

    /**
     * 查询订单以今天的时间
     *
     * @param order
     */
    List<Order> queryOrderByTodayTime(Order order);

    /**
     * 评价
     *
     * @param order
     */
    void evaluation(Order order);

    /**
     * 查看自己预定过的酒店
     *
     * @param userid
     * @param hotelid
     * @return
     */
    List<Order> hotelReservation(@Param("userid") Integer userid, @Param("hotelid") Integer hotelid);

}
