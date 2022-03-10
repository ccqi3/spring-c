package com.ioc.sp.bean;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

/**
 * @author ccQi
 * @Package com.ioc.sp
 * @Description: 反射创建bean
 * @date
 */
public class BeanFactoryByDynamic {

    private static Properties properties;

    static {
        properties = new Properties();
        try {
            properties.load(BeanFactoryByDynamic.class.getClassLoader().getResourceAsStream("spring.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Object getDao() {
        String value = properties.getProperty("userDao");
        try {
            Class clazz = Class.forName(value);
            Object o = clazz.getConstructor(null).newInstance(null);
            return o;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return null;
    }

}
