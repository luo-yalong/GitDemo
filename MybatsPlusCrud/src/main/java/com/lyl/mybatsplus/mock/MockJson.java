package com.lyl.mybatsplus.mock;

import com.lyl.mybatsplus.pojo.Emp;
import com.lyl.mybatsplus.pojo.User;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 罗亚龙
 * @date 2021/11/11 15:40
 */
public class MockJson {

    public static Map<Integer, User> userMap = new HashMap<>();
    public static Map<Integer, Emp> empMap = new HashMap<>();

    static {
        userMap.put(1,new User(1,"张三1", 12));
        userMap.put(2,new User(2,"张三2", 22));
        userMap.put(3,new User(3,"张三3", 32));
        userMap.put(4,new User(4,"张三4", 42));
        userMap.put(5,new User(5,"张三5", 52));

        empMap.put(1,new Emp(1,"员工1",1));
        empMap.put(2,new Emp(2,"员工2",0));
        empMap.put(3,new Emp(3,"员工3",1));
        empMap.put(4,new Emp(4,"员工4",0));
        empMap.put(5,new Emp(5,"员工5",1));
    }

}
