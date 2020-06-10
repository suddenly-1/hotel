package com.yuantu;

import com.yuantu.bl.order.OrderService;
import com.yuantu.data.order.OrderMapper;
import com.yuantu.data.user.CreditMapper;
import com.yuantu.po.Credit;
import com.yuantu.po.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;



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


        System.out.println("--------------------------------");
    }
}
