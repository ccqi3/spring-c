package com.ioc.spr;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author ccQi
 * @Package com.spring.ioc.normal
 * @Description: TODO
 * @date
 */
@Component
@Data
public class User {

    @Value("1")
    private Integer id;

    @Value("张三")
    private String name;

    @Value("12")
    private Integer age;
}

