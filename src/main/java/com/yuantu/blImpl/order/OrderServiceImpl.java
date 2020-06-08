package com.yuantu.blImpl.order;

import com.yuantu.bl.order.OrderService;
import com.yuantu.bl.user.AccountService;
import com.yuantu.data.order.OrderMapper;
import com.yuantu.po.Order;
import com.yuantu.po.User;
import com.yuantu.util.DateFormat;
import com.yuantu.vo.OrderStatus;
import com.yuantu.vo.OrderVo;
import com.yuantu.vo.ResponseVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private AccountService accountService;
    @Autowired
    private OrderMapper orderMapper;

    @Override
    public ResponseVo generateOrders(OrderVo orderVo) {
        Order order = new Order();
        BeanUtils.copyProperties(orderVo,order);
        order.setGenerationDate(DateFormat.StringConvertDate(orderVo.getGenerationDate()));
        order.setStartDate(DateFormat.StringConvertDate(orderVo.getStartDate()));
        order.setEndDate(DateFormat.StringConvertDate(orderVo.getEndDate()));
        order.setLatestDate(DateFormat.StringConvertDate(orderVo.getLatestDate()));
        orderMapper.addOrder(order);
        return ResponseVo.buildSuccess(orderVo);
    }

    @Override
    public ResponseVo undoOrder(OrderStatus orderStatus) {
//        System.out.println(orderStatus.toString());
//        User user = accountService.queryUserById(orderStatus.getUser_id());
//        System.out.println("user的信用：" + user.getCredit());
        Order order = new Order();
        try {
            BeanUtils.copyProperties(orderStatus,order);
            order.setRevocationTime(DateFormat.StringConvertDate(orderStatus.getRevocationTime()));
            orderMapper.updateOrder(order);
            return ResponseVo.buildSuccess();
        } catch (Exception e) {
            System.out.println("撤销错误！");
            return ResponseVo.buildFailure("撤销错误！");
        }
    }

    @Override
    public ResponseVo ordersExecuted(OrderStatus orderStatus) {
        Order order = new Order();
        try {
            BeanUtils.copyProperties(orderStatus,order);
            orderMapper.updateOrder(order);
            return ResponseVo.buildSuccess();
        } catch (Exception e) {
            System.out.println("执行错误！");
            return ResponseVo.buildFailure("执行错误！");
        }
    }

    @Override
    public ResponseVo queryOrderByStatus(OrderStatus orderStatus) {
        Order order = new Order();
        try {
            BeanUtils.copyProperties(orderStatus,order);
            List<Order> orders = orderMapper.queryOrderByStatus(order);
            return ResponseVo.buildSuccess(orders);
        } catch (Exception e) {
            System.out.println("查询订单错误！");
            return ResponseVo.buildFailure("查询订单错误！");
        }
    }

}
