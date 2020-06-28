package com.yuantu.blImpl.hotel;

import com.yuantu.bl.hotel.RoomService;
import com.yuantu.data.hotel.RoomMapper;
import com.yuantu.po.Room;
import com.yuantu.vo.ResponseVo;
import com.yuantu.vo.RoomInfoVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class RoomServiceImpl implements RoomService {
  private final static String INSERT_ERROR="添加失败";
  private final static String UPDATE_ERROR="修改失败";

  @Autowired
  RoomMapper roomMapper;
  @Override
  public ResponseVo enterRoomInfo(RoomInfoVo roomInfoVo,Integer hotelId) {
      Room room = new Room();
      room.setHotelId(hotelId);
      BeanUtils.copyProperties(roomInfoVo,room);
    try{
      roomMapper.insertRoomInfo(room);
    }catch (Exception e){
      e.getMessage();
      return ResponseVo.buildFailure(INSERT_ERROR);
    }
    return ResponseVo.buildSuccess(true);
  }

  @Override
  public ResponseVo modifyRoomInfo(RoomInfoVo roomInfoVo,String roomType,Integer hotelId) {
    Room room = new Room();
    BeanUtils.copyProperties(roomInfoVo,room);
    try {
      roomMapper.updateRoomInfo(room,roomType,hotelId);
    }catch (Exception e){
      e.getMessage();
      return ResponseVo.buildFailure(UPDATE_ERROR);
    }
    return ResponseVo.buildSuccess(true);
  }

  @Override
  public List<RoomInfoVo> queryRoomInfo(Integer hotelId) {
    List<Room> room = roomMapper.selectRoomInfo(hotelId);
    List<RoomInfoVo> rl = new LinkedList<>();
    for (int i=0;i<room.size();i++){
        RoomInfoVo roomInfoVo = new RoomInfoVo();
        BeanUtils.copyProperties(room.get(i),roomInfoVo);
        rl.add(roomInfoVo);
    }

    return rl;
  }

  @Override
  public Room queryRoomByIdType(Integer hotelId, String roomType) {
    return roomMapper.queryRoomByIdType(hotelId,roomType);
  }

  @Override
  public ResponseVo queryRoomById(Integer roomId) {
    return ResponseVo.buildSuccess(roomMapper.queryRoomById(roomId));
  }
}
