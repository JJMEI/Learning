package com.mjj.orm.mybatis.demo.mapper;

import com.mjj.orm.mybatis.demo.dto.TSpu;

public interface TSpuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_spu
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_spu
     *
     * @mbg.generated
     */
    int insert(TSpu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_spu
     *
     * @mbg.generated
     */
    int insertSelective(TSpu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_spu
     *
     * @mbg.generated
     */
    TSpu selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_spu
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TSpu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_spu
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(TSpu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_spu
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TSpu record);
}