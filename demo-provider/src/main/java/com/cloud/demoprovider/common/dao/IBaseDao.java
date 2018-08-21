package com.cloud.demoprovider.common.dao;

import java.util.List;

public interface IBaseDao<T, Texample> {
    long countByExample(Texample example);

    int deleteByExample(Texample example);

    int deleteByPrimaryKey(Long id);

    List<T> selectByExample(Texample example);

    int updateByExample(T record, Texample example);

    int updateByPrimaryKey(T record);
}
