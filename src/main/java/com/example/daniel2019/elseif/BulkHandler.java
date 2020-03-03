package com.example.daniel2019.elseif;

import org.springframework.stereotype.Component;

/**
 * @Author: DanielYu
 * @Date: 2019/5/27 11:14
 */
@Component
@HandlerType("2")
public class BulkHandler extends AbstractHandler {
    @Override
    public String handle(OrderDTO dto) {
        return "处理团购订单";
    }
}
