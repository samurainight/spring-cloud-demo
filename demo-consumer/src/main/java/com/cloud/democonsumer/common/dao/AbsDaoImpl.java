package com.cloud.democonsumer.common.dao;

import com.cloud.democonsumer.common.mapper.IMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * dao接口的虚拟实现类，用于提供一些通用的方法。
 * @param <T>
 * @param <Texample>
 */
public abstract class AbsDaoImpl<T, Texample> implements IDao<T, Texample> {

    @Autowired
    public IMapper<T, Texample> mapper;

    @Override
    public long countByExample(Texample example){
        return mapper.countByExample(example);
    }

    @Override
    public int deleteByExample(Texample example){
        return mapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return mapper.deleteByPrimaryKey(id);
    }

    public int insert(T record){
        return mapper.insert(record);
    }

    public int insertSelective(T record){
        return mapper.insertSelective(record);
    }

    public List<T> selectByExample(Texample example){
        return mapper.selectByExample(example);
    }

    public T selectByPrimaryKey(Long id){
        return mapper.selectByPrimaryKey(id);
    }

    public int updateByExampleSelective(T record, Texample example){
        return mapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(T record, Texample example){
        return mapper.updateByExample(record, example);
    }

    public int updateByPrimaryKeySelective(T record){
        return mapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(T record){
        return mapper.updateByPrimaryKey(record);
    }
}
