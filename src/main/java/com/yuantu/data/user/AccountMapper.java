package com.yuantu.data.user;

import com.yuantu.po.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @Author:zhaozhongwei
 * @Date:2020-05-30
 */
@Mapper
@Repository
public interface AccountMapper {

    /**
     * 根据id查询
     * @param id
     * @return
     */
    User queryUserById(@Param("id") int id);

    /**
     * 根据账号查询
     * @param accountNumber
     * @return
     */
    User queryUserByAccountName(@Param("accountNumber") String accountNumber);

    /**
     * 添加用户
     * @param user
     * @return
     */
    void createNewAccount(User user);

    /**
     * 修改信息
     * @param user
     * @return
     */
    void updateAccount(User user);

}
