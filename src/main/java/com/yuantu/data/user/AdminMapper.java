package com.yuantu.data.user;

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


    int updateUser(@Param("user") User user,@Param("userType") String userType,@Param("username") String username);
}
