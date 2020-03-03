package com.example.daniel2019.elseif;

import java.lang.annotation.*;

/**
 * @Author: DanielYu
 * @Date: 2019/5/27 10:38
 * 自定义注解
 */

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface HandlerType {
    String value();
}
