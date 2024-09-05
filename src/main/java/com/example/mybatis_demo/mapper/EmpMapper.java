package com.example.mybatis_demo.mapper;

import com.example.mybatis_demo.pojo.Emp;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface EmpMapper {
    @Select("select * from emp")
    public List<Emp> selectall();
    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("insert into emp(username, name, gender, image, job, entrydate, dept_id, create_time, update_time) values (#{username}, #{name}, #{gender}, #{image}, #{job}, #{entrydate}, #{deptId}, #{createTime}, #{updateTime})")
    public void insert(Emp emp);
//    @Results({@Result(column = "dept_id", property = "deptId"),
//            @Result(column = "create_time", property = "createTime"),
//            @Result(column = "update_time", property = "updateTime")})
    @Select("select id, username, password, name, gender, image, job, entrydate, dept_id, create_time, update_time from emp where id=#{id}")
    public Emp selectById(Integer id);
//    @Select("select id, username, password, name, gender, image, job, entrydate, " +
//            "dept_id AS deptId, create_time AS createTime, update_time AS updateTime " +
//            "from emp " +
//            "where id=#{id}")
//    public Emp selectById(int id);
}
