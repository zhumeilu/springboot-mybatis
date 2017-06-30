package com.zml.demo3.query;/**
 * Created with IntelliJ IDEA.
 * User: zhumeilu
 * Date: 2017/6/30
 * Time: 16:00
 * To change this template use File | Settings | File Templates.
 */

/**
 * Created with IntelliJ IDEA.
 * User: zhumeilu
 * Date: 2017/6/30
 * Time: 16:00
 * To change this template use File | Settings | File Templates.
 */
public class QueryObject {

    private int pageSize = 10;
    private int pageNo = 1;

    public int getStart(){
        return (pageNo-1)*pageSize;
    }
    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }
}
