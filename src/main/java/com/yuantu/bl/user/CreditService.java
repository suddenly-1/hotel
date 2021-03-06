package com.yuantu.bl.user;

import com.yuantu.po.Credit;
import com.yuantu.vo.ResponseVo;


public interface CreditService {

    /**
     * 根据订单号和状态查询信用详情
     *
     * @param orderNumber
     * @param action
     * @return
     */
    Credit creditDetails(String orderNumber, String action);

    /**
     * 查询信用详情
     *
     * @param id
     * @return
     */
    ResponseVo creditDetails(int id);

    /**
     * 查询信用列表
     *
     * @param userId
     * @return
     */
    ResponseVo creditList(int userId, int pageNum, int pageSize);

    /**
     * 增加信用记录
     *
     * @param credit
     * @return
     */
    void addCredit(Credit credit);

}
