package com.cloud.demoprovider.common.dao;

/**
 * dao接口泛型，用于生成dao接口
 * @param <T>
 * @param <Texample>
 */
public interface IDao<T, Texample> extends IBaseDao<T, Texample>{

    int insert(T record);

    int insertSelective(T record);

    T selectByPrimaryKey(Long id);

    int updateByExampleSelective(T record, Texample example);

    int updateByPrimaryKeySelective(T record);

}
