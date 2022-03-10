package com.ioc.sp;

import com.ioc.sp.bean.BeanFactoryByDynamic;
import com.ioc.sp.bean.BeanFactoryByStatic;

import java.util.List;

/**
 * @author ccQi
 * @Package com.spring.ioc.normal
 * @Description: TODO
 * @date
 */
public class UserServiceImpl {

//    private UserDao userDao = BeanFactoryByStatic.getDao();

    private UserDao userDao = (UserDao) BeanFactoryByDynamic.getDao();

    public List<String> findAll() {
        return this.userDao.findAll();
    }
}
