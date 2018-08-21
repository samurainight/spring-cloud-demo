package com.cloud.democonsumer.common.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IBaseMapper<T, Texample> {

    long countByExample(Texample example);

    int deleteByExample(Texample example);

    int deleteByPrimaryKey(Long id);

    List<T> selectByExample(Texample example);

    int updateByExample(@Param("record") T record, @Param("example") Texample example);

    int updateByPrimaryKey(T record);
}
