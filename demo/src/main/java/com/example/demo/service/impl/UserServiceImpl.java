package com.example.demo.service.impl;/**
 * Created with IntelliJ IDEA.
 * User: zhumeilu
 * Date: 2017/6/30
 * Time: 14:20
 * To change this template use File | Settings | File Templates.
 */

import com.example.demo.mapper.UserMapper;
import com.example.demo.model.User;
import com.example.demo.query.UserQueryObject;
import com.example.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: zhumeilu
 * Date: 2017/6/30
 * Time: 14:20
 * To change this template use File | Settings | File Templates.
 */
@Service
@Transactional
public class UserServiceImpl implements IUserService{
    @Autowired
    private UserMapper userMapper;
    @Override
    public User get(Long id) {
        return userMapper.get(id);
    }

    @Override
    public void save(User user) {
        userMapper.insert(user);
    }

    @Override
    public void update(User user) {
        userMapper.update(user);
    }

    @Override
    public List<User> list(UserQueryObject qo) {
        return userMapper.list(qo);
    }

    @Override
    public void delete(Long id) {
        userMapper.delete(id);
    }

}
