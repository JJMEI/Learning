package com.mjj.orm.mybatis.demo.mapper;

import com.mjj.orm.mybatis.demo.dto.TMmallTencentOrder;

public interface TMmallTencentOrderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mmall_tencent_order
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mmall_tencent_order
     *
     * @mbg.generated
     */
    int insert(TMmallTencentOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mmall_tencent_order
     *
     * @mbg.generated
     */
    int insertSelective(TMmallTencentOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mmall_tencent_order
     *
     * @mbg.generated
     */
    TMmallTencentOrder selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mmall_tencent_order
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TMmallTencentOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mmall_tencent_order
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TMmallTencentOrder record);
}