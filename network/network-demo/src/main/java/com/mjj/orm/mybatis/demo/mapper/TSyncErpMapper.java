package com.mjj.orm.mybatis.demo.mapper;

import com.mjj.orm.mybatis.demo.dto.TSyncErp;

public interface TSyncErpMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sync_erp
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sync_erp
     *
     * @mbg.generated
     */
    int insert(TSyncErp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sync_erp
     *
     * @mbg.generated
     */
    int insertSelective(TSyncErp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sync_erp
     *
     * @mbg.generated
     */
    TSyncErp selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sync_erp
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TSyncErp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sync_erp
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TSyncErp record);
}