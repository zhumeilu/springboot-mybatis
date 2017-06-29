package com.zml.springbootdemo1.query;/**
 * Created with IntelliJ IDEA.
 * User: zhumeilu
 * Date: 2017/6/29
 * Time: 18:07
 * To change this template use File | Settings | File Templates.
 */

/**
 * Created with IntelliJ IDEA.
 * User: zhumeilu
 * Date: 2017/6/29
 * Time: 18:07
 * To change this template use File | Settings | File Templates.
 */
public class QueryObject {
    protected int pageSize=10;
    protected int pageNo=1;

    public int getStart(){
        return (pageNo-1)*pageSize;
    }
}
