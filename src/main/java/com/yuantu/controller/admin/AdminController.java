package com.yuantu.controller.admin;

import com.alibaba.fastjson.JSON;
import com.yuantu.bl.admin.AdminService;
import com.yuantu.vo.ResponseVo;
import com.yuantu.vo.UserInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/admin")
public class AdminController {

  @Autowired
  AdminService adminService;

  @GetMapping("/{userType}")
  public String queryUserInfo(@PathVariable String userType,@RequestParam(value = "pageNum")Integer pageNum){
    return JSON.toJSONString(adminService.queryUserInfo(userType,pageNum));
  }

  @PostMapping("/update/{userType}/{username}")
  public String modifyUserInfo(@RequestBody UserInfoVo user,@PathVariable String userType,@PathVariable String username){
    return JSON.toJSONString(adminService.updateUser(user,userType,username));
  }

  @PostMapping("/addwork/{hotelid}")
  public String queryHotelWorker(@PathVariable String hotelid,@RequestBody UserInfoVo userInfoVo){
      return JSON.toJSONString(adminService.queryHotelWorker(hotelid,userInfoVo));
  }

  @GetMapping("/select")
  public String getall(@RequestParam(value = "pageNum")Integer pageNum){
    return JSON.toJSONString(adminService.queryWork(pageNum));
  }

  @GetMapping("/find/{hotelName}")
  public String findHotel(@PathVariable String hotelName,@RequestParam("pageNum")Integer pageNum){
    return JSON.toJSONString(adminService.queryHotelInfo(hotelName,pageNum));
  }
}
