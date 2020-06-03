package com.yuantu.blImpl.user;

import com.yuantu.bl.user.AccountService;
import com.yuantu.data.user.AccountMapper;
import com.yuantu.po.User;
import com.yuantu.vo.ResponseVo;
import com.yuantu.vo.UserForm;
import com.yuantu.vo.UserInfo;
import com.yuantu.vo.UserLogin;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {
    private final static String ACCOUNT_INFO_ERROR = "用户名或密码错误";
    private final static String ACCOUNT_EXIST = "账号已存在";
    private final static String UPDATE_ERROR = "修改失败";

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public User queryUserById(int id) {
        return accountMapper.queryUserById(id);
    }

    @Override
    public User login(UserLogin userLogin) {
        User user = accountMapper.queryUserByAccountName(userLogin.getAccountNumber());
//        if (null == user || !user.getPassword().equals(userLogin.getPassword())){
//            return ResponseVo.buildFailure(ACCOUNT_INFO_ERROR);
//        }
//        return ResponseVo.buildSuccess(user.getId());
        return user;
    }

    @Override
    public ResponseVo register(UserForm userForm) {
        User user = new User();
        BeanUtils.copyProperties(userForm,user);
        user.setCredit("100");
        try {
            accountMapper.createNewAccount(user);
        } catch (Exception e){
            e.getMessage();
            return ResponseVo.buildFailure(ACCOUNT_EXIST);
        }
        return ResponseVo.buildSuccess();
    }

    @Override
    public ResponseVo queryUserInfo(int id) {
        User user = accountMapper.queryUserById(id);
        if (user == null){
            return ResponseVo.buildFailure(ACCOUNT_INFO_ERROR);
        }
        UserInfo userInfo = new UserInfo();
        BeanUtils.copyProperties(user,userInfo);
        return ResponseVo.buildSuccess(userInfo);
    }

    @Override
    public ResponseVo updateUserInfo(UserInfo userInfo) {
        User user = new User();
        BeanUtils.copyProperties(userInfo,user);
        try {
            accountMapper.updateAccount(user);
        } catch (Exception e){
            e.getMessage();
            return ResponseVo.buildFailure(UPDATE_ERROR);
        }
        return ResponseVo.buildSuccess();
    }

}
