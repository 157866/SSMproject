package com.wmt.dao.impl;

import com.wmt.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wmt
 * @Title:
 * @Package
 * @Description:
 * @date 2023/3/217:28
 */
public class UserDaoImpl implements UserDao {

    public void say() {
        System.out.println("hello");
    }
//public static void main(String[] args) {
//    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//    UserDao userDao = (UserDao) applicationContext.getBean("userDao");
//    userDao.say();
//}


}
