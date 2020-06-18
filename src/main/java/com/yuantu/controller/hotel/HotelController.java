package com.yuantu.controller.hotel;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yuantu.bl.hotel.HotelService;
import com.yuantu.util.PageUtil;
import com.yuantu.vo.HotelInfoVo;
import com.yuantu.vo.HotelReceiveDto;
import com.yuantu.vo.ResponseVo;
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
  public ResponseVo HotelSort(@PathVariable String condition){
    return ResponseVo.buildSuccess(JSON.toJSONString(hotelService.HotelSort(condition)));
  }

  @GetMapping("/fuzzy/{condition}")
  public ResponseVo HotelFuzzy(@PathVariable String condition){
    return ResponseVo.buildSuccess(JSON.toJSONString(hotelService.likeQuery(condition)));
  }

  @PostMapping("/insert")
  public ResponseVo addHotel(@RequestBody HotelInfoVo hotelInfoVo){
    return ResponseVo.buildSuccess(JSON.toJSONString(hotelService.addHotelInfo(hotelInfoVo)));
  }
  @PostMapping("/query/{pageNum}/{pageSize}")
  public String queryHotel(@PathVariable int pageNum, @PathVariable int pageSize, @RequestBody HotelReceiveDto hotel){
      return JSON.toJSONString(hotelService.queryHotel(hotel,pageNum,pageSize));
}

}