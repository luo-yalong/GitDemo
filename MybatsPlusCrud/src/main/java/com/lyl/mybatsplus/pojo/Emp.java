package com.lyl.mybatsplus.pojo;

import lombok.Data;

/**
 * @author 罗亚龙
 * @date 2021/11/11 15:41
 */
@Data
public class Emp {

    private int id;
    private String name;
    private int sex;

    public Emp(int id, String name, int sex) {
        this.id = id;
        this.name = name;
        this.sex = sex;
    }

    private Integer age;
}
