package com.yuantu.data.hotel;

import com.yuantu.po.Hotel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface HotelMapper {
  /**
   * 酒店工作人员维护酒店基本信息
   * @param  hotel ，hotelId
   */
  int updateHotelInfo(@Param("hotel") Hotel hotel , @Param("hotelId") Integer hotelId);

  /**
   * 系统显示酒店基本信息
   * @param hotelId
   * @return
   */
  Hotel selectHotelInfo(@Param("hotelId") Integer hotelId);

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
}
