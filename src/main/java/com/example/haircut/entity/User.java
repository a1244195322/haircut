package com.example.haircut.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author changfei
 * @email changfei@sinosoft.com.cn
 * @create 2021/8/3 14:20
 */
@Data
public class User {

    private String id;

    private String name;

    private String idCard;

    private int times;

    private Date createTime;
}
