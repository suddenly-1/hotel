package com.yuantu;


import com.yuantu.bl.hotel.HotelService;
import com.yuantu.data.hotel.HotelMapper;
import com.yuantu.data.hotel.RoomMapper;
import com.yuantu.data.order.OrderMapper;
import com.yuantu.po.Order;
import com.yuantu.po.Room;
import com.yuantu.util.DateFormat;
import com.yuantu.vo.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
public class HotelApplicationTests {


  @Autowired
  private HotelMapper hotelMapper;
  @Autowired
  private HotelService hotelService;
  @Autowired
  private RoomMapper roomMapper;
  @Autowired
  private OrderMapper orderMapper;

  @Test
    public void test() {



  }

}

