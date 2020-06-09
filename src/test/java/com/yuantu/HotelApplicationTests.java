package com.yuantu;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.yuantu.bl.order.OrderService;
import com.yuantu.data.order.OrderMapper;
import com.yuantu.data.user.CreditMapper;
import com.yuantu.po.Credit;
import com.yuantu.po.Order;
import com.yuantu.util.DateFormat;
import com.yuantu.vo.OrderStatus;
import com.yuantu.vo.OrderVo;
import javafx.scene.input.DataFormat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;


@SpringBootTest
public class HotelApplicationTests {

    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private OrderService orderService;
    @Autowired
    private CreditMapper creditMapper;

    @Test
    public void getRoomMapper() {
        System.out.println("--------------------------------");


//        Order order = new Order(null, "123456789", 1, 1, "酒店名", DateFormat.StringConvertDate("2020-06-04 15:20"), DateFormat.StringConvertDate("2020-06-05 14:00"), DateFormat.StringConvertDate("2020-06-06 12:00"), DateFormat.StringConvertDate("2020-06-06 01:00"), "单人间", 1, 1, 1, "已撤销", 1.0, null, null, null);
//        System.out.println(orderMapper.queryOrder(order));

//        System.out.println(orderService.queryOrderByStatus(new OrderStatus(null,1,"已撤销",null)));

//        Credit credit = creditMapper.queryCreditById(1);
//        System.out.println(credit);
//        List<Credit> credits = creditMapper.queryCreditByUserId(1);
//        System.out.println(credits);

        creditMapper.addCredit(new Credit(null,1,new Date(),"555","已撤销","扣除信用10",90));

        System.out.println("--------------------------------");
    }
}
