package com.cloud.demoprovider.service.impl;

import com.cloud.demoprovider.dao.RoleDao;
import com.cloud.demoprovider.entity.Role;
import com.cloud.demoprovider.entity.RoleExample;
import com.cloud.demoprovider.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    RoleDao roleDao;

    @Override
    public List<Role> fetchRoleList() {
        RoleExample roleExample=new RoleExample();
        roleExample.createCriteria().andStatusEqualTo(0).andSubsystemIdEqualTo(3L);
        roleExample.setOrderByClause("id desc");
        List<Role> list=roleDao.selectByExample(roleExample);
        return list;
    }
}
