package com.cloud.democonsumer.service.hystric;

import com.cloud.democonsumer.service.SchedualServiceDemo;

import com.demo.democommon.entity.Role;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SchedualServiceDemoHystric implements SchedualServiceDemo {

    @Override
    public List<Role> sayHiFromClientOne(String name) {
        return null;
    }
}
