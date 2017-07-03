package com.zml.demo3.Controller;/**
 * Created with IntelliJ IDEA.
 * User: zhumeilu
 * Date: 2017/7/3
 * Time: 11:31
 * To change this template use File | Settings | File Templates.
 */

import com.zml.demo3.model.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * Created with IntelliJ IDEA.
 * User: zhumeilu
 * Date: 2017/7/3
 * Time: 11:31
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class LoginController {

    Logger logger = LoggerFactory.getLogger(LoginController.class);

    @RequestMapping(value = "/login" ,method = RequestMethod.POST)
    public String login(String username, String password, ModelMap modelMap){
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(username,password);
        Subject subject = SecurityUtils.getSubject();
        logger.info("username:"+username+"----passowrd:"+password);
        try{
            subject.login(usernamePasswordToken);
            User user = (User) subject.getPrincipal();
            modelMap.addAttribute("user",user);
            boolean plus = subject.hasRole("plus");
            logger.info("plus权限:"+plus);
            subject.checkPermission("/users");
        }catch (UnknownAccountException e){
            modelMap.addAttribute("msg","账户不存在");
            return "/login";
        }

        return "/index";
    }

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String loginPage(){
        return "/login";
    }
}
