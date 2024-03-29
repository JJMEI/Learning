package com.mjj.orm.mybatis.demo.dto;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table t_mmall_auto_renewal_log
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class TMmallAutoRenewalLog extends BaseEntity {
    /**
     * Database Column Remarks:
     *   自增主键
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mmall_auto_renewal_log.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * Database Column Remarks:
     *   用户Id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mmall_auto_renewal_log.user_id
     *
     * @mbg.generated
     */
    private Long userId;

    /**
     * Database Column Remarks:
     *   订单号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mmall_auto_renewal_log.order_no
     *
     * @mbg.generated
     */
    private String orderNo;

    /**
     * Database Column Remarks:
     *   会员Id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mmall_auto_renewal_log.sku_no
     *
     * @mbg.generated
     */
    private String skuNo;

    /**
     * Database Column Remarks:
     *   会员产品类型
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mmall_auto_renewal_log.vip_type
     *
     * @mbg.generated
     */
    private Integer vipType;

    /**
     * Database Column Remarks:
     *   日志状态：1:发起自动续费 2:支付成功 3:支付失败
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mmall_auto_renewal_log.status
     *
     * @mbg.generated
     */
    private Byte status;

    /**
     * Database Column Remarks:
     *   日志创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mmall_auto_renewal_log.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     * Database Column Remarks:
     *   日志修改时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mmall_auto_renewal_log.modify_time
     *
     * @mbg.generated
     */
    private Date modifyTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mmall_auto_renewal_log.bind_Id
     *
     * @mbg.generated
     */
    private String bindId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mmall_auto_renewal_log.id
     *
     * @return the value of t_mmall_auto_renewal_log.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mmall_auto_renewal_log.id
     *
     * @param id the value for t_mmall_auto_renewal_log.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mmall_auto_renewal_log.user_id
     *
     * @return the value of t_mmall_auto_renewal_log.user_id
     *
     * @mbg.generated
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mmall_auto_renewal_log.user_id
     *
     * @param userId the value for t_mmall_auto_renewal_log.user_id
     *
     * @mbg.generated
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mmall_auto_renewal_log.order_no
     *
     * @return the value of t_mmall_auto_renewal_log.order_no
     *
     * @mbg.generated
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mmall_auto_renewal_log.order_no
     *
     * @param orderNo the value for t_mmall_auto_renewal_log.order_no
     *
     * @mbg.generated
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mmall_auto_renewal_log.sku_no
     *
     * @return the value of t_mmall_auto_renewal_log.sku_no
     *
     * @mbg.generated
     */
    public String getSkuNo() {
        return skuNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mmall_auto_renewal_log.sku_no
     *
     * @param skuNo the value for t_mmall_auto_renewal_log.sku_no
     *
     * @mbg.generated
     */
    public void setSkuNo(String skuNo) {
        this.skuNo = skuNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mmall_auto_renewal_log.vip_type
     *
     * @return the value of t_mmall_auto_renewal_log.vip_type
     *
     * @mbg.generated
     */
    public Integer getVipType() {
        return vipType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mmall_auto_renewal_log.vip_type
     *
     * @param vipType the value for t_mmall_auto_renewal_log.vip_type
     *
     * @mbg.generated
     */
    public void setVipType(Integer vipType) {
        this.vipType = vipType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mmall_auto_renewal_log.status
     *
     * @return the value of t_mmall_auto_renewal_log.status
     *
     * @mbg.generated
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mmall_auto_renewal_log.status
     *
     * @param status the value for t_mmall_auto_renewal_log.status
     *
     * @mbg.generated
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mmall_auto_renewal_log.create_time
     *
     * @return the value of t_mmall_auto_renewal_log.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mmall_auto_renewal_log.create_time
     *
     * @param createTime the value for t_mmall_auto_renewal_log.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mmall_auto_renewal_log.modify_time
     *
     * @return the value of t_mmall_auto_renewal_log.modify_time
     *
     * @mbg.generated
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mmall_auto_renewal_log.modify_time
     *
     * @param modifyTime the value for t_mmall_auto_renewal_log.modify_time
     *
     * @mbg.generated
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mmall_auto_renewal_log.bind_Id
     *
     * @return the value of t_mmall_auto_renewal_log.bind_Id
     *
     * @mbg.generated
     */
    public String getBindId() {
        return bindId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mmall_auto_renewal_log.bind_Id
     *
     * @param bindId the value for t_mmall_auto_renewal_log.bind_Id
     *
     * @mbg.generated
     */
    public void setBindId(String bindId) {
        this.bindId = bindId;
    }
}