package com.mjj.orm.mybatis.demo.mapper;

import com.mjj.orm.mybatis.demo.dto.TAttribute;

public interface TAttributeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_attribute
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_attribute
     *
     * @mbg.generated
     */
    int insert(TAttribute record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_attribute
     *
     * @mbg.generated
     */
    int insertSelective(TAttribute record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_attribute
     *
     * @mbg.generated
     */
    TAttribute selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_attribute
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TAttribute record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_attribute
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TAttribute record);
}