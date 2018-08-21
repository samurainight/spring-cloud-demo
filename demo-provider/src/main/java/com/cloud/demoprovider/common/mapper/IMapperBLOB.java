package com.cloud.demoprovider.common.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 只有一个text字段
 * @param <T>
 * @param <Texample>
 */
public interface IMapperBLOB<T, Texample> extends IMapper<T, Texample>{

    List<T> selectByExampleWithBLOBs(Texample example);

    int updateByExampleWithBLOBs(@Param("record") T record, @Param("example") Texample example);

    int updateByPrimaryKeyWithBLOBs(T record);
}
