package com.example.daniel2019.test;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: DanielYu
 * @Date: 2020/2/10 15:21
 */

@RestController
public class TestController {

    @GetMapping("/test/returnJson/")
    public JSONObject returnJson(){
        String strJson = "{\n" +
                "\t\"message\": \"The content does not exist\",\n" +
                "\t\"data\": null,\n" +
                "\t\"result\": [{\n" +
                "\t\t\t\"id\": 1,\n" +
                "\t\t\t\"name\": \"zhutou\",\n" +
                "\t\t\t\"age\": 28,\n" +
                "\t\t\t\"sex\": \"boy\",\n" +
                "\t\t\t\"role\": \"TOP\"\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"id\": 1,\n" +
                "\t\t\t\"name\": \"danniu\",\n" +
                "\t\t\t\"age\": 19,\n" +
                "\t\t\t\"sex\": \"boy\",\n" +
                "\t\t\t\"role\": \"BOTTOM\"\n" +
                "\t\t}\n" +
                "\t]\n" +
                "}";

        JSONObject object = null;
        try{
            object = new ObjectMapper().readValue(strJson, JSONObject.class);
        }catch (Exception e){
            e.printStackTrace();
        }
        return object;
    }

}
