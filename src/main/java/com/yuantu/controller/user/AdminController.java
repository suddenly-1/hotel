package com.yuantu.controller.user;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.yuantu.bl.user.AdminService;
import com.yuantu.vo.HotelInfoVo;
import com.yuantu.vo.ResponseVo;
import com.yuantu.vo.UserInfoVo;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

  @Autowired
  AdminService adminService;

  @GetMapping("/{userType}")
  public ResponseVo queryUserInfo(@PathVariable String userType,@RequestParam(value = "pageNum")Integer pageNum){
    return ResponseVo.buildSuccess(JSON.toJSONString(adminService.queryUserInfo(userType,pageNum)));
  }

  @PostMapping("/update/{userType}/{username}")
  public ResponseVo modifyUserInfo(@RequestBody UserInfoVo user,@PathVariable String userType,@PathVariable String username){
    return ResponseVo.buildSuccess(JSON.toJSONString(adminService.updateUser(user,userType,username)));
  }

  @PostMapping("/insert")
  public ResponseVo addHotel(@RequestBody HotelInfoVo hotelInfoVo){
    return ResponseVo.buildSuccess(JSON.toJSONString(adminService.addHotelInfo(hotelInfoVo)));
  }

  @PostMapping("/addwork/{hotelid}")
  public ResponseVo queryHotelWorker(@PathVariable String hotelid,@RequestBody UserInfoVo userInfoVo){
      return ResponseVo.buildSuccess(JSON.toJSONString(adminService.queryHotelWorker(hotelid,userInfoVo)));
  }
}
