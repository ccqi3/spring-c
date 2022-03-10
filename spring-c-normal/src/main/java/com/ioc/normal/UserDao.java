package com.ioc.normal;

import java.util.Arrays;
import java.util.List;

/**
 * @author ccQi
 * @Package com.spring.ioc.normal
 * @Description: TODO
 * @date
 */
public class UserDao {
    List<String> findAll() {
        System.out.println("正在从mysql中查询数据");
        return Arrays.asList("1", "2", "3");
    }
}
