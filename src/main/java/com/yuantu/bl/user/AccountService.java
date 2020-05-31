package com.yuantu.bl.user;

import com.yuantu.po.User;
import com.yuantu.vo.UserLogin;

public interface AccountService {
    //    根据id查询
    User queryUserById(int id);
    //    根据账号登录
    User login(UserLogin userLogin);

}
