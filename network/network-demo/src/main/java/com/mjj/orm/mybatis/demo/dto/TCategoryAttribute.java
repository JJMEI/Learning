package com.mjj.orm.mybatis.demo.dto;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table t_category_attribute
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class TCategoryAttribute extends BaseEntity {
    /**
     * Database Column Remarks:
     *   自增id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_category_attribute.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * Database Column Remarks:
     *   品类ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_category_attribute.category_id
     *
     * @mbg.generated
     */
    private Long categoryId;

    /**
     * Database Column Remarks:
     *   属性id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_category_attribute.attribute_id
     *
     * @mbg.generated
     */
    private Long attributeId;

    /**
     * Database Column Remarks:
     *   用途(1:展示2:销售)
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_category_attribute.attribute_use_scope
     *
     * @mbg.generated
     */
    private Byte attributeUseScope;

    /**
     * Database Column Remarks:
     *   功能类型（1单选2多选3短文本）
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_category_attribute.function_type
     *
     * @mbg.generated
     */
    private Byte functionType;

    /**
     * Database Column Remarks:
     *   排序值
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_category_attribute.sort
     *
     * @mbg.generated
     */
    private Integer sort;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_category_attribute.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     * Database Column Remarks:
     *   修改时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_category_attribute.modify_time
     *
     * @mbg.generated
     */
    private Date modifyTime;

    /**
     * Database Column Remarks:
     *   创建人
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_category_attribute.create_user
     *
     * @mbg.generated
     */
    private String createUser;

    /**
     * Database Column Remarks:
     *   修改人
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_category_attribute.modify_user
     *
     * @mbg.generated
     */
    private String modifyUser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_category_attribute.business_id
     *
     * @mbg.generated
     */
    private String businessId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_category_attribute.id
     *
     * @return the value of t_category_attribute.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_category_attribute.id
     *
     * @param id the value for t_category_attribute.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_category_attribute.category_id
     *
     * @return the value of t_category_attribute.category_id
     *
     * @mbg.generated
     */
    public Long getCategoryId() {
        return categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_category_attribute.category_id
     *
     * @param categoryId the value for t_category_attribute.category_id
     *
     * @mbg.generated
     */
    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_category_attribute.attribute_id
     *
     * @return the value of t_category_attribute.attribute_id
     *
     * @mbg.generated
     */
    public Long getAttributeId() {
        return attributeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_category_attribute.attribute_id
     *
     * @param attributeId the value for t_category_attribute.attribute_id
     *
     * @mbg.generated
     */
    public void setAttributeId(Long attributeId) {
        this.attributeId = attributeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_category_attribute.attribute_use_scope
     *
     * @return the value of t_category_attribute.attribute_use_scope
     *
     * @mbg.generated
     */
    public Byte getAttributeUseScope() {
        return attributeUseScope;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_category_attribute.attribute_use_scope
     *
     * @param attributeUseScope the value for t_category_attribute.attribute_use_scope
     *
     * @mbg.generated
     */
    public void setAttributeUseScope(Byte attributeUseScope) {
        this.attributeUseScope = attributeUseScope;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_category_attribute.function_type
     *
     * @return the value of t_category_attribute.function_type
     *
     * @mbg.generated
     */
    public Byte getFunctionType() {
        return functionType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_category_attribute.function_type
     *
     * @param functionType the value for t_category_attribute.function_type
     *
     * @mbg.generated
     */
    public void setFunctionType(Byte functionType) {
        this.functionType = functionType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_category_attribute.sort
     *
     * @return the value of t_category_attribute.sort
     *
     * @mbg.generated
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_category_attribute.sort
     *
     * @param sort the value for t_category_attribute.sort
     *
     * @mbg.generated
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_category_attribute.create_time
     *
     * @return the value of t_category_attribute.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_category_attribute.create_time
     *
     * @param createTime the value for t_category_attribute.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_category_attribute.modify_time
     *
     * @return the value of t_category_attribute.modify_time
     *
     * @mbg.generated
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_category_attribute.modify_time
     *
     * @param modifyTime the value for t_category_attribute.modify_time
     *
     * @mbg.generated
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_category_attribute.create_user
     *
     * @return the value of t_category_attribute.create_user
     *
     * @mbg.generated
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_category_attribute.create_user
     *
     * @param createUser the value for t_category_attribute.create_user
     *
     * @mbg.generated
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_category_attribute.modify_user
     *
     * @return the value of t_category_attribute.modify_user
     *
     * @mbg.generated
     */
    public String getModifyUser() {
        return modifyUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_category_attribute.modify_user
     *
     * @param modifyUser the value for t_category_attribute.modify_user
     *
     * @mbg.generated
     */
    public void setModifyUser(String modifyUser) {
        this.modifyUser = modifyUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_category_attribute.business_id
     *
     * @return the value of t_category_attribute.business_id
     *
     * @mbg.generated
     */
    public String getBusinessId() {
        return businessId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_category_attribute.business_id
     *
     * @param businessId the value for t_category_attribute.business_id
     *
     * @mbg.generated
     */
    public void setBusinessId(String businessId) {
        this.businessId = businessId;
    }
}