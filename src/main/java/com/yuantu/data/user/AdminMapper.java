package com.yuantu.data.user;

import com.yuantu.po.Hotel;
import com.yuantu.po.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author:caobo
 * @Date:2020-06-06
 */
@Mapper
@Repository
public interface AdminMapper {
  /**
   * 根据用户类型来查询信息
   * @param userType
   * @return
   */
    List<User> selectUser(@Param("userType") String userType);

  /**
   * 通过用户的用户类型和名字来修改信息
   * @param user
   * @param userType
   * @param username
   * @return
   */
    int updateUser(@Param("user") User user,@Param("userType") String userType,@Param("username") String username);

  /**
   * 添加酒店
   * @param hotel
   * @return
   */
  int insertHotelInfo(@Param("hotel") Hotel hotel);

  /**
   *通过酒店id查询是否有员工,返回true表明存在，false可以添加
   * @param hotelid
   * @return
   */
  Boolean selectHotelWorker(@Param("hotelid")String hotelid);
}
