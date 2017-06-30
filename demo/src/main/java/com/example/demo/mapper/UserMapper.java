package com.example.demo.mapper;

import com.example.demo.model.User;
import com.example.demo.query.UserQueryObject;
import org.apache.ibatis.annotations.Mapper;
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
public interface UserMapper {

    User get(Long id);

    void insert(User user);
    void update(User user);
    List<User> list(UserQueryObject qo);
    void delete(Long id);
}
