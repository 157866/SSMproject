package com.wmt.instance;

public class Bean2_Factory {
    //静态工厂类
    //使用静态方法来实例化Bean2
    public static Bean2 createBean(){
        return new Bean2();
    }
}
