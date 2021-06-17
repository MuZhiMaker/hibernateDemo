package com.ljj.hibernatedemo.pojo;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

/**
 * @author lijunjun
 * @name User
 * @date 2021年06月17日 4:26 下午
 * @decpription
 */
@Data
@ToString
@Entity
@Table(name = "t_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;

    @Column(name = "name")
    String name;

    @Column(name = "age")
    int age;

}
