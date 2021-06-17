package com.ljj.hibernatedemo.pojo;

import lombok.Data;

/**
 * @author lijunjun
 * @name Result
 * @date 2021年06月17日 4:25 下午
 * @decpription
 */
@Data
public class Result {

    private int code = 200;
    private String msg = "操作成功";
    private Object data;

    public Result(int code,String msg){
        this.code = code;
        this.msg = msg;
    }

    public Result(Object data){
        this.data = data;
    }
}
