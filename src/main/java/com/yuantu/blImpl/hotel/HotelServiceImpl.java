package com.yuantu.blImpl.hotel;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yuantu.bl.hotel.HotelService;
import com.yuantu.data.hotel.HotelMapper;
import com.yuantu.po.Hotel;
import com.yuantu.util.PageUtil;
import com.yuantu.vo.*;
import org.apache.commons.beanutils.ConvertUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class HotelServiceImpl implements HotelService {
  private final static String INSERT_ERROR="添加失败";
  private final static String UPDATE_ERROR = "修改失败";

  @Autowired
  HotelMapper hotelMapper;


  @Override
  public ResponseVo getHotelInfo(String businessdistrict, String address, Integer hotelId, Integer pageNum) {

    PageHelper.startPage(pageNum,PageUtil.pageSize);
    List<Hotel> hotel= hotelMapper.selectHotelInfo(businessdistrict,address,hotelId);
    List<HotelInfoVo> hotelInfoVos = new LinkedList<>();
    for (int i=0; i<hotel.size();i++) {
      HotelInfoVo hotelInfoVo = new HotelInfoVo();
      BeanUtils.copyProperties(hotel.get(i),hotelInfoVo);
      hotelInfoVos.add(hotelInfoVo);
    }
    PageInfo pageInfo = new PageInfo(hotel);
    pageInfo.setList(hotelInfoVos);
    return ResponseVo.buildSuccess(pageInfo);
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

  @Override
  public ResponseVo addHotelInfo(HotelInfoVo hotel) {
    System.out.println(hotel);
    Hotel h = new Hotel();
    BeanUtils.copyProperties(hotel,h);
    System.out.println(h);
    try{
      hotelMapper.insertHotelInfo(h);
    }
    catch (Exception e){
      e.getMessage();
      ResponseVo.buildSuccess(INSERT_ERROR);
    }
    return ResponseVo.buildSuccess(true);
  }


  @Override
  public List<HotelqueryInfoVo> queryHotel(HotelReceiveDto hotel) {

    HotelQueryVo hotelQueryVo = new HotelQueryVo();

    if (hotel.getScore()!=null){
      String[] Score=hotel.getScore().split("-");
      hotelQueryVo.setScore((Double[])ConvertUtils.convert(Score,Double.class));
    }
    if (hotel.getPrice()!=null){
      String[] Price = hotel.getPrice().split("-");
      hotelQueryVo.setPrice((Double[])ConvertUtils.convert(Price,Double.class));
    }

  BeanUtils.copyProperties(hotel,hotelQueryVo);


    List<HotelqueryInfoVo> hotelquery = hotelMapper.selectHotel(hotelQueryVo);

    List<HotelqueryInfoVo> hotelqueryList = new LinkedList<>();

    if (hotel.getRoomNumber()!=null) {
      for (int i = 0; i < hotelquery.size(); i++) {
        HotelqueryInfoVo hotelVo = new HotelqueryInfoVo();
        if(hotel.getRoomNumber() <= hotelquery.get(i).getNumbers()){
          BeanUtils.copyProperties(hotelquery.get(i),hotelVo);
          hotelqueryList.add(hotelVo);
        }
      }
      return hotelqueryList;
    }

    else {
      return hotelquery;
    }
  }

  @Override
  public HotelInfoVo queryHotelInfo(Integer userId) {
    Hotel hotel = hotelMapper.selectHotelinfo(userId);
    HotelInfoVo hotelInfoVo = new HotelInfoVo();
    BeanUtils.copyProperties(hotel,hotelInfoVo);
    return hotelInfoVo;
  }

  @Override
  public ResponseVo modifyHotelInfo(HotelInfoVo hotelInfoVo, Integer hotelId) {
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

}
