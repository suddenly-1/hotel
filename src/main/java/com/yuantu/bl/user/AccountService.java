package com.yuantu.bl.user;

import com.yuantu.po.User;
import com.yuantu.vo.ResponseVo;
import com.yuantu.vo.UserForm;
import com.yuantu.vo.UserInfo;
import com.yuantu.vo.UserLogin;

/**
 * @Author:zhaozhongwei
 * @Date:2020-05-30
 */
public interface AccountService {

    /**
     * 查询个人信息
     * @param  id
     * @return User
     */
    User queryUserById(int id);

    /**
     * 用户登录
     * @param  userLogin
     * @return
     */
    ResponseVo login(UserLogin userLogin);

    /**
     * 注册账号
     * @param  userForm
     * @return
     */
    ResponseVo register(UserForm userForm);

    /**
     * 获取用户个人信息
     * @param  id
     * @return
     */
    ResponseVo queryUserInfo(int id);

    /**
     * 修改用户个人信息
     * @param  userInfo
     * @return
     */
    ResponseVo updateUserInfo(UserInfo userInfo);

    /**
     * 修改用户个人信息
     * @param  id
     * @param  credit
     * @return
     */
    void vip(Integer id, Double credit);
}
