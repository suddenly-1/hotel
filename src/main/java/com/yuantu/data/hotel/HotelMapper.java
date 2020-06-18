package com.yuantu.data.hotel;

import com.yuantu.po.Hotel;
import com.yuantu.vo.HotelQueryVo;
import com.yuantu.vo.HotelqueryInfoVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface HotelMapper {


  /**
   * 系统显示酒店基本信息
   * @param hotelId
   * @return
   */
  List<Hotel> selectHotelInfo(@Param("businessdistrict")String businessdistrict,@Param("address")String address,@Param("hotelId") Integer hotelId);

  /**
   *排序：通过酒店价格从低到高，星级和评分排序
   * @param condition
   * return
   */
  List<Hotel> selectHotelSort(@Param("condition") String condition);


  /**
   *
   * 模糊查询：通过酒店名称、房间、星级、评分区间等条件进行搜索
   * @param condition
   * return
   */
  List<Hotel> selectLikeQuery(@Param("condition") String condition);

  /**
   * 添加酒店
   * @param hotel
   * @return
   */
  int insertHotelInfo(@Param("hotel") Hotel hotel);


  /**
   * 可以通过酒店名称、房间（类型、原始价格区间、有空房期间（房间数量、入住日期，退房日期））
   * 、星级、等条件进行搜索，这些条件可以独立起作用，也可以联合起作用
   * @param hotelVo
   * @return
   */
  List<HotelqueryInfoVo> selectHotel(@Param("hotelVo") HotelQueryVo hotelVo);

}
