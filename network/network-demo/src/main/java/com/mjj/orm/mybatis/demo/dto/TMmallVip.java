package com.mjj.orm.mybatis.demo.dto;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table t_mmall_vip
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class TMmallVip extends BaseEntity {
    /**
     * Database Column Remarks:
     *   自增ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mmall_vip.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * Database Column Remarks:
     *   skuNo只有自动续费时才添加
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mmall_vip.sku_no
     *
     * @mbg.generated
     */
    private String skuNo;

    /**
     * Database Column Remarks:
     *   用户ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mmall_vip.user_id
     *
     * @mbg.generated
     */
    private Long userId;

    /**
     * Database Column Remarks:
     *   第三方uid
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mmall_vip.third_party_uid
     *
     * @mbg.generated
     */
    private String thirdPartyUid;

    /**
     * Database Column Remarks:
     *   商户编码
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mmall_vip.vendor_no
     *
     * @mbg.generated
     */
    private String vendorNo;

    /**
     * Database Column Remarks:
     *   扩展字段
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mmall_vip.ext
     *
     * @mbg.generated
     */
    private String ext;

    /**
     * Database Column Remarks:
     *   商户会员ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mmall_vip.vendor_vip_id
     *
     * @mbg.generated
     */
    private String vendorVipId;

    /**
     * Database Column Remarks:
     *   商户会员名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mmall_vip.vendor_vip_name
     *
     * @mbg.generated
     */
    private String vendorVipName;

    /**
     * Database Column Remarks:
     *   会员开始时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mmall_vip.start_time
     *
     * @mbg.generated
     */
    private Date startTime;

    /**
     * Database Column Remarks:
     *   自动续费绑定ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mmall_vip.bind_id
     *
     * @mbg.generated
     */
    private String bindId;

    /**
     * Database Column Remarks:
     *   会员结束时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mmall_vip.end_time
     *
     * @mbg.generated
     */
    private Date endTime;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mmall_vip.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     * Database Column Remarks:
     *   修改时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mmall_vip.modify_time
     *
     * @mbg.generated
     */
    private Date modifyTime;

    /**
     * Database Column Remarks:
     *   订阅续费状态NULL时为非订阅 
     *   1 为已经订阅，0为已退订
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mmall_vip.subscriber_status
     *
     * @mbg.generated
     */
    private Byte subscriberStatus;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mmall_vip.id
     *
     * @return the value of t_mmall_vip.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mmall_vip.id
     *
     * @param id the value for t_mmall_vip.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mmall_vip.sku_no
     *
     * @return the value of t_mmall_vip.sku_no
     *
     * @mbg.generated
     */
    public String getSkuNo() {
        return skuNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mmall_vip.sku_no
     *
     * @param skuNo the value for t_mmall_vip.sku_no
     *
     * @mbg.generated
     */
    public void setSkuNo(String skuNo) {
        this.skuNo = skuNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mmall_vip.user_id
     *
     * @return the value of t_mmall_vip.user_id
     *
     * @mbg.generated
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mmall_vip.user_id
     *
     * @param userId the value for t_mmall_vip.user_id
     *
     * @mbg.generated
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mmall_vip.third_party_uid
     *
     * @return the value of t_mmall_vip.third_party_uid
     *
     * @mbg.generated
     */
    public String getThirdPartyUid() {
        return thirdPartyUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mmall_vip.third_party_uid
     *
     * @param thirdPartyUid the value for t_mmall_vip.third_party_uid
     *
     * @mbg.generated
     */
    public void setThirdPartyUid(String thirdPartyUid) {
        this.thirdPartyUid = thirdPartyUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mmall_vip.vendor_no
     *
     * @return the value of t_mmall_vip.vendor_no
     *
     * @mbg.generated
     */
    public String getVendorNo() {
        return vendorNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mmall_vip.vendor_no
     *
     * @param vendorNo the value for t_mmall_vip.vendor_no
     *
     * @mbg.generated
     */
    public void setVendorNo(String vendorNo) {
        this.vendorNo = vendorNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mmall_vip.ext
     *
     * @return the value of t_mmall_vip.ext
     *
     * @mbg.generated
     */
    public String getExt() {
        return ext;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mmall_vip.ext
     *
     * @param ext the value for t_mmall_vip.ext
     *
     * @mbg.generated
     */
    public void setExt(String ext) {
        this.ext = ext;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mmall_vip.vendor_vip_id
     *
     * @return the value of t_mmall_vip.vendor_vip_id
     *
     * @mbg.generated
     */
    public String getVendorVipId() {
        return vendorVipId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mmall_vip.vendor_vip_id
     *
     * @param vendorVipId the value for t_mmall_vip.vendor_vip_id
     *
     * @mbg.generated
     */
    public void setVendorVipId(String vendorVipId) {
        this.vendorVipId = vendorVipId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mmall_vip.vendor_vip_name
     *
     * @return the value of t_mmall_vip.vendor_vip_name
     *
     * @mbg.generated
     */
    public String getVendorVipName() {
        return vendorVipName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mmall_vip.vendor_vip_name
     *
     * @param vendorVipName the value for t_mmall_vip.vendor_vip_name
     *
     * @mbg.generated
     */
    public void setVendorVipName(String vendorVipName) {
        this.vendorVipName = vendorVipName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mmall_vip.start_time
     *
     * @return the value of t_mmall_vip.start_time
     *
     * @mbg.generated
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mmall_vip.start_time
     *
     * @param startTime the value for t_mmall_vip.start_time
     *
     * @mbg.generated
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mmall_vip.bind_id
     *
     * @return the value of t_mmall_vip.bind_id
     *
     * @mbg.generated
     */
    public String getBindId() {
        return bindId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mmall_vip.bind_id
     *
     * @param bindId the value for t_mmall_vip.bind_id
     *
     * @mbg.generated
     */
    public void setBindId(String bindId) {
        this.bindId = bindId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mmall_vip.end_time
     *
     * @return the value of t_mmall_vip.end_time
     *
     * @mbg.generated
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mmall_vip.end_time
     *
     * @param endTime the value for t_mmall_vip.end_time
     *
     * @mbg.generated
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mmall_vip.create_time
     *
     * @return the value of t_mmall_vip.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mmall_vip.create_time
     *
     * @param createTime the value for t_mmall_vip.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mmall_vip.modify_time
     *
     * @return the value of t_mmall_vip.modify_time
     *
     * @mbg.generated
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mmall_vip.modify_time
     *
     * @param modifyTime the value for t_mmall_vip.modify_time
     *
     * @mbg.generated
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mmall_vip.subscriber_status
     *
     * @return the value of t_mmall_vip.subscriber_status
     *
     * @mbg.generated
     */
    public Byte getSubscriberStatus() {
        return subscriberStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mmall_vip.subscriber_status
     *
     * @param subscriberStatus the value for t_mmall_vip.subscriber_status
     *
     * @mbg.generated
     */
    public void setSubscriberStatus(Byte subscriberStatus) {
        this.subscriberStatus = subscriberStatus;
    }
}