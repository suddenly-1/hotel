package com.yuantu.controller.hotel;

import com.alibaba.fastjson.JSON;
import com.yuantu.bl.hotel.HotelService;
import com.yuantu.blImpl.hotel.HotelServiceImpl;
import com.yuantu.vo.HotelInfoVo;
import com.yuantu.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.PublicKey;

@RestController
@RequestMapping("/hotel")
public class HotelController {
  @Autowired
  HotelService hotelService;
  //@Autowired
  //RoomService roomService;

  @GetMapping("/{hotelId}")
  public ResponseVo allHotelInfo(@PathVariable Integer hotelId){
    return ResponseVo.buildSuccess(JSON.toJSONString(hotelService.getHotelInfo(hotelId)));
  }

  @PostMapping("/update/{hotelId}")
  public ResponseVo modifyInfo(@RequestBody HotelInfoVo hotelInfoVo,@PathVariable Integer hotelId){
      return ResponseVo.buildSuccess(JSON.toJSONString(hotelService.modifyHotelInfo(hotelInfoVo,hotelId)));
  }

  @GetMapping("/sort/{condition}")
  public ResponseVo HotelSort(@PathVariable String condition){
    return ResponseVo.buildSuccess(JSON.toJSONString(hotelService.HotelSort(condition)));
  }

  @GetMapping("/fuzzy/{condition}")
  public ResponseVo HotelFuzzy(@PathVariable String condition){
    return ResponseVo.buildSuccess(JSON.toJSONString(hotelService.likeQuery(condition)));
  }
}