package com.yuantu.controller.user;

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
        return accountService.queryUserById(id).toString();
    }

    @PostMapping("/login")
    public String login(@RequestBody UserLogin userLogin){
        return accountService.login(userLogin).toString();
    }

    @PostMapping("/register")
    public String register(@RequestBody UserForm userForm){
        return accountService.register(userForm).toString();
    }

    @PostMapping("/info")
    public String queryUserInfo(@RequestParam("id") int id){
        return accountService.queryUserInfo(id).toString();
    }

    @PostMapping("/update")
    public String updateUserInfo(@RequestBody UserInfo userInfo){
        return accountService.updateUserInfo(userInfo).toString();
    }

}
