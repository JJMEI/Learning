package com.mjj.orm.mybatis.demo.dto;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table t_category_attribute_item
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class TCategoryAttributeItem extends BaseEntity {
    /**
     * Database Column Remarks:
     *   自增id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_category_attribute_item.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * Database Column Remarks:
     *   品类ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_category_attribute_item.category_id
     *
     * @mbg.generated
     */
    private Long categoryId;

    /**
     * Database Column Remarks:
     *   属性id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_category_attribute_item.attribute_id
     *
     * @mbg.generated
     */
    private Long attributeId;

    /**
     * Database Column Remarks:
     *   属性值id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_category_attribute_item.attribute_item_id
     *
     * @mbg.generated
     */
    private Long attributeItemId;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_category_attribute_item.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     * Database Column Remarks:
     *   修改时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_category_attribute_item.modify_time
     *
     * @mbg.generated
     */
    private Date modifyTime;

    /**
     * Database Column Remarks:
     *   创建人
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_category_attribute_item.create_user
     *
     * @mbg.generated
     */
    private String createUser;

    /**
     * Database Column Remarks:
     *   修改人
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_category_attribute_item.modify_user
     *
     * @mbg.generated
     */
    private String modifyUser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_category_attribute_item.business_id
     *
     * @mbg.generated
     */
    private String businessId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_category_attribute_item.id
     *
     * @return the value of t_category_attribute_item.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_category_attribute_item.id
     *
     * @param id the value for t_category_attribute_item.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_category_attribute_item.category_id
     *
     * @return the value of t_category_attribute_item.category_id
     *
     * @mbg.generated
     */
    public Long getCategoryId() {
        return categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_category_attribute_item.category_id
     *
     * @param categoryId the value for t_category_attribute_item.category_id
     *
     * @mbg.generated
     */
    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_category_attribute_item.attribute_id
     *
     * @return the value of t_category_attribute_item.attribute_id
     *
     * @mbg.generated
     */
    public Long getAttributeId() {
        return attributeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_category_attribute_item.attribute_id
     *
     * @param attributeId the value for t_category_attribute_item.attribute_id
     *
     * @mbg.generated
     */
    public void setAttributeId(Long attributeId) {
        this.attributeId = attributeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_category_attribute_item.attribute_item_id
     *
     * @return the value of t_category_attribute_item.attribute_item_id
     *
     * @mbg.generated
     */
    public Long getAttributeItemId() {
        return attributeItemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_category_attribute_item.attribute_item_id
     *
     * @param attributeItemId the value for t_category_attribute_item.attribute_item_id
     *
     * @mbg.generated
     */
    public void setAttributeItemId(Long attributeItemId) {
        this.attributeItemId = attributeItemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_category_attribute_item.create_time
     *
     * @return the value of t_category_attribute_item.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_category_attribute_item.create_time
     *
     * @param createTime the value for t_category_attribute_item.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_category_attribute_item.modify_time
     *
     * @return the value of t_category_attribute_item.modify_time
     *
     * @mbg.generated
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_category_attribute_item.modify_time
     *
     * @param modifyTime the value for t_category_attribute_item.modify_time
     *
     * @mbg.generated
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_category_attribute_item.create_user
     *
     * @return the value of t_category_attribute_item.create_user
     *
     * @mbg.generated
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_category_attribute_item.create_user
     *
     * @param createUser the value for t_category_attribute_item.create_user
     *
     * @mbg.generated
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_category_attribute_item.modify_user
     *
     * @return the value of t_category_attribute_item.modify_user
     *
     * @mbg.generated
     */
    public String getModifyUser() {
        return modifyUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_category_attribute_item.modify_user
     *
     * @param modifyUser the value for t_category_attribute_item.modify_user
     *
     * @mbg.generated
     */
    public void setModifyUser(String modifyUser) {
        this.modifyUser = modifyUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_category_attribute_item.business_id
     *
     * @return the value of t_category_attribute_item.business_id
     *
     * @mbg.generated
     */
    public String getBusinessId() {
        return businessId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_category_attribute_item.business_id
     *
     * @param businessId the value for t_category_attribute_item.business_id
     *
     * @mbg.generated
     */
    public void setBusinessId(String businessId) {
        this.businessId = businessId;
    }
}