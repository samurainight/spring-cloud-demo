package com.cloud.demoprovider.common.mapper;

import org.apache.ibatis.annotations.Param;

/**
 * mybatis mapper 泛型接口，所提供的方法跟mybatis自动生成的xml可以对应。
 * 使用：先用mybatis generator生成entity和sql xml，然后根据entity写一个interface
 * 扩展本interface
 * @param <T>: enti@param <Texample>: entity example
 */
public interface IMapper<T, Texample> extends IBaseMapper<T, Texample>{

    int insert(T record);

    int insertSelective(T record);

    T selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") T record, @Param("example") Texample example);

    int updateByPrimaryKeySelective(T record);
}
