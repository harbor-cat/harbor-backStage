package com.example.harbor;

import com.alibaba.fastjson.JSON;
import com.example.harbor.entity.UserInfo;
import com.example.harbor.mapper.userMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
public class test {

    @Resource
    private userMapper userMapper;
    @Test
    public  void t1(){
        List<UserInfo> userInfoList=userMapper.getUserInfo();
        System.out.println(JSON.toJSONString((userInfoList)));
    }
}
