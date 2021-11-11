package com.lyl.mybatsplus.controller;

import com.lyl.mybatsplus.pojo.User;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 罗亚龙
 * @date 2021/11/11 15:03
 */
@RestController
public class UserController {
    Map<Integer, User> userMap = new HashMap<>();

    {
        userMap.put(1,new User(1,"张三1", 19));
        userMap.put(2,new User(2,"张三2", 29));
        userMap.put(3,new User(3,"张三3", 39));
        userMap.put(4,new User(4,"张三4", 49));
        userMap.put(5,new User(5,"张三5", 59));
        userMap.put(6,new User(6,"张三6", 69));
    }

    @GetMapping("/getUserById")
    public Object getUserById(int id){
        return userMap.get(id);
    }

    @PostMapping("/addUser")
    public void addUser(int id, String name, int age){
        userMap.put(id,new User(id,name,age));
    }

    @PutMapping("/updateUser")
    public void updateUser(int id,String name){
        userMap.get(id).setName(name);
    }

    @DeleteMapping("/deleteUser")
    public void deleteUser(int id){
        userMap.remove(id);
    }
}
