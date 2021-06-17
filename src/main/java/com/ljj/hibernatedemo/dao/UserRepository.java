package com.ljj.hibernatedemo.dao;

import com.ljj.hibernatedemo.pojo.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author lijunjun
 * @name UserRepository
 * @date 2021年06月17日 4:30 下午
 * @decpription
 */
@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

    /**
     * 根据姓名和年龄获取用户信息
     * @author lijunjun
     * @date 2021/6/17 5:04 下午
     * @param name 姓名
     * @param age 年龄
     * @return User>
     */
    /**
    hibernate中类似于下面的方法，无需在xml文件中写sql，内部已经做了封装，自动识别
    下面的方法就相当于注释的内容
    */
    List<User> getByNameAndAge(String name, int age);

    /*@Query("select u from User u where u.name=:name and u.age=:age")
    List<User> getByNameAndAge(@Param("name") String name, @Param("age") Integer age);*/
}
