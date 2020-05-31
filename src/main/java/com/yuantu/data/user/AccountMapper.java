package com.yuantu.data.user;

import com.yuantu.po.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface AccountMapper {

//    根据id查询
    User queryUserById(@Param("id") int id);
//    根据账号登录
    User queryUserByAccountName(@Param("accountNumber") String accountNumber);

}
