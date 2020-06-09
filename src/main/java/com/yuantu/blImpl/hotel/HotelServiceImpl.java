package com.yuantu.blImpl.hotel;

import com.yuantu.bl.hotel.HotelService;
import com.yuantu.data.hotel.HotelMapper;
import com.yuantu.po.Hotel;
import com.yuantu.vo.HotelInfoVo;
import com.yuantu.vo.ResponseVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class HotelServiceImpl implements HotelService {

  private final static String UPDATE_ERROR = "修改失败";

  @Autowired
  HotelMapper hotelMapper;

  @Override
  public ResponseVo modifyHotelInfo(HotelInfoVo hotelInfoVo,Integer hotelId) {
    Hotel hotel = new Hotel();
    BeanUtils.copyProperties(hotelInfoVo,hotel);
    try {
      hotelMapper.updateHotelInfo(hotel,hotelId);
    }catch (Exception e){
      System.out.println(e.getMessage());
      return ResponseVo.buildFailure(UPDATE_ERROR);
    }
      return ResponseVo.buildSuccess(true);
  }

  @Override
  public HotelInfoVo getHotelInfo(Integer hotelId) {
    Hotel hotel= hotelMapper.selectHotelInfo(hotelId);
    HotelInfoVo hotelInfoVo = new HotelInfoVo();
    BeanUtils.copyProperties(hotel,hotelInfoVo);
    return hotelInfoVo;
  }

  @Override
  public List<HotelInfoVo> HotelSort(String condition) {
    List<Hotel> hotel=hotelMapper.selectHotelSort(condition);
    List<HotelInfoVo> hotelInfoVo = hotel.stream().map(h -> {
      HotelInfoVo hl= new HotelInfoVo();
      hl.setAddress(h.getAddress());
      hl.setBusinessDistrict(h.getBusinessDistrict());
      hl.setIntroduction(h.getIntroduction());
      hl.setFacilities(h.getFacilities());
      hl.setHotelName(h.getHotelName());
      hl.setScore(h.getScore());
      hl.setStar(h.getStar());
      hl.setAveragePrice(h.getAveragePrice());
      return hl;
    }).collect(Collectors.toList());
    return hotelInfoVo;
  }

  @Override
  public List<HotelInfoVo> likeQuery(String condition) {
    List<Hotel> hotels = hotelMapper.selectLikeQuery(condition);
    List<HotelInfoVo> hotelInfoVos = hotels.stream().map(hotel -> {
      HotelInfoVo hl= new HotelInfoVo();
      hl.setAddress(hotel.getAddress());
      hl.setBusinessDistrict(hotel.getBusinessDistrict());
      hl.setIntroduction(hotel.getIntroduction());
      hl.setFacilities(hotel.getFacilities());
      hl.setHotelName(hotel.getHotelName());
      hl.setScore(hotel.getScore());
      hl.setStar(hotel.getStar());
      hl.setAveragePrice(hotel.getAveragePrice());
      return hl;
    }).collect(Collectors.toList());
    return hotelInfoVos;
  }


}
