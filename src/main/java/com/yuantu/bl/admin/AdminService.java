package com.yuantu.bl.admin;

import com.yuantu.vo.ResponseVo;
import com.yuantu.vo.UserInfoVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author:caobo
 * @Date:2020-06-06
 */

public interface AdminService {
    /**
     * 根据用户类型来查询信息
     *
     * @param userType
     * @return
     */
    ResponseVo queryUserInfo(@Param("userType") String userType, @Param("pageNum") Integer pageNum);


    /**
     * 通过用户的用户类型和名字来修改信息
     *
     * @param user
     * @param userType
     * @param username
     * @return
     */
    ResponseVo updateUser(@Param("user") UserInfoVo user, @Param("userType") String userType, @Param("username") String username);


    /**
     * 通过酒店id查询是否有员工,返回true表明存在，false可以添加
     *
     * @param hotelid
     * @return
     */
    ResponseVo queryHotelWorker(@Param("hotelid") String hotelid, UserInfoVo userInfoVo);
}
