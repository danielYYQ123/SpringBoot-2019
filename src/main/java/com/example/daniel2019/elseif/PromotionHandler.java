package com.example.daniel2019.elseif;

import org.springframework.stereotype.Component;

/**
 * @Author: DanielYu
 * @Date: 2019/5/27 11:16
 */
@Component
@HandlerType("3")
public class PromotionHandler extends AbstractHandler {
    @Override
    public String handle(OrderDTO dto) {
        return "处理促销订单";
    }
}
