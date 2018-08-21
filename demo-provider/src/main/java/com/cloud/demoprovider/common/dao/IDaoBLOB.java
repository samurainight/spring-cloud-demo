package com.cloud.demoprovider.common.dao;

import java.util.List;

public interface IDaoBLOB<T, Texample> extends IDao<T, Texample>{

    List<T> selectByExampleWithBLOBs(Texample example);

    int updateByExampleWithBLOBs(T record, Texample example);

    int updateByPrimaryKeyWithBLOBs(T record);
}
