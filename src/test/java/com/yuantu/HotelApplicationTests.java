package com.yuantu;


import com.yuantu.bl.admin.AdminService;
import com.yuantu.bl.hotel.HotelService;
import com.yuantu.bl.hotel.RoomService;
import com.yuantu.bl.order.OrderService;
import com.yuantu.data.hotel.RoomMapper;
import com.yuantu.data.order.OrderMapper;
import com.yuantu.po.Hotel;
import com.yuantu.po.Order;
import com.yuantu.po.Room;
import com.yuantu.vo.OrderVo;
import com.yuantu.vo.ResponseVo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
public class HotelApplicationTests {

  @Autowired
  private RoomMapper roomMapper;
  @Autowired
  private RoomService roomService;

  @Test
    public void test() {
//    Room room = roomMapper.queryRoomByIdType(1, "大床房");
//    System.out.println(room);
//    Room room = roomService.queryRoomByIdType(1, "大床房");
//    System.out.println(room);
  }

}

