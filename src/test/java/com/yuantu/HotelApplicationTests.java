package com.yuantu;


import com.yuantu.bl.hotel.HotelService;
import com.yuantu.bl.hotel.RoomService;
import com.yuantu.bl.user.AccountService;
import com.yuantu.bl.user.AdminService;
import com.yuantu.data.hotel.HotelMapper;
import com.yuantu.data.hotel.RoomMapper;
import com.yuantu.data.user.AccountMapper;
import com.yuantu.data.user.AdminMapper;
import com.yuantu.po.*;
import com.yuantu.util.PageUtil;
import com.yuantu.vo.*;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.yuantu.bl.order.OrderService;
import com.yuantu.data.order.OrderMapper;
import com.yuantu.data.user.CreditMapper;
import com.yuantu.util.DateFormat;
import javafx.scene.input.DataFormat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import javax.annotation.Resource;
import java.util.List;


import java.util.Date;
import java.util.List;



@SpringBootTest
public class HotelApplicationTests {

    @Autowired
   RoomMapper roomMapper;
    @Autowired
    HotelMapper hotelMapper;
    @Autowired
    RoomService room;
    @Autowired
    HotelService hotelService;

  @Autowired
   AdminMapper Mapper;

  @Autowired
  AdminService adminService;



@Test
public void test() {

  /*List<User> user = Mapper.selectUser("客户");
  System.out.println(user);*/
  /* List<UserInfoVo> user = adminService.queryUserInfo("客户",1);

  for (UserInfoVo userInfoVo : user) {
    System.out.println(userInfoVo);
  }*/
    User user = new User();
    user.setPassword("11111111");
    user.setCredit(2.4);
    user.setPhone("323423424");

   Mapper.updateUser(user,"酒店工作人员","王二");

  }
}

