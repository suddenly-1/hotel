package com.yuantu.controller.user;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.yuantu.bl.user.CreditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/credit")
public class CreditController {

    @Autowired
    private CreditService creditService;

    @GetMapping("/creditDetails/{id}")
    public String creditDetails(@PathVariable int id){
        return JSON.toJSONString(creditService.creditDetails(id));
    }

    @GetMapping("/creditList/{userId}/{pageNum}/{pageSize}")
    public String creditList(@PathVariable int userId, @PathVariable int pageNum, @PathVariable int pageSize){
//        SerializerFeature.DisableCircularReferenceDetect   --->   fastjson 解除循环引用
        return JSON.toJSONString(creditService.creditList(userId,pageNum,pageSize), SerializerFeature.DisableCircularReferenceDetect);
    }

}
