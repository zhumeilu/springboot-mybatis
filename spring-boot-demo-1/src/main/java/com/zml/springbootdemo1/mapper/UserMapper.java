package com.zml.springbootdemo1.mapper;/**
 * Created with IntelliJ IDEA.
 * User: zhumeilu
 * Date: 2017/6/29
 * Time: 17:23
 * To change this template use File | Settings | File Templates.
 */

import com.zml.springbootdemo1.model.User;
import com.zml.springbootdemo1.query.UserQueryObject;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: zhumeilu
 * Date: 2017/6/29
 * Time: 17:23
 * To change this template use File | Settings | File Templates.
 */
@Component("userMapper")
@Mapper
public interface UserMapper {


//    @Insert("INSERT INTO USER(NAME) VALUES(#{name})")
    int insert(@Param("username") String username);

//    @Select("select * from User where id = #{id}")
    User get(@Param("id") Long id);

    List<User> list(UserQueryObject qo);
}
