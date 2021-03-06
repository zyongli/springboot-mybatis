package com.lzy.mybatis.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Controller {
    @Autowired
    private MybatisService service;
    @RequestMapping
    public String getName(){
        return service.getName();
    }
}
