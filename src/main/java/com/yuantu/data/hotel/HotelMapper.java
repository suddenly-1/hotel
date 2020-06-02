package com.yuantu.data.hotel;

import com.yuantu.vo.HotelInfoVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface HotelMapper {
  /**
   * 酒店工作人员维护酒店基本信息
   * @param  hotelInfoVo
   */
  int modifyHotelInfo(@Param("hotelInfoVo") HotelInfoVo hotelInfoVo ,@Param("hotelId") Integer hotelId);

  /**
   * 系统显示酒店基本信息
   * @return
   */
  List<HotelInfoVo> getHotelInfo( @Param("hotelId") Integer hotelId);
}
