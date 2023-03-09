package com.wmt.instance;

public class Bean3_Factory {
    //非静态方法（实例化Bean3）
    public Bean3 createBean(){
        return new Bean3();
    }
}
