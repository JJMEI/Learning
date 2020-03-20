package com.mjj.orm.mybatis.demo.dto;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table t_sku_sale_attribute_item
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class TSkuSaleAttributeItem extends BaseEntity {
    /**
     * Database Column Remarks:
     *   自增ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sku_sale_attribute_item.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * Database Column Remarks:
     *   sku id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sku_sale_attribute_item.sku_id
     *
     * @mbg.generated
     */
    private Long skuId;

    /**
     * Database Column Remarks:
     *   sku no
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sku_sale_attribute_item.sku_no
     *
     * @mbg.generated
     */
    private String skuNo;

    /**
     * Database Column Remarks:
     *   spu id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sku_sale_attribute_item.spu_id
     *
     * @mbg.generated
     */
    private Long spuId;

    /**
     * Database Column Remarks:
     *   属性ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sku_sale_attribute_item.attribute_id
     *
     * @mbg.generated
     */
    private Long attributeId;

    /**
     * Database Column Remarks:
     *   属性名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sku_sale_attribute_item.attribute_name
     *
     * @mbg.generated
     */
    private String attributeName;

    /**
     * Database Column Remarks:
     *   属性排序（不同于属性表排序）
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sku_sale_attribute_item.attribute_sort
     *
     * @mbg.generated
     */
    private Integer attributeSort;

    /**
     * Database Column Remarks:
     *   属性值ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sku_sale_attribute_item.attribute_item_id
     *
     * @mbg.generated
     */
    private Long attributeItemId;

    /**
     * Database Column Remarks:
     *   属性值名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sku_sale_attribute_item.attribute_item_name
     *
     * @mbg.generated
     */
    private String attributeItemName;

    /**
     * Database Column Remarks:
     *   属性值排序（不同于属性值表排序）
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sku_sale_attribute_item.attribute_item_sort
     *
     * @mbg.generated
     */
    private Integer attributeItemSort;

    /**
     * Database Column Remarks:
     *   业务线ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sku_sale_attribute_item.business_id
     *
     * @mbg.generated
     */
    private String businessId;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sku_sale_attribute_item.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     * Database Column Remarks:
     *   修改时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sku_sale_attribute_item.modify_time
     *
     * @mbg.generated
     */
    private Date modifyTime;

    /**
     * Database Column Remarks:
     *   创建人
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sku_sale_attribute_item.create_user
     *
     * @mbg.generated
     */
    private String createUser;

    /**
     * Database Column Remarks:
     *   修改人
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sku_sale_attribute_item.modify_user
     *
     * @mbg.generated
     */
    private String modifyUser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sku_sale_attribute_item.is_default
     *
     * @mbg.generated
     */
    private Byte isDefault;

    /**
     * Database Column Remarks:
     *   该条排序
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sku_sale_attribute_item.sort
     *
     * @mbg.generated
     */
    private Integer sort;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sku_sale_attribute_item.id
     *
     * @return the value of t_sku_sale_attribute_item.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sku_sale_attribute_item.id
     *
     * @param id the value for t_sku_sale_attribute_item.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sku_sale_attribute_item.sku_id
     *
     * @return the value of t_sku_sale_attribute_item.sku_id
     *
     * @mbg.generated
     */
    public Long getSkuId() {
        return skuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sku_sale_attribute_item.sku_id
     *
     * @param skuId the value for t_sku_sale_attribute_item.sku_id
     *
     * @mbg.generated
     */
    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sku_sale_attribute_item.sku_no
     *
     * @return the value of t_sku_sale_attribute_item.sku_no
     *
     * @mbg.generated
     */
    public String getSkuNo() {
        return skuNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sku_sale_attribute_item.sku_no
     *
     * @param skuNo the value for t_sku_sale_attribute_item.sku_no
     *
     * @mbg.generated
     */
    public void setSkuNo(String skuNo) {
        this.skuNo = skuNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sku_sale_attribute_item.spu_id
     *
     * @return the value of t_sku_sale_attribute_item.spu_id
     *
     * @mbg.generated
     */
    public Long getSpuId() {
        return spuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sku_sale_attribute_item.spu_id
     *
     * @param spuId the value for t_sku_sale_attribute_item.spu_id
     *
     * @mbg.generated
     */
    public void setSpuId(Long spuId) {
        this.spuId = spuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sku_sale_attribute_item.attribute_id
     *
     * @return the value of t_sku_sale_attribute_item.attribute_id
     *
     * @mbg.generated
     */
    public Long getAttributeId() {
        return attributeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sku_sale_attribute_item.attribute_id
     *
     * @param attributeId the value for t_sku_sale_attribute_item.attribute_id
     *
     * @mbg.generated
     */
    public void setAttributeId(Long attributeId) {
        this.attributeId = attributeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sku_sale_attribute_item.attribute_name
     *
     * @return the value of t_sku_sale_attribute_item.attribute_name
     *
     * @mbg.generated
     */
    public String getAttributeName() {
        return attributeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sku_sale_attribute_item.attribute_name
     *
     * @param attributeName the value for t_sku_sale_attribute_item.attribute_name
     *
     * @mbg.generated
     */
    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sku_sale_attribute_item.attribute_sort
     *
     * @return the value of t_sku_sale_attribute_item.attribute_sort
     *
     * @mbg.generated
     */
    public Integer getAttributeSort() {
        return attributeSort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sku_sale_attribute_item.attribute_sort
     *
     * @param attributeSort the value for t_sku_sale_attribute_item.attribute_sort
     *
     * @mbg.generated
     */
    public void setAttributeSort(Integer attributeSort) {
        this.attributeSort = attributeSort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sku_sale_attribute_item.attribute_item_id
     *
     * @return the value of t_sku_sale_attribute_item.attribute_item_id
     *
     * @mbg.generated
     */
    public Long getAttributeItemId() {
        return attributeItemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sku_sale_attribute_item.attribute_item_id
     *
     * @param attributeItemId the value for t_sku_sale_attribute_item.attribute_item_id
     *
     * @mbg.generated
     */
    public void setAttributeItemId(Long attributeItemId) {
        this.attributeItemId = attributeItemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sku_sale_attribute_item.attribute_item_name
     *
     * @return the value of t_sku_sale_attribute_item.attribute_item_name
     *
     * @mbg.generated
     */
    public String getAttributeItemName() {
        return attributeItemName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sku_sale_attribute_item.attribute_item_name
     *
     * @param attributeItemName the value for t_sku_sale_attribute_item.attribute_item_name
     *
     * @mbg.generated
     */
    public void setAttributeItemName(String attributeItemName) {
        this.attributeItemName = attributeItemName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sku_sale_attribute_item.attribute_item_sort
     *
     * @return the value of t_sku_sale_attribute_item.attribute_item_sort
     *
     * @mbg.generated
     */
    public Integer getAttributeItemSort() {
        return attributeItemSort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sku_sale_attribute_item.attribute_item_sort
     *
     * @param attributeItemSort the value for t_sku_sale_attribute_item.attribute_item_sort
     *
     * @mbg.generated
     */
    public void setAttributeItemSort(Integer attributeItemSort) {
        this.attributeItemSort = attributeItemSort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sku_sale_attribute_item.business_id
     *
     * @return the value of t_sku_sale_attribute_item.business_id
     *
     * @mbg.generated
     */
    public String getBusinessId() {
        return businessId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sku_sale_attribute_item.business_id
     *
     * @param businessId the value for t_sku_sale_attribute_item.business_id
     *
     * @mbg.generated
     */
    public void setBusinessId(String businessId) {
        this.businessId = businessId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sku_sale_attribute_item.create_time
     *
     * @return the value of t_sku_sale_attribute_item.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sku_sale_attribute_item.create_time
     *
     * @param createTime the value for t_sku_sale_attribute_item.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sku_sale_attribute_item.modify_time
     *
     * @return the value of t_sku_sale_attribute_item.modify_time
     *
     * @mbg.generated
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sku_sale_attribute_item.modify_time
     *
     * @param modifyTime the value for t_sku_sale_attribute_item.modify_time
     *
     * @mbg.generated
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sku_sale_attribute_item.create_user
     *
     * @return the value of t_sku_sale_attribute_item.create_user
     *
     * @mbg.generated
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sku_sale_attribute_item.create_user
     *
     * @param createUser the value for t_sku_sale_attribute_item.create_user
     *
     * @mbg.generated
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sku_sale_attribute_item.modify_user
     *
     * @return the value of t_sku_sale_attribute_item.modify_user
     *
     * @mbg.generated
     */
    public String getModifyUser() {
        return modifyUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sku_sale_attribute_item.modify_user
     *
     * @param modifyUser the value for t_sku_sale_attribute_item.modify_user
     *
     * @mbg.generated
     */
    public void setModifyUser(String modifyUser) {
        this.modifyUser = modifyUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sku_sale_attribute_item.is_default
     *
     * @return the value of t_sku_sale_attribute_item.is_default
     *
     * @mbg.generated
     */
    public Byte getIsDefault() {
        return isDefault;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sku_sale_attribute_item.is_default
     *
     * @param isDefault the value for t_sku_sale_attribute_item.is_default
     *
     * @mbg.generated
     */
    public void setIsDefault(Byte isDefault) {
        this.isDefault = isDefault;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sku_sale_attribute_item.sort
     *
     * @return the value of t_sku_sale_attribute_item.sort
     *
     * @mbg.generated
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sku_sale_attribute_item.sort
     *
     * @param sort the value for t_sku_sale_attribute_item.sort
     *
     * @mbg.generated
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }
}