package com.cloud.democonsumer.service;


import com.cloud.democonsumer.service.hystric.SchedualServiceDemoHystric;


import com.cloud.demoprovider.entity.Role;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value="demo-provider",fallback = SchedualServiceDemoHystric.class)
public interface SchedualServiceDemo {

    @RequestMapping(value="/hi",method = RequestMethod.GET)
    List<Role> sayHiFromClientOne(@RequestParam(value="name") String name);
}
