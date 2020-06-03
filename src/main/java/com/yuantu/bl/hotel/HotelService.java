package com.yuantu.bl.hotel;


import com.yuantu.vo.HotelInfoVo;
import com.yuantu.vo.ResponseVo;
import org.apache.ibatis.annotations.Param;

import java.awt.*;
import java.util.List;

/**
 * @Author:caobo
 * @Date:2020-05-29
 */

public interface HotelService {

  /**
   * 酒店工作人员维护酒店基本信息
   * @param  hotelInfoVo,hotelId
   * @return
   */
    ResponseVo modifyHotelInfo(@Param("hotelInfoVo") HotelInfoVo hotelInfoVo,@Param("hotelId") Integer hotelId);

  /**
   * 系统显示酒店基本信息
   * @param hotelId
   * @return
   */
    List<HotelInfoVo> getHotelInfo(@Param("hotelId") Integer hotelId);

}
