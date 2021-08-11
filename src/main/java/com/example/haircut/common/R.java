package com.example.haircut.common;

import lombok.Data;

import java.io.Serializable;

/**
 * @author changfei
 * @email changfei@sinosoft.com.cn
 * @create 2021/8/3 14:46
 */

@Data
public class R<T> implements Serializable {
    private static final long serialVersionUID = 1L;

    private int code = 0;

    private String msg ="success";

    private T data;


    public R<T> ok(T data){
        this.setData(data);
        return this;
    }

    public R<T> error(int code, String msg){
        this.code=code;
        this.msg=msg;
        return this;
    }

}
