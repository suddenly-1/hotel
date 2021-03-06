package com.yuantu.controller.user;

import com.alibaba.fastjson.JSON;
import com.yuantu.bl.user.AccountService;
import com.yuantu.vo.ResponseVo;
import com.yuantu.vo.UserLogin;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {

    @Autowired
    private AccountService accountService;

    @PostMapping("/login")
    public String login(@RequestBody UserLogin userLogin) {
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(userLogin.getAccountNumber(), userLogin.getPassword());
        try {
            subject.login(token);
            if ("on".equals(userLogin.getRemember())) {
                token.setRememberMe(true);
            } else {
                token.setRememberMe(false);
            }
            return JSON.toJSONString(accountService.login(userLogin));
        } catch (UnknownAccountException e) {
            return JSON.toJSONString(ResponseVo.buildFailure("用户名错误！"));
        } catch (IncorrectCredentialsException e) {
            return JSON.toJSONString(ResponseVo.buildFailure("密码错误！"));
        }
    }

    @GetMapping("/logout")
    public String logout() {
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
        return JSON.toJSONString(ResponseVo.buildSuccess("已退出"));
    }

    @RequestMapping("/autherror/{code}")
    public String autherror(@PathVariable int code) {
        return code == 1 ? JSON.toJSONString(ResponseVo.buildFailure("未登录")) : JSON.toJSONString(ResponseVo.buildFailure("未授权"));
    }

}
