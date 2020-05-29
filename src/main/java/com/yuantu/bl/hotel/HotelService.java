package com.yuantu.bl.hotel;


import com.yuantu.vo.HotelInfoVo;

import java.awt.*;
import java.util.List;

/**
 * @Author:caobo
 * @Date:2020-05-29
 */

public interface HotelService {

  /**
   * 酒店工作人员维护酒店基本信息
   * @param  hotelInfoVo
   */
    void modifyHotelInfo(HotelInfoVo hotelInfoVo);

  /**
   * 系统显示酒店基本信息
   * @return
   */
    List<HotelInfoVo> getHotelInfo();

}
