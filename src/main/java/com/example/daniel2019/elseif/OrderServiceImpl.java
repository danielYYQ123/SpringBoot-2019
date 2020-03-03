package com.example.daniel2019.elseif;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: DanielYu
 * @Date: 2019/5/27 9:48
 */
@Service
public class OrderServiceImpl implements IOrderService {

    @Autowired
    private HandlerContext handlerContext;

    @Override
    public String handle(OrderDTO dto) {
        AbstractHandler handler = handlerContext.getInstance(dto.getType());
        return handler.handle(dto);
    }
}
