package com.zml.demo3.service;


import com.zml.demo3.model.User;
import com.zml.demo3.query.UserQueryObject;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: zhumeilu
 * Date: 2017/6/30
 * Time: 14:19
 * To change this template use File | Settings | File Templates.
 */
public interface IUserService {

    User get(Long id);

    void save(User user);
    void update(User user);
    List<User> list(UserQueryObject qo);
    void delete(Long id);
}
