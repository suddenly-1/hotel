package com.yuantu.controller.order;

import com.alibaba.fastjson.JSON;
import com.yuantu.bl.order.OrderService;
import com.yuantu.po.Order;
import com.yuantu.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/generateOrders")
    public String generateOrders(@RequestBody OrderVo orderVo) {
        return JSON.toJSONString(orderService.generateOrders(orderVo));
    }

    @PostMapping("/undoOrder")
    public String undoOrder(@RequestBody OrderStatus orderStatus) {
        return JSON.toJSONString(orderService.undoOrder(orderStatus));
    }

    @PostMapping("/ordersExecuted")
    public String ordersExecuted(@RequestBody OrderStatus orderStatus) {
        return JSON.toJSONString(orderService.ordersExecuted(orderStatus));
    }

    @PostMapping("/queryOrderByStatus")
    public String queryOrderByStatus(@RequestBody OrderPage orderPage) {
        return JSON.toJSONString(orderService.queryOrderByStatus(orderPage));
    }

    @GetMapping("/queryOrderByOrderNumber/{orderNumber}")
    public String queryOrderByOrderNumber(@PathVariable String orderNumber) {
        return JSON.toJSONString(orderService.queryOrderByOrderNumber(orderNumber));
    }

    @PostMapping("/supplementaryExecution")
    public String supplementaryExecution(@RequestBody OrderStatus orderStatus) {
        return JSON.toJSONString(orderService.supplementaryExecution(orderStatus));
    }

    @PostMapping("/checkOut")
    public String checkOut(@RequestBody OrderStatus orderStatus) {
        return JSON.toJSONString(orderService.checkOut(orderStatus));
    }

    @PostMapping("/evaluation")
    public String evaluation(@RequestBody OrderEvaluation orderEvaluation) {
        return JSON.toJSONString(orderService.evaluation(orderEvaluation));
    }

    @PostMapping("/queryOrderByTodayTime")
    public String queryOrderByTodayTime(@RequestBody Order order) {
        return JSON.toJSONString(orderService.queryOrderByTodayTime(order));
    }

    //    预定过的酒店列表
    @GetMapping(value = {"/reserve/{userid}/{hotelid}", "/reserve/{userid}"})
    public ResponseVo reserve(@PathVariable Integer userid, @PathVariable(required = false) Integer hotelid, @RequestParam(value = "pageNum") Integer pageNum) {
        return ResponseVo.buildSuccess(orderService.hotelReservationInfo(userid, hotelid, pageNum));
    }

}
