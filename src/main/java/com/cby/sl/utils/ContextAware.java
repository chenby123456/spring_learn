package com.cby.sl.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * 实现了ApplicationContextAware接口的类会在项目的bean注入完成之后调用setApplicationContext方法注入ApplicationContext
 * 从而能够更加优雅的获取到项目注入的所有的bean
 */

@Component
public class ContextAware implements ApplicationContextAware {
    private static ApplicationContext context;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }

    public static <T> T getObject(Class<T> clazz){
        return context.getBean(clazz);
    }
}
