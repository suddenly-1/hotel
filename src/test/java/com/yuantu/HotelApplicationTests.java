package com.yuantu;


import com.yuantu.bl.admin.AdminService;
import com.yuantu.bl.hotel.HotelService;
import com.yuantu.bl.order.OrderService;
import com.yuantu.data.order.OrderMapper;
import com.yuantu.po.Hotel;
import com.yuantu.po.Order;
import com.yuantu.vo.OrderVo;
import com.yuantu.vo.ResponseVo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
public class HotelApplicationTests {

  @Autowired
  OrderService order;
  @Autowired
  AdminService admin;
  @Autowired
  HotelService hotel;
  @Test
    public void test() {
    /*ResponseVo responseVo = order.hotelReservationInfo(1, 1, 1);
    System.out.println(responseVo);*/
    /*ResponseVo vo = admin.queryUserInfo("客户", 1);
    System.out.println(vo);*/

    ResponseVo hotelInfo = hotel.getHotelInfo("天河区", "广州", 1, 1);
    System.out.println(hotelInfo);
  }

}

