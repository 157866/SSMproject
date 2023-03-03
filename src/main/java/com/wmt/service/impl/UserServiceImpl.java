package com.wmt.service.impl;

import com.wmt.dao.UserDao;
import com.wmt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author wmt
 * @Title:
 * @Package
 * @Description:
 * @date 2023/3/217:54
 */
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public void say() {
        userDao.say();
    }
}
