package com.wmt.DI;

/**
 * @author wmt
 * @Title:
 * @Package
 * @Description:
 * @date 2023/3/917:04
 */
public class BeanService {
//    创建一个无参构造方法
//    使用setter方法注入来照顾如BeanDao 定义一个属性
    private BeanDao beanDao;
    public void study(){
        System.out.println("i am studying in BeanService");
    }

    public void setBeanDao(BeanDao beanDao) {
        this.beanDao = beanDao;
    }
}
