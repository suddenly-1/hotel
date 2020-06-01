package com.yuantu;

import com.yuantu.bl.user.AccountService;
import com.yuantu.data.user.AccountMapper;
import com.yuantu.po.User;
import com.yuantu.vo.ResponseVo;
import com.yuantu.vo.UserForm;
import com.yuantu.vo.UserInfo;
import com.yuantu.vo.UserLogin;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootTest
class HotelApplicationTests {

    @Autowired
    private AccountMapper accountMapper;
    @Autowired
    private AccountService accountService;

    @Test
    void contextLoads() {
        System.out.println("====================");

        UserInfo userInfo = new UserInfo(20,"黄20",null,"2020",null,null,null);
        accountService.updateUserInfo(userInfo);

        System.out.println("====================");
    }

}
