package com.mjj.orm.mybatis.demo.mapper;

import com.mjj.orm.mybatis.demo.dto.TMmallTemplate;

public interface TMmallTemplateMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mmall_template
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mmall_template
     *
     * @mbg.generated
     */
    int insert(TMmallTemplate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mmall_template
     *
     * @mbg.generated
     */
    int insertSelective(TMmallTemplate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mmall_template
     *
     * @mbg.generated
     */
    TMmallTemplate selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mmall_template
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TMmallTemplate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mmall_template
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(TMmallTemplate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mmall_template
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TMmallTemplate record);
}