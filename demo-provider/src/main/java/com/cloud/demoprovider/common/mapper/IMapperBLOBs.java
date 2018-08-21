package com.cloud.demoprovider.common.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 有多个text字段
 * @param <T>
 * @param <Texample>
 * @param <TWithBLOBs>
 */
public interface IMapperBLOBs<T, Texample, TWithBLOBs> extends IBaseMapper<T, Texample> {
    int insert(TWithBLOBs record); //

    int insertSelective(TWithBLOBs record); //

    List<TWithBLOBs> selectByExampleWithBLOBs(Texample example);

    TWithBLOBs selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TWithBLOBs record, @Param("example") Texample example);

    int updateByExampleWithBLOBs(@Param("record") TWithBLOBs record, @Param("example") Texample example);

    int updateByPrimaryKeySelective(TWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TWithBLOBs record);
}
