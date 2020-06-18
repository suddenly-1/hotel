package com.yuantu.bl.personnel;

import com.yuantu.po.Hotel;
import com.yuantu.vo.HotelInfoVo;
import com.yuantu.vo.ResponseVo;
import org.apache.ibatis.annotations.Param;


public interface PersonnelService {


  /**
   * 通过用户的酒店id查询信息
   * @param userId
   * @return
   */
  ResponseVo queryHotelInfo(@Param("userId") Integer userId);


  /**
   * 酒店工作人员维护酒店基本信息
   * @param  hotelInfoVo,hotelId
   * @return
   */
  ResponseVo modifyHotelInfo(@Param("hotelInfoVo") HotelInfoVo hotelInfoVo, @Param("hotelId") Integer hotelId);
}
