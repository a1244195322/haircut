package com.example.haircut.service.impl;

import com.example.haircut.entity.User;
import com.example.haircut.mapper.UserMapper;
import com.example.haircut.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author changfei
 * @email changfei@sinosoft.com.cn
 * @create 2021/8/3 14:35
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User save(User user) {
        return userMapper.insert(user);
    }

    @Override
    public User getUserByName(String name) {
        return userMapper.getUserByName(name);
    }
}
