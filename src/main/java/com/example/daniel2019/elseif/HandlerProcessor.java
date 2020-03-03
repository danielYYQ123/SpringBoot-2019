package com.example.daniel2019.elseif;

import com.google.common.collect.Maps;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @Author: DanielYu
 * @Date: 2019/5/27 10:40
 */
@Component
@SuppressWarnings("unchecked")
public class HandlerProcessor implements BeanFactoryPostProcessor {

    private static final String HANDLER_PACKAGE = "com.example.daniel2019.elseif";

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        Map<String, Class> handelrMap = Maps.newHashMapWithExpectedSize(3);
        ClassScaner.scan(HANDLER_PACKAGE, HandlerType.class).forEach(clazz -> {
            String type = clazz.getAnnotation(HandlerType.class).value();
            handelrMap.put(type, clazz);
        });
        HandlerContext context = new HandlerContext(handelrMap);
        beanFactory.registerSingleton(HandlerContext.class.getName(), context);
    }
}
