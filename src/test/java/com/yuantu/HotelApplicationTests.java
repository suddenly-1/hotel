package com.yuantu;



import com.yuantu.bl.hotel.HotelService;
import com.yuantu.bl.hotel.RoomService;
import com.yuantu.bl.admin.AdminService;
import com.yuantu.data.hotel.HotelMapper;
import com.yuantu.data.hotel.RoomMapper;
import com.yuantu.data.admin.AdminMapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;



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

}
}

