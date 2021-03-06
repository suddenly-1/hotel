package com.yuantu.bl.hotel;


import com.yuantu.po.Hotel;
import com.yuantu.vo.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author:caobo
 * @Date:2020-05-29
 */

public interface HotelService {
  /**
   * 所有的酒店信息
   * @return
   */
      ResponseVo allHotelInfo(@Param("pageNum") Integer pageNum);

    /**
     * 明确地址和商圈查看酒店信息
     *
     * @param hotelId
     * @return
     */
    ResponseVo getHotelInfo(@Param("businessdistrict") String businessdistrict, @Param("address") String address, @Param("hotelId") Integer hotelId, @Param("pageNum") Integer pageNum);


    /**
     * 排序：通过酒店价格从低到高，星级和评分排序
     */
    List<HotelInfoVo> HotelSort(@Param("condition") String condition);

    /**
     * 通过酒店id查询房间信息
     *
     * @param roomDto
     * @return
     */
    ResponseVo queryRoomInfoByHotelId(RoomDto roomDto);



    /**
     * 酒店工作人员维护酒店基本信息
     *
     * @param hotelInfoVo,hotelId
     * @return
     */
    ResponseVo modifyHotelInfo(@Param("hotelInfoVo") HotelInfoVo hotelInfoVo, @Param("hotelId") Integer hotelId);

    /**

  /**
   *
   * 模糊查询：通过酒店名称、星级、评分区间等条件进行搜索
   * @param condition
   * returnl
   */
  ResponseVo likeQuery(@Param("condition") String condition,@Param("pageNum") Integer pageNum);

  /**
   * 添加酒店
   * @param hotel
   * @return
   */
  ResponseVo addHotelInfo(@Param("hotel") HotelInfoVo hotel);


  /**
   * 查询时间段里的房间状态,可以通过酒店名称、房间（类型、原始价格区间、
   * 有空房期间（房间数量、入住日期，退房日期））、星级、评分区间等条件进行搜索
   * @param hotel
   * @return
   */
  ResponseVo queryHotel(HotelReceiveDto hotel,int pageNum, int pageSize);


  /**
   * 通过用户的酒店id查询信息
   * @param userId
   * @return
   */
  HotelInfoVo queryHotelInfo(@Param("userId") Integer userId);


  /**
   * 通过酒店id查询信息
   * @param id
   * @return
   */
  ResponseVo queryHotelById(@Param("id") Integer id);


}
