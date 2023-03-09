package com.wmt.test;


import com.wmt.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {
    public static void main(String[] args) {
        //通过spring来创建Bean实例
        //1.读取applicationContext.xml创建文件
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.获取Bean(对象)
//        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
//        userDao.say();
        //获取UserService实例
       UserService userService =(UserService) applicationContext.getBean("userService");
       userService.say();

    }
}
