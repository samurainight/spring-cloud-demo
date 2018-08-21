package com.cloud.democonsumer.common.dao;

import com.cloud.democonsumer.common.mapper.IMapperBLOB;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AbsDaoBLOBImpl<T, Texample> implements IDaoBLOB<T, Texample> {
    @Autowired
    public IMapperBLOB<T, Texample> mapper;


    @Override
    public List<T> selectByExampleWithBLOBs(Texample example) {
        return mapper.selectByExampleWithBLOBs(example);
    }

    @Override
    public int updateByExampleWithBLOBs(T record, Texample example) {
        return mapper.updateByExampleWithBLOBs(record, example);
    }

    @Override
    public int updateByPrimaryKeyWithBLOBs(T record) {
        return mapper.updateByPrimaryKeyWithBLOBs(record);
    }

    @Override
    public long countByExample(Texample example) {
        return mapper.countByExample(example);
    }

    @Override
    public int deleteByExample(Texample example) {
        return mapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(T record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(T record) {
        return mapper.insertSelective(record);
    }

    @Override
    public List<T> selectByExample(Texample example) {
        return mapper.selectByExample(example);
    }

    @Override
    public T selectByPrimaryKey(Long id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(T record, Texample example) {
        return mapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(T record, Texample example) {
        return mapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(T record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(T record) {
        return mapper.updateByPrimaryKey(record);
    }
}
