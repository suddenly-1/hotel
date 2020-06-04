package com.yuantu.controller.user;

import com.alibaba.fastjson.JSON;
import com.yuantu.bl.user.AccountService;
import com.yuantu.vo.UserForm;
import com.yuantu.vo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping("/Account/register")
    public String register(@RequestBody UserForm userForm){
        return JSON.toJSONString(accountService.register(userForm));
    }

    @GetMapping("/Account/info/{id}")
    public String queryUserInfo(@PathVariable int id){
        return JSON.toJSONString(accountService.queryUserInfo(id));
    }

    @PostMapping("/Account/update")
    public String updateUserInfo(@RequestBody UserInfo userInfo){
        return JSON.toJSONString(accountService.updateUserInfo(userInfo));
    }

    @GetMapping("/Account/queryUserById/{id}")
    public String queryUserById(@PathVariable int id){
        return JSON.toJSONString(accountService.queryUserById(id));
    }
}
