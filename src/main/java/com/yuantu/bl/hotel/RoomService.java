package com.yuantu.bl.hotel;

import com.yuantu.po.Room;
import com.yuantu.vo.ResponseVo;
import com.yuantu.vo.RoomInfoVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author:caobo
 * @Date:2020-05-29
 */
public interface RoomService {

  /**
   * 录入可用房间
   * @param  roomInfoVo,hotelId
   *return
   */
  ResponseVo enterRoomInfo(@Param("roomInfoVo") RoomInfoVo roomInfoVo,@Param("hotelId")Integer hotelId);

  /**
   * 修改客房信息
   * @param roomInfoVo,hotelId
   * @return
   */
  ResponseVo modifyRoomInfo(@Param("roomInfoVo") RoomInfoVo roomInfoVo,@Param("roomType") String roomType,@Param("hotelId")Integer hotelId);

  /**
   * 显示客房信息
   * @param hotelId
   * @return
   */
  List<RoomInfoVo> queryRoomInfo(@Param("hotelId")Integer hotelId);

  /**
   * 房间详情
   * @param hotelId
   * @param roomType
   * @return
   */
  Room queryRoomByIdType(Integer hotelId, String roomType);

  /**
   * 根据id查询房间信息
   * @param roomId
   * @return
   */
  ResponseVo queryRoomById(Integer roomId);

}
