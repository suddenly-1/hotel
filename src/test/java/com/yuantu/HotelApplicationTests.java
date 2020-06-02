package com.yuantu;

import com.yuantu.bl.user.AccountService;
import com.yuantu.data.user.AccountMapper;
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


        System.out.println("====================");
    }

}
