package com.example.demo.util;/**
 * Created with IntelliJ IDEA.
 * User: zhumeilu
 * Date: 2017/6/30
 * Time: 16:13
 * To change this template use File | Settings | File Templates.
 */

/**
 * Created with IntelliJ IDEA.
 * User: zhumeilu
 * Date: 2017/6/30
 * Time: 16:13
 * To change this template use File | Settings | File Templates.
 */
public class AjaxResult {

    public boolean success=true;
    public String msg;
    public AjaxResult() {
    }
    public AjaxResult(boolean success,String msg) {
        this.msg = msg;
        this.success = success;
    }

}
