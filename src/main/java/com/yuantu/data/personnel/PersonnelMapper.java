package com.yuantu.data.personnel;

import com.yuantu.po.Hotel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PersonnelMapper {
  /**
   * 通过用户的酒店id查询信息
   * @param userId
   * @return
   */
  Hotel selectHotelinfo(@Param("userId") Integer userId);

  /**
   * 酒店工作人员维护酒店基本信息
   * @param  hotel ，hotelId
   */
  int updateHotelInfo(@Param("hotel") Hotel hotel , @Param("hotelId") Integer hotelId);
}
