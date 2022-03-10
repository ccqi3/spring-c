package com.ioc.sp;

import java.util.Arrays;
import java.util.List;

/**
 * @author ccQi
 * @Package com.ioc.sp
 * @Description: TODO
 * @date
 */
public class UserDaoImpl implements UserDao{
    @Override
    public List<String> findAll() {
        System.out.println("正在从mysql中查询数据");
        return Arrays.asList("1", "2", "3");
    }
}
