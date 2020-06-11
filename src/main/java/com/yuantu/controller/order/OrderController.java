package com.yuantu.controller.order;

import com.alibaba.fastjson.JSON;
import com.yuantu.bl.order.OrderService;
import com.yuantu.vo.OrderEvaluation;
import com.yuantu.vo.OrderPage;
import com.yuantu.vo.OrderStatus;
import com.yuantu.vo.OrderVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/generateOrders")
    public String generateOrders(@RequestBody OrderVo orderVo){
        return JSON.toJSONString(orderService.generateOrders(orderVo));
    }

    @PostMapping("/undoOrder")
    public String undoOrder(@RequestBody OrderStatus orderStatus){
        return JSON.toJSONString(orderService.undoOrder(orderStatus));
    }

    @PostMapping("/ordersExecuted")
    public String ordersExecuted(@RequestBody OrderStatus orderStatus){
        return JSON.toJSONString(orderService.ordersExecuted(orderStatus));
    }

    @PostMapping("/queryOrderByStatus")
    public String queryOrderByStatus(@RequestBody OrderPage orderPage){
        return JSON.toJSONString(orderService.queryOrderByStatus(orderPage));
    }

    @GetMapping("/queryOrderByOrderNumber/{orderNumber}")
    public String queryOrderByOrderNumber(@PathVariable String orderNumber){
        return JSON.toJSONString(orderService.queryOrderByOrderNumber(orderNumber));
    }

    @PostMapping("/supplementaryExecution")
    public String supplementaryExecution(@RequestBody OrderStatus orderStatus){
        return JSON.toJSONString(orderService.supplementaryExecution(orderStatus));
    }

    @PostMapping("/evaluation")
    public String evaluation(@RequestBody OrderEvaluation orderEvaluation){
        return JSON.toJSONString(orderService.evaluation(orderEvaluation));
    }

}
