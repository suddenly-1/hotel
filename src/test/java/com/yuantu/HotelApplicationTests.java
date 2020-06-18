package com.yuantu;


import com.yuantu.bl.admin.AdminService;
import com.yuantu.bl.hotel.HotelService;
import com.yuantu.bl.hotel.RoomService;
import com.yuantu.bl.order.OrderService;
import com.yuantu.bl.personnel.PersonnelService;
import com.yuantu.data.hotel.HotelMapper;
import com.yuantu.data.order.OrderMapper;
import com.yuantu.data.personnel.PersonnelMapper;
import com.yuantu.po.Hotel;
import com.yuantu.po.Order;
import com.yuantu.vo.*;
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
  @Autowired
  PersonnelMapper personnelMapper;
  @Autowired
  PersonnelService personnelService;
  @Autowired
  HotelMapper hotelMapper;
  @Autowired
  RoomService roomService;
  @Test
    public void test() {

    HotelReceiveDto hotell = new HotelReceiveDto();

    hotell.setPrice("0.0-1.0");
    hotell.setAddress("上海");
    hotell.setBusinessDistrict("浦东区");
    hotell.setEndTime("2020-06-04 09:59:17");
    hotell.setHotelName("7天连锁酒店");
    hotell.setRoomNumber(12);
    hotell.setScore("2.0-3.0");
    hotell.setStar(5);
    hotell.setStartTime("2020-06-03 09:59:11");
    hotell.setRoomType("大床房");

/*    hotell.setPrice("2-3");
    hotell.setAddress(null);
    hotell.setBusinessDistrict(null);
    hotell.setEndTime("2020-06-04 09:59:17");
    hotell.setHotelName(null);
    hotell.setRoomNumber(13);
    hotell.setScore("2.0-3.0");
    hotell.setStar(null);
    hotell.setStartTime("2020-06-03 09:59:11");
    hotell.setRoomType(null);*/
/*    HotelQueryVo hotelQueryVo = new HotelQueryVo();
    Double[] B ={0.0,1.0};
    hotelQueryVo.setPrice(B);
    hotelQueryVo.setAddress("上海");
    hotelQueryVo.setBusinessDistrict("浦东区");
    hotelQueryVo.setEndTime("2020-06-04 09:59:17");
    hotelQueryVo.setHotelName(null);
    hotelQueryVo.setRoomNumber(13);
    Double[] a = {2.0,3.0};
    hotelQueryVo.setScore(a);
    hotelQueryVo.setStar(5);
    hotelQueryVo.setStartTime("2020-06-03 09:59:11");
    hotelQueryVo.setRoomType("大床房");*/

    List<HotelqueryInfoVo> hotelqueryInfoVoList = hotel.queryHotel(hotell,null);
    System.out.println(hotelqueryInfoVoList);

  }

}

