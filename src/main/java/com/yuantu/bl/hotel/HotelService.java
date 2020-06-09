package com.yuantu.bl.hotel;


import com.yuantu.po.Hotel;
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
    HotelInfoVo getHotelInfo(@Param("hotelId") Integer hotelId);

    /**
   *排序：通过酒店价格从低到高，星级和评分排序
   */
  List<HotelInfoVo> HotelSort(@Param("condition") String condition);

  /**
   *
   * 模糊查询：通过酒店名称、房间、星级、评分区间等条件进行搜索
   * @param condition
   * returnl
   */
  List<HotelInfoVo> likeQuery(@Param("condition") String condition);
}
