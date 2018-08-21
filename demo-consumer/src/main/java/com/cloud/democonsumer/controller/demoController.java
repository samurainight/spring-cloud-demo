package com.cloud.democonsumer.controller;


import com.cloud.democonsumer.common.ApiReponse;
import com.cloud.democonsumer.service.SchedualServiceDemo;
import com.demo.democommon.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class demoController {

    @Value("${server.port}")
    String port;

    @Autowired
    SchedualServiceDemo schedualServiceDemo;

    @GetMapping(value = "/hi")
    public ApiReponse sayHi(@RequestParam String name) {
        List<Role> list= schedualServiceDemo.sayHiFromClientOne(name);
        ApiReponse apiRepons=new ApiReponse();
        apiRepons.setData(list);
        return apiRepons;
    }

    @GetMapping(value = "/chello")
    public String sayHello(@RequestParam String name) {

        return "hello " + name + " ,i am from port:" + port;
    }
}
