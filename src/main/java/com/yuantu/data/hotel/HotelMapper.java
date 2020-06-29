package com.yuantu.data.hotel;

import com.yuantu.po.Hotel;
import com.yuantu.vo.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface HotelMapper {


    /**
     * 系统显示酒店基本信息
     *
     * @param hotelId
     * @return
     */
    List<Hotel> selectHotelInfo(@Param("businessdistrict") String businessdistrict, @Param("address") String address, @Param("hotelId") Integer hotelId);

    /**
     * 排序：通过酒店价格从低到高，星级和评分排序
     *
     * @param condition return
     */
    List<Hotel> selectHotelSort(@Param("condition") String condition);


    /**
     * 模糊查询：通过酒店名称、房间、星级、评分区间等条件进行搜索
     *
     * @param condition return
     */
    List<Hotel> selectLikeQuery(@Param("condition") String condition);

    /**
     * 添加酒店
     *
     * @param hotel
     * @return
     */
    int insertHotelInfo(@Param("hotel") Hotel hotel);


    /**
     * 可以通过酒店名称、房间（类型、原始价格区间、有空房期间（房间数量、入住日期，退房日期））
     * 、星级、等条件进行搜索，这些条件可以独立起作用，也可以联合起作用
     *
     * @param hotelVo
     * @return
     */
    List<HotelInfo> selectHotel(HotelQueryVo hotelVo);

    /**
     * 通过酒店id查询房间信息
     *
     * @param roomDto
     * @return
     */
    List<RoomInfo> queryRoomInfoByHotelId(RoomDto roomDto);

    /**
     * 通过用户的酒店id查询信息
     *
     * @param userId
     * @return
     */
    Hotel selectHotelinfo(@Param("userId") Integer userId);

    /**
     * 酒店工作人员维护酒店基本信息
     *
     * @param hotel ，hotelId
     */
    int updateHotelInfo(@Param("hotel") Hotel hotel, @Param("hotelId") Integer hotelId);

    /**
     * 查询为被订购的房子
     *
     * @return
     */
    List<HotelqueryInfoVo> selectNotOrders(@Param("hotelVo") HotelQueryVo hotelVo);

    /**
     * 通过酒店id查询信息
     *
     * @param id
     * @return
     */
    Hotel queryHotelById(@Param("id") Integer id);

}
