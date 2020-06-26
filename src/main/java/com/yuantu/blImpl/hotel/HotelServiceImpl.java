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

import java.util.*;
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
  public ResponseVo queryHotel(HotelReceiveDto hotel, int pageNum, int pageSize) {
    HotelQueryVo hotelQueryVo = new HotelQueryVo();
    if (hotel.getScore()!=null){
      String[] score=hotel.getScore().split("~");
      hotelQueryVo.setScore1(Double.parseDouble(score[0]));
      hotelQueryVo.setScore2(Double.parseDouble(score[1]));
    }
    if (hotel.getPrice()!=null){
      String[] price = hotel.getPrice().split("~");
      hotelQueryVo.setPrice1(Double.parseDouble(price[0]));
      hotelQueryVo.setPrice2(Double.parseDouble(price[1]));
    }
    BeanUtils.copyProperties(hotel,hotelQueryVo);

    // 排序

//    if(hotel.getStarSort() != null && hotel.getStarSort().equals("1")){
//      hotelQueryVo.setStarSort("h.star DESC");
//    }else if(hotel.getStarSort() != null && hotel.getStarSort().equals("2")){
//      hotelQueryVo.setStarSort("h.star ASC");
//    }
//    if(hotel.getScoreSort() != null && hotel.getScoreSort().equals("1")){
//      hotelQueryVo.setScoreSort("h.score DESC");
//    }else if(hotel.getScoreSort() != null && hotel.getScoreSort().equals("2")){
//      hotelQueryVo.setScoreSort("h.score ASC");
//    }
//    if(hotel.getPriceSort() != null && hotel.getPriceSort().equals("1")){
//      hotelQueryVo.setPriceSort("h.price DESC");
//    }else if(hotel.getPriceSort() != null && hotel.getPriceSort().equals("2")){
//      hotelQueryVo.setPriceSort("h.price ASC");
//    }


    System.out.println("**********************");
    System.out.println("hotelQueryVo：" + hotelQueryVo);
    System.out.println("**********************");

    PageHelper.startPage(pageNum,pageSize);
    List<HotelInfo> hotelInfos = hotelMapper.selectHotel(hotelQueryVo);

    //删除没有房间的酒店
    Iterator<HotelInfo> iterator = hotelInfos.iterator();
    while (iterator.hasNext()) {
      HotelInfo next = iterator.next();
      if (next.getRoomInfo().size() == 0) {
        iterator.remove();
      }
    }

    PageInfo<HotelInfo> pageInfo = new PageInfo<HotelInfo>(hotelInfos);
    return ResponseVo.buildSuccess(pageInfo);
  }

  @Override
  public ResponseVo queryRoomInfoByHotelId(RoomDto roomDto) {
    return ResponseVo.buildSuccess(hotelMapper.queryRoomInfoByHotelId(roomDto));
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

  @Override
  public ResponseVo queryHotelById(Integer id) {
    return ResponseVo.buildSuccess(hotelMapper.queryHotelById(id));
  }

}
