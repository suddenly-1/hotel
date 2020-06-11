package com.yuantu.data.user;

import com.yuantu.po.Credit;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author:zhaozhongwei
 * @Date:2020-06-06
 */
@Mapper
@Repository
public interface CreditMapper {

    /**
     * 根据id查询
     * @param id
     * @return
     */
    Credit queryCreditById(@Param("id") int id);

    /**
     * 根据用户id查询
     * @param userId
     * @return
     */
    List<Credit> queryCreditByUserId(@Param("user_id") int userId);

    /**
     * 增加信用记录
     * @param credit
     * @return
     */
    void addCredit(Credit credit);

}
