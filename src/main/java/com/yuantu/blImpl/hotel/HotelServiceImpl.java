package com.yuantu.blImpl.hotel;

import com.yuantu.bl.hotel.HotelService;
import com.yuantu.data.hotel.HotelMapper;
import com.yuantu.vo.HotelInfoVo;
import com.yuantu.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelServiceImpl implements HotelService {

  private final static String UPDATE_ERROR = "修改失败";

  @Autowired
  HotelMapper hotelMapper;

  @Override
  public ResponseVo modifyHotelInfo(HotelInfoVo hotelInfoVo,Integer hotelId) {
    try {
      hotelMapper.modifyHotelInfo(hotelInfoVo,hotelId);
    }catch (Exception e){
      System.out.println(e.getMessage());
      return ResponseVo.buildFailure(UPDATE_ERROR);
    }
      return ResponseVo.buildSuccess(true);
  }

  @Override
  public List<HotelInfoVo> getHotelInfo(Integer hotelId) {
    return hotelMapper.getHotelInfo(hotelId);
  }

}
