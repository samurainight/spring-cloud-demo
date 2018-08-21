package com.cloud.demoprovider.dao.impl;

import com.cloud.demoprovider.common.dao.AbsDaoImpl;
import com.cloud.demoprovider.dao.RoleDao;
import com.cloud.demoprovider.entity.Role;
import com.cloud.demoprovider.entity.RoleExample;
import org.springframework.stereotype.Service;

@Service
public class RoleDaoImpl extends AbsDaoImpl<Role,RoleExample> implements RoleDao {

}
