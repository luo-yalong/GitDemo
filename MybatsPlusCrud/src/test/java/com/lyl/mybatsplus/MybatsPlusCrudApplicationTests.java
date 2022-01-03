package com.lyl.mybatsplus;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MybatsPlusCrudApplicationTests {

    @Test
    void contextLoads() {
        int a =  1 / 0;
        System.out.println(a);
    }

}
