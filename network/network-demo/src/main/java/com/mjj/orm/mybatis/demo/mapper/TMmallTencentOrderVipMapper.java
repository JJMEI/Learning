package com.mjj.orm.mybatis.demo.mapper;

import com.mjj.orm.mybatis.demo.dto.TMmallTencentOrderVip;

public interface TMmallTencentOrderVipMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mmall_tencent_order_vip
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mmall_tencent_order_vip
     *
     * @mbg.generated
     */
    int insert(TMmallTencentOrderVip record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mmall_tencent_order_vip
     *
     * @mbg.generated
     */
    int insertSelective(TMmallTencentOrderVip record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mmall_tencent_order_vip
     *
     * @mbg.generated
     */
    TMmallTencentOrderVip selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mmall_tencent_order_vip
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TMmallTencentOrderVip record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mmall_tencent_order_vip
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TMmallTencentOrderVip record);
}