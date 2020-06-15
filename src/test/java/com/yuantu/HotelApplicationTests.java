package com.yuantu;


import com.yuantu.data.order.OrderMapper;
import com.yuantu.po.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
public class HotelApplicationTests {

  @Autowired
    OrderMapper orderMapper;
  @Test
    public void test() {
    /*List<Order> orders = orderMapper.hotelReservation(null,1);
        System.out.println(orders);*/
    }

}

