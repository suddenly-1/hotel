package com.yuantu.blImpl.user;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yuantu.bl.user.CreditService;
import com.yuantu.data.user.CreditMapper;
import com.yuantu.po.Credit;
import com.yuantu.util.DateFormat;
import com.yuantu.vo.CreditVo;
import com.yuantu.vo.ResponseVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CreditServiceImpl implements CreditService {

    @Autowired
    private CreditMapper creditMapper;

    @Override
    public ResponseVo creditDetails(int id) {
        CreditVo creditVo = new CreditVo();
        Credit credit = creditMapper.queryCreditById(id);
        BeanUtils.copyProperties(credit,creditVo);
        creditVo.setTime(DateFormat.DateConvertString(credit.getTime()));
        ResponseVo responseVo = ResponseVo.buildSuccess(creditVo);
        return responseVo;
    }

    @Override
    public ResponseVo creditList(int userId, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<CreditVo> listVo = new ArrayList<>();
        List<Credit> creditList = creditMapper.queryCreditByUserId(userId);
        for (int i = 0; i < creditList.size(); i++){
            CreditVo creditVo = new CreditVo();
            BeanUtils.copyProperties(creditList.get(i),creditVo);
            creditVo.setTime(DateFormat.DateConvertString(creditList.get(i).getTime()));
            listVo.add(creditVo);
        }
        PageInfo<CreditVo> pageInfo = new PageInfo<CreditVo>(listVo);
        return ResponseVo.buildSuccess(pageInfo);
    }

    @Override
    public void addCredit(Credit credit) {
        creditMapper.addCredit(credit);
    }
}
