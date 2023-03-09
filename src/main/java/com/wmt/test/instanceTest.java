package com.wmt.test;

import com.wmt.instance.Bean2;
import com.wmt.instance.Bean3;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class instanceTest {
    public static void main(String[] args) {
        //读取配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取我们的Bean实例
       // Bean1 bean1 = (Bean1)applicationContext.getBean("bean1");
    //   Bean1 bean1= applicationContext.getBean("bean1", Bean1.class);
        Bean3 firstBean3 = applicationContext.getBean("bean3", Bean3.class);
        Bean3 bean3 = applicationContext.getBean("bean3", Bean3.class);



    }
}
