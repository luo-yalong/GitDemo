package com.lyl.mybatsplus.controller;

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

    Map<Integer,String > map = new HashMap<>();
    {
        map.put(1, "张三1");
        map.put(2, "张三2");
        map.put(3, "张三3");
        map.put(4, "张三4");
        map.put(5, "张三5");
    }


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
        return map.getOrDefault(id,"");
    }

    @GetMapping("/addUser")
    public void addUser(int id,String name){
        map.put(id,name);
    }
}
