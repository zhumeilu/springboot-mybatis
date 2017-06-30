package com.example.demo.mapper;

import com.example.demo.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: zhumeilu
 * Date: 2017/6/30
 * Time: 12:34
 * To change this template use File | Settings | File Templates.
 */
@Component  //为了消除Controller里面的红线警告
@Mapper
public interface User2Mapper {

    @Select("select * from user")
    @Results({
            @Result(property = "username",column = "username"),
            @Result(property = "password",column = "password")
    } )
    List<User> listAll();

    @Select("select * from user where id = #{id}")
    User get(Long id);

}
