package com.yuantu.blImpl.user;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yuantu.bl.user.AdminService;
import com.yuantu.data.user.AccountMapper;
import com.yuantu.data.user.AdminMapper;
import com.yuantu.po.Hotel;
import com.yuantu.po.User;
import com.yuantu.util.DateFormat;
import com.yuantu.util.PageUtil;
import com.yuantu.vo.HotelInfoVo;
import com.yuantu.vo.ResponseVo;
import com.yuantu.vo.UserInfoVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

  private final static String INSERT_ERROR="添加失败";
  private final static String UPDATE_ERROR="修改失败";
  private final static String USER_ERROR="已存在工作人员,不能添加";

  @Autowired
  AdminMapper adminMapper;
  @Autowired
  AccountMapper accountMapper;

  @Override
  public List<UserInfoVo> queryUserInfo(String userType,Integer pageNum) {
    PageHelper.startPage(pageNum, PageUtil.pageSize);
    List<User> user = adminMapper.selectUser(userType);
    List<UserInfoVo> userInfo = new LinkedList<>();
    for (int i = 0; i < user.size(); i++) {
      UserInfoVo userInfoVo = new UserInfoVo();
      BeanUtils.copyProperties(user.get(i),userInfoVo);
      userInfoVo.setBirthday(DateFormat.DateConvertString(user.get(i).getBirthday()));
      userInfo.add(userInfoVo);
    }
    PageInfo pageInfo = new PageInfo(user);
    pageInfo.setList(userInfo);

    return userInfo;
  }

  @Override
  public ResponseVo updateUser(UserInfoVo user, String userType, String username) {
    User u = new User();
    BeanUtils.copyProperties(user,u);
    try{
      adminMapper.updateUser(u,userType,username);

    }catch (Exception e){
      e.getMessage();
      ResponseVo.buildFailure(UPDATE_ERROR);
    }

    return ResponseVo.buildSuccess(true);
  }

  @Override
  public ResponseVo addHotelInfo(HotelInfoVo hotel) {
    System.out.println(hotel);
    Hotel h = new Hotel();
    BeanUtils.copyProperties(hotel,h);
    System.out.println(h);
    try{
      adminMapper.insertHotelInfo(h);
    }
    catch (Exception e){
      e.getMessage();
      ResponseVo.buildSuccess(INSERT_ERROR);
    }
    return ResponseVo.buildSuccess(true);
  }

  @Override
  public ResponseVo queryHotelWorker(String hotelid,UserInfoVo userInfoVo) {

    if (adminMapper.selectHotelWorker(hotelid)){
       return ResponseVo.buildFailure(USER_ERROR);
    }else {
      User user = new User();
      user.setBirthday(DateFormat.StringConvertDate(userInfoVo.getBirthday()));
      BeanUtils.copyProperties(userInfoVo,user);
      accountMapper.createNewAccount(user);
    }

    return ResponseVo.buildSuccess(true);
  }


}
