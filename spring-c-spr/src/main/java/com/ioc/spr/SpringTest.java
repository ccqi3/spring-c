package com.ioc.spr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author ccQi
 * @Package com.ioc.spr
 * @Description: TODO
 * @date
 */
public class SpringTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.ioc.spr");
        User bean = (User) applicationContext.getBean("user");
        System.out.println(bean);
        //查看spring容器内所有的bean
        System.out.println("===================================");
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
            System.out.println(applicationContext.getBean(beanDefinitionName));
        }
    }
}
