package com.yuantu.bl.order;

import com.yuantu.vo.OrderPage;
import com.yuantu.vo.OrderStatus;
import com.yuantu.vo.OrderVo;
import com.yuantu.vo.ResponseVo;


public interface OrderService {

    /**
     * 生成订单
     * @param orderVo
     * */
    ResponseVo generateOrders(OrderVo orderVo);

    /**
     * 撤销订单
     * @param orderStatus
     * */
    ResponseVo undoOrder(OrderStatus orderStatus);

    /**
     * 执行订单
     * @param orderStatus
     * */
    ResponseVo ordersExecuted(OrderStatus orderStatus);

    /**
     * 按状态查询list
     * @param orderPage
     * */
     ResponseVo queryOrderByStatus(OrderPage orderPage);

    /**
     * 按订单号查询订单
     * @param orderNumber
     * */
    ResponseVo queryOrderByOrderNumber(String orderNumber);

    /**
     * 补登记执行
     * @param orderStatus
     * */
    ResponseVo supplementaryExecution(OrderStatus orderStatus);

}
