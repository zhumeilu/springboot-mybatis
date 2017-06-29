package com.zml.springbootdemo1.controller;

import com.zml.springbootdemo1.mapper.UserMapper;
import com.zml.springbootdemo1.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created with IntelliJ IDEA.
 * User: zhumeilu
 * Date: 2017/6/29
 * Time: 16:38
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class HelloController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/")
    public String hello(ModelMap modelMap){
        modelMap.addAttribute("name","zhumeilu");
        return "hello";
    }

    @RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
    @ResponseBody
    public User getUser(@PathVariable Long id){
        System.out.println(id);
        User user = userMapper.get(id);
        System.out.println(user.getUsername());
        return user;
    }
}
