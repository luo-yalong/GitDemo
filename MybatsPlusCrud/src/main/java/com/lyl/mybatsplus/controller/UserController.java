package com.lyl.mybatsplus.controller;

import com.lyl.mybatsplus.mock.MockJson;
import com.lyl.mybatsplus.pojo.User;
import org.springframework.web.bind.annotation.*;

/**
 * @author 罗亚龙
 * @date 2021/11/11 15:03
 */
@RestController
public class UserController {

    @GetMapping("/getUserById")
    public Object getUserById(int id){
        return MockJson.userMap.get(id);
    }

    @PostMapping("/addUser")
    public void addUser(int id, String name, int age){
        MockJson.userMap.put(id,new User(id,name,age));
    }

    @PutMapping("/updateUser")
    public void updateUser(int id,String name){
        MockJson.userMap.get(id).setName(name);
    }

    @DeleteMapping("/deleteUser")
    public void deleteUser(int id){
        MockJson.userMap.remove(id);
    }
}
