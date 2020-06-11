package com.yuantu.bl.user;

import com.yuantu.vo.UserInfoVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:zhaozhongwei
 * @Date:2020-06-06
 */

public interface AdminService {
  /**
   * 根据用户类型来查询信息
   * @param userType
   * @return
   */
  List<UserInfoVo> queryUserInfo(@Param("userType") String userType,@Param("pageNum") Integer pageNum);
}
