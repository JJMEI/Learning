package com.mjj.orm.mybatis.demo.mapper;

import com.mjj.orm.mybatis.demo.dto.TMmallOrderTrace;

public interface TMmallOrderTraceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mmall_order_trace
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mmall_order_trace
     *
     * @mbg.generated
     */
    int insert(TMmallOrderTrace record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mmall_order_trace
     *
     * @mbg.generated
     */
    int insertSelective(TMmallOrderTrace record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mmall_order_trace
     *
     * @mbg.generated
     */
    TMmallOrderTrace selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mmall_order_trace
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TMmallOrderTrace record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mmall_order_trace
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(TMmallOrderTrace record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mmall_order_trace
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TMmallOrderTrace record);
}