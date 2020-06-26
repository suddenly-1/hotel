package com.yuantu.blImpl.user;

import com.yuantu.bl.user.AccountService;
import com.yuantu.data.user.AccountMapper;
import com.yuantu.po.User;
import com.yuantu.util.DateFormat;
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
    public ResponseVo login(UserLogin userLogin) {
        User user = accountMapper.queryUserByAccountName(userLogin.getAccountNumber());
        if (user != null){
            userLogin.setId(user.getId());
            userLogin.setPassword(null);
            if (userLogin.getRemember() == null){
                userLogin.setRemember("null");
            }
            userLogin.setUsertype(user.getUserType());
            return ResponseVo.buildSuccess(userLogin);
        } else {
            return ResponseVo.buildFailure("用户名或密码错误！");
        }
    }

    @Override
    public ResponseVo register(UserForm userForm) {
        User user1 = accountMapper.queryUserByAccountName(userForm.getAccountNumber());
        if (user1 != null){
            return ResponseVo.buildFailure("账号已存在！");
        } else {
            User user = new User();
            BeanUtils.copyProperties(userForm,user);
            user.setCredit(100.0);
            try {
                accountMapper.createNewAccount(user);
            } catch (Exception e){
                e.getMessage();
                return ResponseVo.buildFailure(ACCOUNT_EXIST);
            }
            return ResponseVo.buildSuccess();
        }
    }

    @Override
    public ResponseVo queryUserInfo(int id) {
        User user = accountMapper.queryUserById(id);
        if (user == null){
            return ResponseVo.buildFailure(ACCOUNT_INFO_ERROR);
        }
        UserInfo userInfo = new UserInfo();
        BeanUtils.copyProperties(user,userInfo);
        if(user.getBirthday() != null){
            userInfo.setBirthday(DateFormat.DateConvertString(user.getBirthday()));
        }
        return ResponseVo.buildSuccess(userInfo);
    }

    @Override
    public ResponseVo updateUserInfo(UserInfo userInfo) {
        User user = new User();
        BeanUtils.copyProperties(userInfo,user);
        if(userInfo.getBirthday() != null){
            user.setBirthday(DateFormat.StringConvertDate(userInfo.getBirthday(),"yyyy-MM-dd"));
        }
        accountMapper.updateAccount(user);
        try {
            accountMapper.updateAccount(user);
        } catch (Exception e){
            e.getMessage();
            return ResponseVo.buildFailure(UPDATE_ERROR);
        }
        return ResponseVo.buildSuccess();
    }

    @Override
    public void vip(Integer id, Double credit) {
        if (credit >= 0 && credit < 2000) {
            accountMapper.updateAccount(new User(id,null,null,null,null,null,"vip1",null,null,null,null));
        }else if (credit >= 2000 && credit < 5000) {
            accountMapper.updateAccount(new User(id,null,null,null,null,null,"vip2",null,null,null,null));
        }else if (credit >= 5000) {
            accountMapper.updateAccount(new User(id,null,null,null,null,null,"vip3",null,null,null,null));
        }
    }

}
