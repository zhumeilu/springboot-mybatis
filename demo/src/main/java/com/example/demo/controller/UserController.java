package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.query.UserQueryObject;
import com.example.demo.service.IUserService;
import com.example.demo.util.AjaxResult;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: zhumeilu
 * Date: 2017/6/30
 * Time: 16:09
 * To change this template use File | Settings | File Templates.
 */
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public List<User> list(UserQueryObject qo){
        List<User> list = userService.list(qo);
        return list;
    }
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public User get(@PathVariable Long id){
       User user = userService.get(id);
        return user;
    }
    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public AjaxResult update(@PathVariable Long id, @ModelAttribute User user){
        userService.update(user);
        return new AjaxResult(true,"编辑成功");
    }
    @RequestMapping(value = "/",method = RequestMethod.POST)
    public AjaxResult add( User user){
        userService.save(user);
        return new AjaxResult(true,"添加成功");
    }
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public AjaxResult delete( @PathVariable Long id){
        userService.delete(id);
        return new AjaxResult(true,"添加成功");
    }

}
