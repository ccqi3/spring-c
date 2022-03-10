package com.ioc.normal;

import java.util.List;

/**
 * @author ccQi
 * @Package com.spring.ioc.normal
 * @Description: TODO
 * @date
 */
public class NormalMain {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        List<String> all = userService.findAll();
        System.out.println(all.toString());
    }
}
