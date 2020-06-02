package com.yuantu.controller.user;

import com.alibaba.fastjson.JSON;
import com.yuantu.bl.user.AccountService;
import com.yuantu.vo.UserForm;
import com.yuantu.vo.UserInfo;
import com.yuantu.vo.UserLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/Account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/queryUserById")
    public String queryUserById(@RequestParam("id") int id){
        return JSON.toJSONString(accountService.queryUserById(id));
    }

    @PostMapping("/login")
    public String login(@RequestBody UserLogin userLogin){
        return JSON.toJSONString(accountService.login(userLogin));
    }

    @PostMapping("/register")
    public String register(@RequestBody UserForm userForm){
        return JSON.toJSONString(accountService.register(userForm));
    }

    @PostMapping("/info")
    public String queryUserInfo(@RequestParam("id") int id){
        return JSON.toJSONString(accountService.queryUserInfo(id));
    }

    @PostMapping("/update")
    public String updateUserInfo(@RequestBody UserInfo userInfo){
        return JSON.toJSONString(accountService.updateUserInfo(userInfo));
    }

}