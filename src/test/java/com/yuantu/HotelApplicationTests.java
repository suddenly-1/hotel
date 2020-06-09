package com.yuantu;

import com.yuantu.bl.hotel.HotelService;
import com.yuantu.bl.hotel.RoomService;
import com.yuantu.bl.user.AccountService;
import com.yuantu.data.hotel.HotelMapper;
import com.yuantu.data.hotel.RoomMapper;
import com.yuantu.data.user.AccountMapper;
import com.yuantu.po.Hotel;
import com.yuantu.po.Room;
import com.yuantu.vo.HotelInfoVo;
import com.yuantu.vo.RoomInfoVo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

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

  /*  @Test
    public void getRoomMapper() {

        Room room = new Room();
        room.setRooms(66);
        room.setPrice(66.6);
        roomMapper.updateRoomInfo(room,"大床房",1);

    }*/

  @Test

    public void sort(){
     /*room.queryRoomInfo(1);*/
      /*List<Room> list=roomMapper.selectRoomInfo(1);*/

    /*  List<HotelInfoVo> hotel=hotelService.HotelSort("评分");
    System.out.println(hotel);*/
    //List<Hotel> hotels = hotelMapper.selectLikeQuery("4");
    List<HotelInfoVo> hotelInfoVos = hotelService.likeQuery("阳光");
    for (HotelInfoVo hotel : hotelInfoVos) {
      System.out.println(hotel);
    }

  }
}
