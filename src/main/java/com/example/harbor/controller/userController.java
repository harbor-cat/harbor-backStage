package com.example.harbor.controller;

import com.alibaba.fastjson.JSON;
import com.example.harbor.entity.UserInfo;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class userController {

    @Resource
    private com.example.harbor.mapper.userMapper userMapper;

    @CrossOrigin
    @RequestMapping("/user")
    public  String user(){
        List<UserInfo> userInfoList=userMapper.getUserInfo();
        System.out.println(JSON.toJSONString(userInfoList));
        return JSON.toJSONString(userInfoList);
    }
}
