package com.yuantu.controller.user;

import com.alibaba.fastjson.JSON;
import com.yuantu.bl.user.AdminService;
import com.yuantu.vo.ResponseVo;
import com.yuantu.vo.UserInfoVo;
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


}
