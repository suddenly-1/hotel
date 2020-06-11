package com.yuantu.blImpl.user;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yuantu.bl.user.AdminService;
import com.yuantu.data.user.AdminMapper;
import com.yuantu.po.User;
import com.yuantu.util.DateFormat;
import com.yuantu.util.PageUtil;
import com.yuantu.vo.UserInfoVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AdminServiceImpl implements AdminService {

  @Autowired
  AdminMapper adminMapper;

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
}
