package com.khadri.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Bean1 bean1 = context.getBean("bean1", Bean1.class);
        System.out.println(bean1.getName());
        System.out.println(bean1.getBean2());

    }
}