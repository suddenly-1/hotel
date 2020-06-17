package com.yuantu.bl.order;

import com.yuantu.vo.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;


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

    /**
     * 评价
     * @param orderEvaluation
     * */
    ResponseVo evaluation(OrderEvaluation orderEvaluation);

    /**
     *查看自己预定过的酒店
     * @param userid
     * @param hotelid
     * @return
     */
   ResponseVo hotelReservationInfo(@Param("userid")Integer userid, @Param("hotelid")Integer hotelid,@Param("pageNum") Integer pageNum);
}
