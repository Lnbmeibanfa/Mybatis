package com.example.mybatis_demo;

import com.example.mybatis_demo.mapper.EmpMapper;
import com.example.mybatis_demo.pojo.Emp;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@SpringBootTest
class MybatisDemoApplicationTests {
    @Autowired
    private EmpMapper empMapper;
    @Test
    public void testSelectById(){
        Emp emp = empMapper.selectById(3);
        System.out.println(emp);
    }
}
