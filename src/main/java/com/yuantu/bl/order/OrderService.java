package com.yuantu.bl.order;

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
     * 按状态查询
     * @param orderStatus
     * */
        ResponseVo queryOrderByStatus(OrderStatus orderStatus);

}
