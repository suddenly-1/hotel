package com.yuantu.controller.user;

import com.yuantu.bl.user.AccountService;
import com.yuantu.po.User;
import com.yuantu.vo.ResponseVo;
import com.yuantu.vo.UserLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/Account")
public class AccountController {
    private final static String ACCOUNT_INFO_ERROR = "用户名或密码错误";

    @Autowired
    private AccountService accountService;

    @RequestMapping("/queryUserById")
    public String queryUserById(@RequestParam("id") int id){
        return accountService.queryUserById(id).toString();
    }

    @PostMapping("/login")
    public String login(@RequestBody UserLogin userLogin){
        User user = accountService.login(userLogin);

        if (null == user){
            ResponseVo.buildFailure(ACCOUNT_INFO_ERROR);
        }

        return ResponseVo.buildSuccess(user).toString();
    }

}
