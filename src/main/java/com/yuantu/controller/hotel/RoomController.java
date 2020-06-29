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
    public String enterRoomInfo(@RequestBody RoomInfoVo roomInfoVo, @PathVariable Integer hotelId) {
        return JSON.toJSONString(roomService.enterRoomInfo(roomInfoVo, hotelId));
    }

    @PostMapping("/update/{hotelId}")
    public String modifyRoomInfo(@RequestBody RoomInfoVo roomInfoVo, @RequestParam("roomType") String roomType, @PathVariable("hotelId") Integer hotelId) {
        return JSON.toJSONString(roomService.modifyRoomInfo(roomInfoVo, roomType, hotelId));
    }

    @GetMapping("/select/{hotelId}")
    public String queryRoomInfo(@PathVariable Integer hotelId) {
        return JSON.toJSONString(roomService.queryRoomInfo(hotelId));
    }

    @GetMapping("/queryRoomById/{roomId}")
    public String queryRoomById(@PathVariable Integer roomId) {
        return JSON.toJSONString(roomService.queryRoomById(roomId));
    }

}
