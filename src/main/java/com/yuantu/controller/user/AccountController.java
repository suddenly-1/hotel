package com.yuantu.controller.user;

import com.alibaba.fastjson.JSON;
import com.sun.org.apache.xpath.internal.operations.Mod;
import com.yuantu.bl.user.AccountService;
import com.yuantu.vo.ResponseVo;
import com.yuantu.vo.UserForm;
import com.yuantu.vo.UserInfo;
import com.yuantu.vo.UserLogin;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;



@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;


    @RequestMapping("/autherror/{code}")
    public String autherror(@PathVariable int code){
        return code == 1 ? JSON.toJSONString(ResponseVo.buildFailure("未登录")) : JSON.toJSONString(ResponseVo.buildFailure("未授权"));
    }
    @PostMapping("/login")
    public String login(@RequestBody UserLogin userLogin){
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(userLogin.getAccountNumber(),userLogin.getPassword());
        try {
            subject.login(token);
            return JSON.toJSONString(ResponseVo.buildSuccess(accountService.login(userLogin).getId()));
        } catch (UnknownAccountException e) {
            return JSON.toJSONString(ResponseVo.buildFailure("用户名错误！"));
        } catch (IncorrectCredentialsException e) {
            return JSON.toJSONString(ResponseVo.buildFailure("密码错误！"));
        }
    }
    @GetMapping("/logout")
    public String logout(){
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
        return "已退出";
    }



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
