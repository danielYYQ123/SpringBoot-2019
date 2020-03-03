package com.example.daniel2019.elseif;

import org.springframework.stereotype.Component;

/**
 * @Author: DanielYu
 * @Date: 2019/5/27 11:10
 */
@Component
@HandlerType("1")
public class NormalHandler extends AbstractHandler {

    @Override
    public String handle(OrderDTO dto) {
        return "处理普通订单";
    }
}
