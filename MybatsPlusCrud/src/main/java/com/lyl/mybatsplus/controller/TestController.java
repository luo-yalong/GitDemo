package com.lyl.mybatsplus.controller;

import com.lyl.mybatsplus.pojo.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 罗亚龙
 * @date 2021/11/11 11:29
 */
@RestController
public class TestController {

    int id = 1;

    Map<Integer, User> userMap = new HashMap<Integer, User>(){{
        put(1,new User(1,"张三",19));
        put(2,new User(2,"张三",16));
        put(3,new User(3,"张三",29));
        put(4,new User(4,"张三",30));
    }};


    @GetMapping("/hello")
    public String hello(){
        String str = "hello,world";
        System.out.println("str = " + str);
        return str;
    }

    @GetMapping("/index")
    public int index(){
        return id ++;
    }

    @GetMapping("/queryUserById")
    public Object queryUserById(int id){
        return userMap.getOrDefault(id,null);
    }

}
