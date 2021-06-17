package com.ljj.hibernatedemo.service;

import com.ljj.hibernatedemo.pojo.Result;
import com.ljj.hibernatedemo.pojo.User;

/**
 * @author lijunjun
 * @name UserService
 * @date 2021年06月17日 4:28 下午
 * @decpription
 */
public interface UserService {


    /**
     * 保存 user 对象
     * @param user
     * @return
     */
    Result saveUser(User user);

    /**
     * 查询所有user
     * @return
     */
    Result queryAll();

    /**
     * 通过name和age查询
     * @param name
     * @param age
     * @return
     */
    Result getByNameAndAge(String name,int age);

}
