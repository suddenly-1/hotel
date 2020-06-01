package com.yuantu;

import com.yuantu.bl.hotel.HotelService;
import com.yuantu.blImpl.hotel.HotelServiceImpl;
import com.yuantu.data.hotel.HotelMapper;
import com.yuantu.vo.HotelInfoVo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class HotelApplicationTests {

    @Autowired
    private HotelMapper hotelMapper;

    @Test
    void contextLoads() {


        //List<HotelInfoVo> hotelInfo = hotelMapper.getHotelInfo();
       // System.out.println(hotelInfo.toString());


        // HotelService hotelService = new HotelServiceImpl();

        //System.out.println(hotelService.getHotelInfo());


    }

}
