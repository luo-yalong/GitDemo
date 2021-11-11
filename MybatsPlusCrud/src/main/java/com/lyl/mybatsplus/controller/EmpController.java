package com.lyl.mybatsplus.controller;

import com.lyl.mybatsplus.mock.MockJson;
import com.lyl.mybatsplus.pojo.Emp;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;

/**
 * @author 罗亚龙
 * @date 2021/11/11 15:45
 */
@RestController
@RequestMapping("/emp")
public class EmpController {


    /**
     * 查询
     * @param id
     * @return
     */
    @GetMapping("{id}")
    public Object getEmpById(@PathVariable("id") Serializable id){
        return MockJson.empMap.get(id);
    }

    @GetMapping
    public Object getAllEmp(){
        return MockJson.empMap;
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable("id") Serializable id){
        MockJson.empMap.remove(id);
    }

    @PutMapping
    public void updateEmp(@RequestBody Emp emp){
        MockJson.empMap.put(emp.getId(),emp);
    }

    @PostMapping
    public void addEmp(@RequestBody Emp emp){
        MockJson.empMap.put(emp.getId(),emp);
    }

}
