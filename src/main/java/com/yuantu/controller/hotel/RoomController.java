package com.yuantu.controller.hotel;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.yuantu.bl.hotel.RoomService;
import com.yuantu.vo.ResponseVo;
import com.yuantu.vo.RoomInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLOutput;

@RestController
@RequestMapping("/room")
public class RoomController {

  @Autowired
  RoomService roomService;

  @PostMapping("/insert/{hotelId}")
  public ResponseVo enterRoomInfo(@RequestBody RoomInfoVo roomInfoVo, @PathVariable Integer hotelId){
    return ResponseVo.buildSuccess(JSON.toJSONString(roomService.enterRoomInfo(roomInfoVo,hotelId)));
  }

  @PostMapping("/update/{hotelId}")
  public ResponseVo modifyRoomInfo(@RequestBody RoomInfoVo roomInfoVo,@RequestParam("roomType") String roomType, @PathVariable("hotelId") Integer hotelId){
    return ResponseVo.buildSuccess(JSON.toJSONString(roomService.modifyRoomInfo(roomInfoVo,roomType,hotelId)));
  }

  @GetMapping("/select/{hotelId}")
  public ResponseVo queryRoomInfo(@PathVariable Integer hotelId){

    return ResponseVo.buildSuccess(JSON.toJSONString(roomService.queryRoomInfo(hotelId)));
  }
}
