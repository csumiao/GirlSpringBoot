package com.miao.girl.controller;


import com.miao.girl.properties.GirlPropertities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@ResponseBody等同于
@RestController
public class HelloController {

    @Autowired
    private GirlPropertities girlPropertities;

    @RequestMapping(value = {"/hello", "hi"}, method = RequestMethod.GET)
    public String girl() {
//        return "index"; 不推荐使用模板（前后端分离）
        return girlPropertities.getCupSize();
    }

}
