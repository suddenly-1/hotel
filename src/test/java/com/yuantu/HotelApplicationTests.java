package com.yuantu;



import com.yuantu.bl.hotel.HotelService;
import com.yuantu.vo.HotelReceiveDto;
import com.yuantu.vo.ResponseVo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
public class HotelApplicationTests {

  @Autowired
  HotelService hotelService;

  @Test
    public void test() {
/*    private String address;//目的地
    private String hotelName;//酒店名称
    private String startTime;//起始时间
    private String endTime;//结束时间
    private String businessDistrict;//商圈
    private Integer star;//酒店星级
    private String score;//酒店评分
    private String price;//酒店价格
    private String roomType;//房间类型
    private Integer roomNumber;//房间数量*/


    HotelReceiveDto hotelReceiveDto = new HotelReceiveDto();
   // hotelReceiveDto.setAddress("南京市");
    //hotelReceiveDto.setHotelName("");
    hotelReceiveDto.setStartTime("2020-06-05 14:00:00");
    hotelReceiveDto.setEndTime("2020-06-06 12:00:00");
   // hotelReceiveDto.setBusinessDistrict("商圈");
    hotelReceiveDto.setStar(4);
    //hotelReceiveDto.setScore();
   // hotelReceiveDto.setPrice();
    //hotelReceiveDto.setRoomType();
    hotelReceiveDto.setRoomNumber(9);


    ResponseVo responseVo = hotelService.queryHotel(hotelReceiveDto, 1, 2);

    System.out.println(responseVo);

  }

}

