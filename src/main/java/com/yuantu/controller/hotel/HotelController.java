package com.yuantu.controller.hotel;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yuantu.bl.hotel.HotelService;
import com.yuantu.util.PageUtil;
import com.yuantu.vo.HotelInfoVo;
import com.yuantu.vo.HotelReceiveDto;
import com.yuantu.vo.ResponseVo;
import com.yuantu.vo.RoomDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hotel")
public class HotelController {

  @Autowired
  HotelService hotelService;


  @GetMapping(value = {"/{address}/{businessdistrict}","/{address}/{businessdistrict}/{hotelId}"})
  public String HotelInfo(@PathVariable String businessdistrict,@PathVariable String address,@PathVariable(required = false) Integer hotelId,@RequestParam(value = "pageNum")Integer pageNum){
    return JSON.toJSONString(hotelService.getHotelInfo(businessdistrict,address,hotelId,pageNum));
  }


  @GetMapping("/sort/{condition}")
  public String HotelSort(@PathVariable String condition){
    return JSON.toJSONString(hotelService.HotelSort(condition));
  }

  @GetMapping("/fuzzy/{condition}")
  public String HotelFuzzy(@PathVariable String condition){
    return JSON.toJSONString(hotelService.likeQuery(condition));
  }

  @PostMapping("/insert")
  public String addHotel(@RequestBody HotelInfoVo hotelInfoVo){
    return JSON.toJSONString(hotelService.addHotelInfo(hotelInfoVo));
  }


  @GetMapping("/select/{userId}")
  public String queryHotel(@PathVariable Integer userId){
    return JSON.toJSONString(hotelService.queryHotelInfo(userId));
  }

  @PostMapping("/update/{hotelId}")
  public String updateHotel(@RequestBody HotelInfoVo hotelInfoVo,@PathVariable Integer hotelId){
    return JSON.toJSONString(hotelService.modifyHotelInfo(hotelInfoVo,hotelId));
  }
  @PostMapping("/query/{pageNum}/{pageSize}")
  public String queryHotel(@PathVariable int pageNum, @PathVariable int pageSize, @RequestBody HotelReceiveDto hotel){
      return JSON.toJSONString(hotelService.queryHotel(hotel,pageNum,pageSize));
  }
    @PostMapping("/queryRoomInfoByHotelId")
    public String queryRoomInfoByHotelId(@RequestBody RoomDto roomDto){
        return JSON.toJSONString(hotelService.queryRoomInfoByHotelId(roomDto));
    }

  @GetMapping("/queryHotelById/{id}")
  public String queryHotelById(@PathVariable Integer id){
    return JSON.toJSONString(hotelService.queryHotelById(id));
  }
}