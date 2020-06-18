package com.yuantu.blImpl.personnel;

import com.yuantu.bl.personnel.PersonnelService;
import com.yuantu.data.personnel.PersonnelMapper;
import com.yuantu.po.Hotel;
import com.yuantu.vo.HotelInfoVo;
import com.yuantu.vo.ResponseVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonnelImpl implements PersonnelService {

  //private final static String INSERT_ERROR="添加失败";
  private final static String UPDATE_ERROR = "修改失败";

  @Autowired
  PersonnelMapper personnel;

  @Override
  public ResponseVo queryHotelInfo(Integer userId) {
    Hotel hotel = personnel.selectHotelinfo(userId);
    HotelInfoVo hotelInfoVo = new HotelInfoVo();
    BeanUtils.copyProperties(hotel,hotelInfoVo);
    return ResponseVo.buildSuccess(hotelInfoVo);
  }

  @Override
  public ResponseVo modifyHotelInfo(HotelInfoVo hotelInfoVo, Integer hotelId) {
    Hotel hotel = new Hotel();
    BeanUtils.copyProperties(hotelInfoVo,hotel);
    try {
      personnel.updateHotelInfo(hotel,hotelId);
    }catch (Exception e){
      System.out.println(e.getMessage());
      return ResponseVo.buildFailure(UPDATE_ERROR);
    }
    return ResponseVo.buildSuccess(true);
  }
}
