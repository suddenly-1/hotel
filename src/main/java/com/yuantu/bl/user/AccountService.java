package com.yuantu.bl.user;

import com.yuantu.po.User;
import com.yuantu.vo.ResponseVo;
import com.yuantu.vo.UserForm;
import com.yuantu.vo.UserInfo;
import com.yuantu.vo.UserLogin;

public interface AccountService {
    //    查询个人信息
    User queryUserById(int id);
    //    登录
    User login(UserLogin userLogin);
    //    注册
    ResponseVo register(UserForm userForm);
    //    个人信息
    ResponseVo queryUserInfo(int id);
    //    修改个人信息
    ResponseVo updateUserInfo(UserInfo userInfo);
}
