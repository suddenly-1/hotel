package com.yuantu;

import com.yuantu.bl.user.AccountService;
import com.yuantu.data.user.AccountMapper;
import com.yuantu.po.User;
import com.yuantu.vo.UserLogin;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HotelApplicationTests {

    @Autowired
    private AccountMapper accountMapper;
    @Autowired
    private AccountService accountService;

    @Test
    void contextLoads() {
        System.out.println("====================");


//        User user = accountMapper.queryUserByName("111111");
//        System.out.println(user.toString());

        User user1 = accountService.login(new UserLogin("111111","123"));
        System.out.println(user1);


        System.out.println("====================");
    }

}
