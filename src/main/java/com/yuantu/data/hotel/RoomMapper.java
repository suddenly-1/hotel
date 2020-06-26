package com.yuantu.data.hotel;

import com.yuantu.po.Room;
import com.yuantu.vo.RoomInfoVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface RoomMapper {
  /**
   * 录入可用房间
   * @param  room
   *return
   */
  int insertRoomInfo(@Param("room") Room room);

  /**
   * 修改客房信息
   * @param room,hotelId
   * @return
   */
  int updateRoomInfo(@Param("room") Room room,@Param("roomType") String roomType,@Param("hotelId")Integer hotelId);

  /**
   * 显示客房信息
   * @param hotelId
   * @return
   */
  List<Room> selectRoomInfo(@Param("hotelId")Integer hotelId);

  /**
   * 显示客房信息
   * @param hotelId
   * @param roomType
   * @return
   */
  Room queryRoomByIdType(@Param("hotelId")Integer hotelId, @Param("roomType")String roomType);

  /**
   * 根据id查询房间信息
   * @param roomId
   * @return
   */
  Room queryRoomById(@Param("roomId") Integer roomId);

}