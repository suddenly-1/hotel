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
  public ResponseVo queryUserInfo(@PathVariable String userType,@RequestParam(value = "pageNum")Integer pageNum){
    return ResponseVo.buildSuccess(JSON.toJSONString(adminService.queryUserInfo(userType,pageNum)));
  }

  @PostMapping("/update/{userType}/{username}")
  public ResponseVo modifyUserInfo(@RequestBody UserInfoVo user,@PathVariable String userType,@PathVariable String username){
    return ResponseVo.buildSuccess(JSON.toJSONString(adminService.updateUser(user,userType,username)));
  }

  @PostMapping("/addwork/{hotelid}")
  public ResponseVo queryHotelWorker(@PathVariable String hotelid,@RequestBody UserInfoVo userInfoVo){
      return ResponseVo.buildSuccess(JSON.toJSONString(adminService.queryHotelWorker(hotelid,userInfoVo)));
  }
}
