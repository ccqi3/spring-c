package com.ioc.sp.bean;

import com.ioc.sp.UserDao;
import com.ioc.sp.UserDaoImpl;

/**
 * @author ccQi
 * @Package com.ioc.sp
 * @Description: 静态工厂创建需要的实例
 * @date
 */
public class BeanFactoryByStatic {
    public static UserDao getDao() {
        return new UserDaoImpl();
//        return new UserDaoImpl2();
    }
}
