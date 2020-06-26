package com.yuantu;


import com.yuantu.bl.hotel.HotelService;
import com.yuantu.data.hotel.HotelMapper;
import com.yuantu.data.hotel.RoomMapper;
import com.yuantu.po.Room;
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

  @Test
    public void test() {

//    List<HotelInfo> hotelInfos = hotelMapper.selectHotel(new HotelQueryVo("南京市", null, "2020-06-16 13:00", "2020-06-24 13:00", "雨花台区", null, null, null, 0.0, 150.0, null, null));
//    for (int i = 0; i < hotelInfos.size(); i++){
//      System.out.println("111：" + hotelInfos.get(i));
//      for(int j = 0; j < hotelInfos.get(i).getRoomInfo().size(); j++){
//        System.out.println("222：" + hotelInfos.get(i).getRoomInfo().get(j));
//      }
//    }

//    ResponseVo queryHotel = hotelService.queryHotel(new HotelReceiveDto("南京市", null, "2020-06-16 13:00", "2020-06-24 13:00", null, null, null, null, null, null), 1, 5);
//    System.out.println(queryHotel.getContent());

//    List<RoomInfo> roomInfos = hotelMapper.queryRoomInfoByHotelId(new RoomDto(1, "2020-06-25 13:00", "2020-06-26 13:00"));
//    System.out.println("roomInfos：" + roomInfos);
//    ResponseVo responseVo = hotelService.queryRoomInfoByHotelId(new RoomDto(null,"2020-06-17 13:00", "2020-06-24 13:00"));
//    System.out.println("responseVo：" + responseVo);



  }

}

