package com.spring.ioc.normal;

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
        return Arrays.asList("1", "2", "3");
    }
}
