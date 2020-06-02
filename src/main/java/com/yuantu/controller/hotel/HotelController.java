package com.yuantu.controller.hotel;

import com.yuantu.bl.hotel.HotelService;
import com.yuantu.blImpl.hotel.HotelServiceImpl;
import com.yuantu.vo.HotelInfoVo;
import com.yuantu.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hotel")
public class HotelController {
  @Autowired
  HotelServiceImpl hotelService;
  //@Autowired
  //RoomService roomService;

  @GetMapping("/{hotelId}")
  public ResponseVo allHotelInfo(@PathVariable Integer hotelId){
    return ResponseVo.buildSuccess(hotelService.getHotelInfo(hotelId));
  }

  @PostMapping("/{hotelId}/update")
  public ResponseVo modifyInfo(@RequestBody HotelInfoVo hotelInfoVo,@PathVariable Integer hotelId){
    System.out.println(hotelInfoVo);
      return hotelService.modifyHotelInfo(hotelInfoVo,hotelId);
  }
}
