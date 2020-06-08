package com.yuantu.data.order;

import com.yuantu.po.Order;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface OrderMapper {

    /**
     * 增加订单
     * @param order
    * */
    void addOrder(Order order);

    /**
     * 修改订单
     * @param order
     * */
    void updateOrder(Order order);

    /**
     * 查询订单
     * @param order
     * */
    List<Order> queryOrderByStatus(Order order);

}
