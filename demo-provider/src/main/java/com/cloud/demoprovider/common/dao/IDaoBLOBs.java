package com.cloud.demoprovider.common.dao;

import java.util.List;

public interface IDaoBLOBs<T, Texample, TWithBLOBs> extends IBaseDao<T, Texample>{

    int insert(TWithBLOBs record); //

    int insertSelective(TWithBLOBs record); //

    List<TWithBLOBs> selectByExampleWithBLOBs(Texample example);

    TWithBLOBs selectByPrimaryKey(Long id);

    int updateByExampleSelective(TWithBLOBs record, Texample example);

    int updateByExampleWithBLOBs(TWithBLOBs record, Texample example);

    int updateByPrimaryKeySelective(TWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TWithBLOBs record);
}
