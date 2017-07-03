package com.zml.demo3.Controller;/**
 * Created with IntelliJ IDEA.
 * User: zhumeilu
 * Date: 2017/7/3
 * Time: 11:54
 * To change this template use File | Settings | File Templates.
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 * User: zhumeilu
 * Date: 2017/7/3
 * Time: 11:54
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class IndexController {
    Logger logger = LoggerFactory.getLogger(LoginController.class);
    @RequestMapping("/")
    public String index(){
        logger.info("访问/");
        return "/index";
    }

    @RequestMapping("/index")
    public String indexPage(){
        logger.info("访问/index");
        return "/index";
    }

}
