package com.example.daniel2019.elseif;


import java.util.Map;

/**
 * @Author: DanielYu
 * @Date: 2019/5/27 9:53
 */
public class HandlerContext {

    private Map<String, Class> handlerMap;

    public HandlerContext(Map<String, Class> handlerMap){
        this.handlerMap = handlerMap;
    }

    public AbstractHandler getInstance(String type){
        Class clazz = handlerMap.get(type);
        if (clazz == null){
            throw new IllegalArgumentException("没有找到对应处理的类型为:" + type +"的订单类型!");
        }
        return (AbstractHandler) BeanTool.getBean(clazz);
    }

}
