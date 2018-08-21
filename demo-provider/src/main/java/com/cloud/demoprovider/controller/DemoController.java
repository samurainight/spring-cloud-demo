package com.cloud.demoprovider.controller;

import com.cloud.demoprovider.common.ApiReponse;
import com.cloud.demoprovider.entity.Role;
import com.cloud.demoprovider.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DemoController {


    @Value("${server.port}")
    String port;

    @Autowired
    private RoleService roleService;

    @GetMapping("/hi")
    public ApiReponse home(@RequestParam(value = "name", defaultValue = "forezp") String name) {
        ApiReponse apiReponse=new ApiReponse();
        List<Role> list=roleService.fetchRoleList();
        apiReponse.setData(list);
        return apiReponse;
    }
}
