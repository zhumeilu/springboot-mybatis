package com.zml.demo3; /**
 * Created with IntelliJ IDEA.
 * User: zhumeilu
 * Date: 2017/7/3
 * Time: 16:59
 * To change this template use File | Settings | File Templates.
 */

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * Created with IntelliJ IDEA.
 * User: zhumeilu
 * Date: 2017/7/3
 * Time: 16:59
 * To change this template use File | Settings | File Templates.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootDemo3Test {

    private Logger logger = LoggerFactory.getLogger(SpringBootDemo3Test.class);

    @Test
    public void testLog(){
        logger.info("logger启动了");
    }
}
