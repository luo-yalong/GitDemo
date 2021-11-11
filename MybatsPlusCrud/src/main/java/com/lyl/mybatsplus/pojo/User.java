package com.lyl.mybatsplus.pojo;

import lombok.Data;

/**
 * @author 罗亚龙
 * @date 2021/11/11 14:10
 */
@Data
public class User {

    private Integer id;
    private String name;
    private Integer age;

    public User(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
