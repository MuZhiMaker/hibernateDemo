package com.ljj.hibernatedemo.service.impl;

import com.ljj.hibernatedemo.dao.UserRepository;
import com.ljj.hibernatedemo.pojo.Result;
import com.ljj.hibernatedemo.pojo.User;
import com.ljj.hibernatedemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lijunjun
 * @name UserServiceImpl
 * @date 2021年06月17日 4:29 下午
 * @decpription
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    /**
     * 保存用户信息
     * @author lijunjun
     * @date 2021/6/17 4:59 下午
     * @param user
     * @return Result
     */
    @Override
    public Result saveUser(User user) {
        User save = userRepository.save(user);
        return new Result(save);
    }

    /**
     * 查询用户表中所有数据
     * @author lijunjun
     * @date 2021/6/17 4:58 下午
     * @return Result
     */
    @Override
    public Result queryAll() {
        Iterable<User> list = userRepository.findAll();
        return new Result(list);
    }

    /**
     * 根据姓名和年龄获取用户信息
     * @author lijunjun
     * @date 2021/6/17 4:58 下午
     * @param name 姓名
     * @param age 年龄
     * @return Result
     */
    @Override
    public Result getByNameAndAge(String name, int age) {
        List<User> list = userRepository.getByNameAndAge(name, age);
        return new Result(list);
    }
}
