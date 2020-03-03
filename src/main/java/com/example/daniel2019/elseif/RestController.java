package com.example.daniel2019.elseif;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author: DanielYu
 * @Date: 2019/5/27 11:45
 */
@org.springframework.web.bind.annotation.RestController
@RequestMapping("/elseif")
public class RestController {

    @Autowired
    private IOrderService service;


    @RequestMapping(value="/order", method = RequestMethod.POST, produces = "application/json")
    public void order(@RequestBody OrderDTO dto){
        try{
            System.out.println(new ObjectMapper().writeValueAsString(dto));
        } catch (Exception e){
            e.printStackTrace();
        }
        String ret = service.handle(dto);
        System.out.println(ret);
    }

}
