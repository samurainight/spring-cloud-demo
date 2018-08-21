package com.cloud.demoprovider.dao.impl;

import com.cloud.demoprovider.common.dao.AbsDaoImpl;
import com.cloud.demoprovider.dao.RoleDao;
import com.demo.democommon.entity.Role;
import com.demo.democommon.entity.RoleExample;
import org.springframework.stereotype.Service;

@Service
public class RoleDaoImpl extends AbsDaoImpl<Role,RoleExample> implements RoleDao {

}
