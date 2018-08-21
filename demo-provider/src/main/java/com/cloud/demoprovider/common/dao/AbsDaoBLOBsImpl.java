package com.cloud.demoprovider.common.dao;

import com.cloud.demoprovider.common.mapper.IMapperBLOBs;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public abstract class AbsDaoBLOBsImpl<T, Texample, TWithBLOBs> implements IDaoBLOBs<T, Texample, TWithBLOBs> {

    @Autowired
    public IMapperBLOBs<T, Texample, TWithBLOBs> mapper;

    @Override
    public long countByExample(Texample example){
        return mapper.countByExample(example);
    }

    @Override
    public int deleteByExample(Texample example){
        return mapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long id){
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TWithBLOBs record){
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(TWithBLOBs record){
        return mapper.insertSelective(record);
    }

    @Override
    public List<TWithBLOBs> selectByExampleWithBLOBs(Texample example){
        return mapper.selectByExampleWithBLOBs(example);
    }

    @Override
    public List<T> selectByExample(Texample example){
        return mapper.selectByExample(example);
    }

    @Override
    public TWithBLOBs selectByPrimaryKey(Long id){
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective( TWithBLOBs record,  Texample example){
        return mapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExampleWithBLOBs( TWithBLOBs record,  Texample example){
        return mapper.updateByExampleWithBLOBs(record, example);
    }

    @Override
    public int updateByExample( T record,  Texample example){
        return mapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(TWithBLOBs record){
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKeyWithBLOBs(TWithBLOBs record){
        return mapper.updateByPrimaryKeyWithBLOBs(record);
    }

    @Override
    public int updateByPrimaryKey(T record){
        return mapper.updateByPrimaryKey(record);
    }
}
