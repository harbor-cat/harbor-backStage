package com.example.harbor.mapper;

import com.example.harbor.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper

public interface userMapper {

    @Select("select * from user_info")
    List<UserInfo> getUserInfo();
}
