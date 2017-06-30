package com.example.demo.controller;/**
 * Created with IntelliJ IDEA.
 * User: zhumeilu
 * Date: 2017/6/30
 * Time: 12:10
 * To change this template use File | Settings | File Templates.
 */

import com.example.demo.mapper.User2Mapper;
import com.example.demo.mapper.UserMapper;
import com.example.demo.model.User;
import com.example.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: zhumeilu
 * Date: 2017/6/30
 * Time: 12:10
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class IndexController {

    @Autowired
    private IUserService userService;
    @RequestMapping("/")
    public String index(Map<String,Object> map){
        User user = userService.get(1L);
        System.out.println(user.getUsername());
        map.put("name","zml");
        return "hello";
    }

}
