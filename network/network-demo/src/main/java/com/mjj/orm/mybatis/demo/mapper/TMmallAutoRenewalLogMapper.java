package com.mjj.orm.mybatis.demo.mapper;

import com.mjj.orm.mybatis.demo.dto.TMmallAutoRenewalLog;

public interface TMmallAutoRenewalLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mmall_auto_renewal_log
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mmall_auto_renewal_log
     *
     * @mbg.generated
     */
    int insert(TMmallAutoRenewalLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mmall_auto_renewal_log
     *
     * @mbg.generated
     */
    int insertSelective(TMmallAutoRenewalLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mmall_auto_renewal_log
     *
     * @mbg.generated
     */
    TMmallAutoRenewalLog selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mmall_auto_renewal_log
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TMmallAutoRenewalLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mmall_auto_renewal_log
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TMmallAutoRenewalLog record);
}