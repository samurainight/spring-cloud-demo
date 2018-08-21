package com.cloud.demoprovider.dao.mapper;

import com.cloud.demoprovider.common.mapper.IMapper;
import com.demo.democommon.entity.Role;
import com.demo.democommon.entity.RoleExample;
import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface RoleMapper extends IMapper<Role,RoleExample> {

}