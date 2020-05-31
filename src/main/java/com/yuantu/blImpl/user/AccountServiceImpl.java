package com.yuantu.blImpl.user;

import com.yuantu.bl.user.AccountService;
import com.yuantu.data.user.AccountMapper;
import com.yuantu.po.User;
import com.yuantu.vo.UserLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public User queryUserById(int id) {
        return accountMapper.queryUserById(id);
    }

    @Override
    public User login(UserLogin userLogin) {

        User user = accountMapper.queryUserByAccountName(userLogin.getAccountNumber());


        if (null == user || !user.getPassword().equals(userLogin.getPassword())){
            return null;
        }

        return user;
    }

}
