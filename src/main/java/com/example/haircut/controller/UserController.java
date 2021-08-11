package com.example.haircut.controller;

import com.example.haircut.common.R;
import com.example.haircut.entity.User;
import com.example.haircut.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author changfei
 * @email changfei@sinosoft.com.cn
 * @create 2021/8/3 14:39
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/index")
    public String index(){
        return "user/index";
    }

    @RequestMapping("/save")
    @ResponseBody
    public R<User> save(User user){
        user=userService.save(user);
        return new R<User>().ok(user);
    }

    @RequestMapping("/getUserByName")
    @ResponseBody
    public R<User> getUserByName(String name){
        User user=userService.getUserByName(name);
        return new R<User>().ok(user);
    }
}
