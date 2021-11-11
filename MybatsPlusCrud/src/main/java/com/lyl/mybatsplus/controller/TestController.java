package com.lyl.mybatsplus.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 罗亚龙
 * @date 2021/11/11 11:29
 */
@RestController
public class TestController {

    int id = 1;

    @GetMapping("/hello")
    public String hello(){
        String str = "hello,world------";
        System.out.println("str = " + str);
        return str;
    }

    @GetMapping("/index")
    public int index(){
        return id ++;
    }

}
