package com.khadri.spring.core;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Bean1 implements ApplicationContextAware , BeanNameAware {
    private String name;

    private Bean2 bean2;

    private ApplicationContext context;

    public Bean2 getBean2() {
        return this.context.getBean("bean2",Bean2.class);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }

    @Override
    public void setBeanName(String name) {
     this.name = name;
    }
}
