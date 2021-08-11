package com.example.haircut.mapper;

import com.example.haircut.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
*@author changfei
*@email changfei@sinosoft.com.cn
*@create 2021/8/3 14:31
*/
@Mapper
public interface UserMapper {

    User insert(User user);

    User getUserByName(String name);
}
