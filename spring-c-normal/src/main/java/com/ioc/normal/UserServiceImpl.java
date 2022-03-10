package com.ioc.normal;

import java.util.List;

/**
 * @author ccQi
 * @Package com.spring.ioc.normal
 * @Description: TODO
 * @date
 */
public class UserServiceImpl {

    private UserDao userDao = new UserDao();

    public List<String> findAll() {
        return this.userDao.findAll();
    }
}
