package com.example.haircut.service;


import com.example.haircut.entity.User;

/**
 * @author changfei
 * @email changfei@sinosoft.com.cn
 * @create 2021/8/3 14:34
 */

public interface UserService {

    User save(User user);

    User getUserByName(String name);
}
