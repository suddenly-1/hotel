package com.yuantu.controller.personnel;

import com.alibaba.fastjson.JSON;
import com.yuantu.bl.personnel.PersonnelService;
import com.yuantu.vo.HotelInfoVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/personnel")
public class PersonnelController {

  @Autowired
  PersonnelService personnel;

  @GetMapping("/select/{userId}")
  public String queryHotel(@PathVariable Integer userId){
    return JSON.toJSONString(personnel.queryHotelInfo(userId));
  }

  @PostMapping("/update/{hotelId}")
  public String updateHotel(@RequestBody HotelInfoVo hotelInfoVo,@PathVariable Integer hotelId){
    return JSON.toJSONString(personnel.modifyHotelInfo(hotelInfoVo,hotelId));
  }

}
