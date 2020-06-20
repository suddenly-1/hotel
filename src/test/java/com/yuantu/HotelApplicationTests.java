package com.yuantu;

import com.yuantu.bl.hotel.HotelService;
import com.yuantu.data.hotel.HotelMapper;
import com.yuantu.po.Hotel;
import com.yuantu.vo.ResponseVo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
public class HotelApplicationTests {

  @Autowired
  private HotelMapper hotelMapper;
  @Autowired
  private HotelService hotelService;

  @Test
    public void test() {
//    Hotel hotel = hotelMapper.queryHotelById(1);
//    System.out.println(hotel);
    ResponseVo responseVo = hotelService.queryHotelById(1);
    System.out.println(responseVo);
  }

}

