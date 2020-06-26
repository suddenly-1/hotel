package com.yuantu.blImpl.order;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yuantu.bl.hotel.HotelService;
import com.yuantu.bl.hotel.RoomService;
import com.yuantu.bl.order.OrderService;
import com.yuantu.bl.user.AccountService;
import com.yuantu.bl.user.CreditService;
import com.yuantu.data.order.OrderMapper;
import com.yuantu.po.Credit;
import com.yuantu.po.Order;
import com.yuantu.po.Room;
import com.yuantu.po.User;
import com.yuantu.util.DateFormat;
import com.yuantu.util.PageUtil;
import com.yuantu.vo.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private HotelService hotelService;
    @Autowired
    private RoomService roomService;
    @Autowired
    private AccountService accountService;
    @Autowired
    private CreditService creditService;
    @Autowired
    private OrderMapper orderMapper;

    @Override
    public ResponseVo generateOrders(OrderVo orderVo) {
        // 类型转换
        Order order1 = new Order();
        BeanUtils.copyProperties(orderVo,order1);
        order1.setGenerationDate(DateFormat.StringConvertDate(orderVo.getGenerationDate()));
        order1.setStartDate(DateFormat.StringConvertDate(orderVo.getStartDate()));
        order1.setEndDate(DateFormat.StringConvertDate(orderVo.getEndDate()));
        order1.setLatestDate(DateFormat.StringConvertDate(orderVo.getLatestDate()));
        // 订单号UUID
        String s = new Date().getTime() + "";
        String time = s.substring(s.length() - 4, s.length());
        Integer random = (int)((Math.random()*9+1)*1000);
        order1.setOrderNumber(time+random+orderVo.getUser_id());
        orderMapper.addOrder(order1);

        // 超过最晚执行订单时间
        long latestTime = DateFormat.StringConvertDate(orderVo.getLatestDate()).getTime();
        long startTime = DateFormat.StringConvertDate(orderVo.getStartDate()).getTime();
        long interval = latestTime - startTime;
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Order order = orderMapper.queryOrderByOrderNumber(order1.getOrderNumber());
                if ("未执行".equals(order.getStatus())) {
                    orderMapper.updateOrder(new Order(null,order.getOrderNumber(),null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,"异常",null,null,null,null));
                    Double res = accountService.queryUserById(order.getUser_id()).getCredit()-order.getAmount();
                    accountService.updateUserInfo(new UserInfo(order.getUser_id(),null,null,null,res,null,null,null));
                    creditService.addCredit(new Credit(null,order.getUser_id(),new Date(),order.getOrderNumber(),"异常","-"+order.getAmount(),res));
                    // vip
                    User user = accountService.queryUserById(orderVo.getUser_id());
                    accountService.vip(orderVo.getUser_id(),user.getCredit());
                    System.out.println("超过最晚订单执行时间后还没有办理入住，系统自动将其置为异常订单！同时扣除用户等于订单的总价值的信用值!");
                }
            }
        },interval);
        return ResponseVo.buildSuccess(order1);
    }

    @Override
    public ResponseVo undoOrder(OrderStatus orderStatus) {
        long latestTime = DateFormat.StringConvertDate(orderStatus.getLatestDate()).getTime();
        long revocationTime = DateFormat.StringConvertDate(orderStatus.getRevocationTime()).getTime();
        long interval = latestTime - revocationTime;

        Order order = new Order();
        try {
            BeanUtils.copyProperties(orderStatus,order);
            order.setRevocationTime(DateFormat.StringConvertDate(orderStatus.getRevocationTime()));
            orderMapper.updateOrder(order);
            if (interval < 1000*60*60*6) {
                Double amount = orderStatus.getAmount()*1/2;
                Double res = accountService.queryUserById(orderStatus.getUser_id()).getCredit()-amount;
                accountService.updateUserInfo(new UserInfo(orderStatus.getUser_id(),null,null,null,res,null,null,null));
                creditService.addCredit(new Credit(null,orderStatus.getUser_id(),new Date(),orderStatus.getOrderNumber(),orderStatus.getStatus(),"-"+amount,res));
                // vip
                User user = accountService.queryUserById(orderStatus.getUser_id());
                accountService.vip(orderStatus.getUser_id(),user.getCredit());
                return ResponseVo.buildSuccess("撤销的订单距离最晚执行订单时间不足6小时，撤销同时扣除信用值，信用值为订单的（总价*1/2）!");
            }
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

            Double res = accountService.queryUserById(orderStatus.getUser_id()).getCredit() + orderStatus.getAmount();
            accountService.updateUserInfo(new UserInfo(orderStatus.getUser_id(),null,null,null,res,null,null,null));
            creditService.addCredit(new Credit(null,orderStatus.getUser_id(),new Date(),orderStatus.getOrderNumber(),orderStatus.getStatus(),"+"+orderStatus.getAmount(),res));
            // vip
            User user = accountService.queryUserById(orderStatus.getUser_id());
            accountService.vip(orderStatus.getUser_id(),user.getCredit());
            return ResponseVo.buildSuccess();
        } catch (Exception e) {
            System.out.println("执行错误！");
            return ResponseVo.buildFailure("执行错误！");
        }
    }

    @Override
    public ResponseVo queryOrderByStatus(OrderPage orderPage) {
        Order order = new Order();
        try {
            order.setHotel_id(orderPage.getHotel_id());
            order.setUser_id(orderPage.getUser_id());
            order.setStatus(orderPage.getStatus());

            PageHelper.startPage(orderPage.getPageNum(),orderPage.getPageSize());
            List<Order> orders = orderMapper.queryOrderByStatus(order);
            List<OrderInfo> orderInfoList = new ArrayList<>();
            for (int i = 0; i < orders.size(); i++){
                OrderInfo orderInfo = new OrderInfo();
                BeanUtils.copyProperties(orders.get(i),orderInfo);
                if(orders.get(i).getScore() == null){
                    orderInfo.setScore(0.0);
                }
                if(orders.get(i).getGenerationDate() != null){
                    orderInfo.setGenerationDate(DateFormat.DateConvertString(orders.get(i).getGenerationDate()));
                }
                if(orders.get(i).getStartDate() != null) {
                    orderInfo.setStartDate(DateFormat.DateConvertString(orders.get(i).getStartDate()));
                }
                if(orders.get(i).getEndDate() != null) {
                    orderInfo.setEndDate(DateFormat.DateConvertString(orders.get(i).getEndDate()));
                }
                if(orders.get(i).getLatestDate() != null) {
                    orderInfo.setLatestDate(DateFormat.DateConvertString(orders.get(i).getLatestDate()));
                }
                if(orders.get(i).getRevocationTime() != null) {
                    orderInfo.setRevocationTime(DateFormat.DateConvertString(orders.get(i).getRevocationTime()));
                }
                orderInfoList.add(orderInfo);
            }
            PageInfo pageInfo = new PageInfo(orders);
            pageInfo.setList(orderInfoList);
            return ResponseVo.buildSuccess(pageInfo);
        } catch (Exception e) {
            System.out.println("查询订单错误！");
            return ResponseVo.buildFailure("查询订单错误！");
        }
    }

    @Override
    public ResponseVo queryOrderByOrderNumber(String orderNumber) {
        Order order = orderMapper.queryOrderByOrderNumber(orderNumber);
        OrderInfo orderInfo = new OrderInfo();
        BeanUtils.copyProperties(order,orderInfo);
        if(order.getGenerationDate() != null) {
            orderInfo.setGenerationDate(DateFormat.DateConvertString(order.getGenerationDate()));
        }
        if(order.getStartDate() != null) {
            orderInfo.setStartDate(DateFormat.DateConvertString(order.getStartDate()));
        }
        if(order.getEndDate() != null) {
            orderInfo.setEndDate(DateFormat.DateConvertString(order.getEndDate()));
        }
        if(order.getLatestDate() != null) {
            orderInfo.setLatestDate(DateFormat.DateConvertString(order.getLatestDate()));
        }
        if(order.getRevocationTime() != null) {
            orderInfo.setRevocationTime(DateFormat.DateConvertString(order.getRevocationTime()));
        }
        return ResponseVo.buildSuccess(orderInfo);
    }

    @Override
    public ResponseVo supplementaryExecution(OrderStatus orderStatus) {
        Credit credit = creditService.creditDetails(orderStatus.getOrderNumber(), orderStatus.getStatus());
        Double res = Double.valueOf(credit.getCreditChange().substring(1));
        Double creditResult = credit.getCreditResult();
        Double result = res + creditResult;

        orderMapper.updateOrder(new Order(null,orderStatus.getOrderNumber(),null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,"已执行",null,null,null,null));
        accountService.updateUserInfo(new UserInfo(credit.getUserId(),null,null,null,result,null,null,null));
        creditService.addCredit(new Credit(null,credit.getUserId(),new Date(),credit.getOrderNumber(),"已执行","-"+res,result));
        // vip
        User user = accountService.queryUserById(orderStatus.getUser_id());
        accountService.vip(orderStatus.getUser_id(),user.getCredit());
        return ResponseVo.buildSuccess();
    }

    @Override
    public ResponseVo evaluation(OrderEvaluation orderEvaluation) {
        Order order = new Order();
        BeanUtils.copyProperties(orderEvaluation, order);
        Order order1 = orderMapper.queryOrderByOrderNumber(orderEvaluation.getOrderNumber());
        System.out.println(order1);
        if (order1.getScore() == null) {
            if ("已执行".equals(order1.getStatus())) {
                orderMapper.evaluation(order);
                return ResponseVo.buildSuccess();
            } else {
                return ResponseVo.buildFailure("只能评价已执行订单！");
            }
        } else {
            return ResponseVo.buildFailure("该订单已评价！");
        }
    }

    @Override
    public ResponseVo hotelReservationInfo(Integer userid, Integer hotelid,Integer pageNum) {
        PageHelper.startPage(pageNum, PageUtil.pageSize);
        List<Order> orders = orderMapper.hotelReservation(userid, hotelid);
        List<OrderVo> voList = new LinkedList<>();
        PageInfo pageInfo = new PageInfo(orders);
        pageInfo.setList(voList);
        for (int i = 0; i < orders.size(); i++) {
            OrderVo orderVo = new OrderVo();
            orderVo.setStartDate(DateFormat.DateConvertString(orders.get(i).getStartDate()));
            orderVo.setEndDate(DateFormat.DateConvertString(orders.get(i).getEndDate()));
            BeanUtils.copyProperties(orders.get(i), orderVo);
            voList.add(orderVo);
        }
        return ResponseVo.buildSuccess(pageInfo);
    }

}
