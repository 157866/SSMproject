package com.wmt.test;

import com.wmt.dao.impl.UserDaoImpl;

/**
 * @author wmt
 * @Title:
 * @Package
 * @Description:
 * @date 2023/3/217:30
 */
public class UserTest {
    public static void main(String[] args) {
        UserDaoImpl userDao = new UserDaoImpl();
        userDao.say();
    }
}
