package com.mjj.orm.mybatis.demo.dto;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table t_mmall_sub_order
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class TMmallSubOrder extends BaseEntity {
    /**
     * Database Column Remarks:
     *   自增ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mmall_sub_order.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * Database Column Remarks:
     *   订单号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mmall_sub_order.order_no
     *
     * @mbg.generated
     */
    private String orderNo;

    /**
     * Database Column Remarks:
     *   售卖价格
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mmall_sub_order.price
     *
     * @mbg.generated
     */
    private BigDecimal price;

    /**
     * Database Column Remarks:
     *   支付订单号(退款时为支付退款订单号)
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mmall_sub_order.pay_order_id
     *
     * @mbg.generated
     */
    private String payOrderId;

    /**
     * Database Column Remarks:
     *   子订单号(需全局唯一)
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mmall_sub_order.sub_order_no
     *
     * @mbg.generated
     */
    private String subOrderNo;

    /**
     * Database Column Remarks:
     *   子单价格
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mmall_sub_order.sub_price
     *
     * @mbg.generated
     */
    private BigDecimal subPrice;

    /**
     * Database Column Remarks:
     *   成本金额
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mmall_sub_order.cost_price
     *
     * @mbg.generated
     */
    private BigDecimal costPrice;

    /**
     * Database Column Remarks:
     *   子订单数量
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mmall_sub_order.sub_num
     *
     * @mbg.generated
     */
    private Integer subNum;

    /**
     * Database Column Remarks:
     *   批次号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mmall_sub_order.batch_no
     *
     * @mbg.generated
     */
    private String batchNo;

    /**
     * Database Column Remarks:
     *   支付通道名称(根据支付通道ID获取到的名称)
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mmall_sub_order.pay_channel_name
     *
     * @mbg.generated
     */
    private String payChannelName;

    /**
     * Database Column Remarks:
     *   银行账号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mmall_sub_order.bank_account
     *
     * @mbg.generated
     */
    private String bankAccount;

    /**
     * Database Column Remarks:
     *   物料编码
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mmall_sub_order.product_item_code
     *
     * @mbg.generated
     */
    private String productItemCode;

    /**
     * Database Column Remarks:
     *   供应商编码
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mmall_sub_order.vendor_code
     *
     * @mbg.generated
     */
    private String vendorCode;

    /**
     * Database Column Remarks:
     *   订单类型(0:支付，1:退款)
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mmall_sub_order.order_type
     *
     * @mbg.generated
     */
    private Byte orderType;

    /**
     * Database Column Remarks:
     *   支付操作时间(支付订单为支付时间，退款订单为支付退款时间)
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mmall_sub_order.pay_operate_time
     *
     * @mbg.generated
     */
    private Date payOperateTime;

    /**
     * Database Column Remarks:
     *   订单创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mmall_sub_order.order_create_time
     *
     * @mbg.generated
     */
    private Date orderCreateTime;

    /**
     * Database Column Remarks:
     *   用户申请退款时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mmall_sub_order.order_refund_time
     *
     * @mbg.generated
     */
    private Date orderRefundTime;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mmall_sub_order.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     * Database Column Remarks:
     *   第三方交易完成时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mmall_sub_order.third_time
     *
     * @mbg.generated
     */
    private String thirdTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mmall_sub_order.pay_business_no
     *
     * @mbg.generated
     */
    private String payBusinessNo;

    /**
     * Database Column Remarks:
     *   1是超级家庭会员
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mmall_sub_order.is_super
     *
     * @mbg.generated
     */
    private Integer isSuper;

    /**
     * Database Column Remarks:
     *   用户ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mmall_sub_order.user_id
     *
     * @mbg.generated
     */
    private Long userId;

    /**
     * Database Column Remarks:
     *   分成金额
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mmall_sub_order.share_price
     *
     * @mbg.generated
     */
    private BigDecimal sharePrice;

    /**
     * Database Column Remarks:
     *   华视分成金额（只有乐视影业需要有）
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mmall_sub_order.wasi_share_price
     *
     * @mbg.generated
     */
    private BigDecimal wasiSharePrice;

    /**
     * Database Column Remarks:
     *   sku编码
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mmall_sub_order.sku_no
     *
     * @mbg.generated
     */
    private String skuNo;

    /**
     * Database Column Remarks:
     *   sku名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mmall_sub_order.sku_name
     *
     * @mbg.generated
     */
    private String skuName;

    /**
     * Database Column Remarks:
     *   1普通会员 2超级家庭会员  4亲子会员 5付费轮播
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mmall_sub_order.sku_type
     *
     * @mbg.generated
     */
    private Integer skuType;

    /**
     * Database Column Remarks:
     *   渠道来源
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mmall_sub_order.cps_no
     *
     * @mbg.generated
     */
    private String cpsNo;

    /**
     * Database Column Remarks:
     *   1 微信 2支付宝
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mmall_sub_order.pay_channel_id
     *
     * @mbg.generated
     */
    private Integer payChannelId;

    /**
     * Database Column Remarks:
     *    1:大屏会员订单 2:轮播台订单
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mmall_sub_order.origin_order_type
     *
     * @mbg.generated
     */
    private Integer originOrderType;

    /**
     * Database Column Remarks:
     *   版权方ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mmall_sub_order.share_copyright_owner_id
     *
     * @mbg.generated
     */
    private Long shareCopyrightOwnerId;

    /**
     * Database Column Remarks:
     *   订单审计状态 0未审计 1审计 2审计处理中
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mmall_sub_order.audit_status
     *
     * @mbg.generated
     */
    private Byte auditStatus;

    /**
     * Database Column Remarks:
     *   live 版权方价格
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mmall_sub_order.copyright_owner_price
     *
     * @mbg.generated
     */
    private BigDecimal copyrightOwnerPrice;

    /**
     * Database Column Remarks:
     *   商品类型
     *   100 会员
     *   101 付费频道  1011 付费频道-赠
     *   102 付费直播  1021 付费直播-赠
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mmall_sub_order.product_type
     *
     * @mbg.generated
     */
    private Integer productType;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mmall_sub_order.id
     *
     * @return the value of t_mmall_sub_order.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mmall_sub_order.id
     *
     * @param id the value for t_mmall_sub_order.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mmall_sub_order.order_no
     *
     * @return the value of t_mmall_sub_order.order_no
     *
     * @mbg.generated
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mmall_sub_order.order_no
     *
     * @param orderNo the value for t_mmall_sub_order.order_no
     *
     * @mbg.generated
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mmall_sub_order.price
     *
     * @return the value of t_mmall_sub_order.price
     *
     * @mbg.generated
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mmall_sub_order.price
     *
     * @param price the value for t_mmall_sub_order.price
     *
     * @mbg.generated
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mmall_sub_order.pay_order_id
     *
     * @return the value of t_mmall_sub_order.pay_order_id
     *
     * @mbg.generated
     */
    public String getPayOrderId() {
        return payOrderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mmall_sub_order.pay_order_id
     *
     * @param payOrderId the value for t_mmall_sub_order.pay_order_id
     *
     * @mbg.generated
     */
    public void setPayOrderId(String payOrderId) {
        this.payOrderId = payOrderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mmall_sub_order.sub_order_no
     *
     * @return the value of t_mmall_sub_order.sub_order_no
     *
     * @mbg.generated
     */
    public String getSubOrderNo() {
        return subOrderNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mmall_sub_order.sub_order_no
     *
     * @param subOrderNo the value for t_mmall_sub_order.sub_order_no
     *
     * @mbg.generated
     */
    public void setSubOrderNo(String subOrderNo) {
        this.subOrderNo = subOrderNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mmall_sub_order.sub_price
     *
     * @return the value of t_mmall_sub_order.sub_price
     *
     * @mbg.generated
     */
    public BigDecimal getSubPrice() {
        return subPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mmall_sub_order.sub_price
     *
     * @param subPrice the value for t_mmall_sub_order.sub_price
     *
     * @mbg.generated
     */
    public void setSubPrice(BigDecimal subPrice) {
        this.subPrice = subPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mmall_sub_order.cost_price
     *
     * @return the value of t_mmall_sub_order.cost_price
     *
     * @mbg.generated
     */
    public BigDecimal getCostPrice() {
        return costPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mmall_sub_order.cost_price
     *
     * @param costPrice the value for t_mmall_sub_order.cost_price
     *
     * @mbg.generated
     */
    public void setCostPrice(BigDecimal costPrice) {
        this.costPrice = costPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mmall_sub_order.sub_num
     *
     * @return the value of t_mmall_sub_order.sub_num
     *
     * @mbg.generated
     */
    public Integer getSubNum() {
        return subNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mmall_sub_order.sub_num
     *
     * @param subNum the value for t_mmall_sub_order.sub_num
     *
     * @mbg.generated
     */
    public void setSubNum(Integer subNum) {
        this.subNum = subNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mmall_sub_order.batch_no
     *
     * @return the value of t_mmall_sub_order.batch_no
     *
     * @mbg.generated
     */
    public String getBatchNo() {
        return batchNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mmall_sub_order.batch_no
     *
     * @param batchNo the value for t_mmall_sub_order.batch_no
     *
     * @mbg.generated
     */
    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mmall_sub_order.pay_channel_name
     *
     * @return the value of t_mmall_sub_order.pay_channel_name
     *
     * @mbg.generated
     */
    public String getPayChannelName() {
        return payChannelName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mmall_sub_order.pay_channel_name
     *
     * @param payChannelName the value for t_mmall_sub_order.pay_channel_name
     *
     * @mbg.generated
     */
    public void setPayChannelName(String payChannelName) {
        this.payChannelName = payChannelName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mmall_sub_order.bank_account
     *
     * @return the value of t_mmall_sub_order.bank_account
     *
     * @mbg.generated
     */
    public String getBankAccount() {
        return bankAccount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mmall_sub_order.bank_account
     *
     * @param bankAccount the value for t_mmall_sub_order.bank_account
     *
     * @mbg.generated
     */
    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mmall_sub_order.product_item_code
     *
     * @return the value of t_mmall_sub_order.product_item_code
     *
     * @mbg.generated
     */
    public String getProductItemCode() {
        return productItemCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mmall_sub_order.product_item_code
     *
     * @param productItemCode the value for t_mmall_sub_order.product_item_code
     *
     * @mbg.generated
     */
    public void setProductItemCode(String productItemCode) {
        this.productItemCode = productItemCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mmall_sub_order.vendor_code
     *
     * @return the value of t_mmall_sub_order.vendor_code
     *
     * @mbg.generated
     */
    public String getVendorCode() {
        return vendorCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mmall_sub_order.vendor_code
     *
     * @param vendorCode the value for t_mmall_sub_order.vendor_code
     *
     * @mbg.generated
     */
    public void setVendorCode(String vendorCode) {
        this.vendorCode = vendorCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mmall_sub_order.order_type
     *
     * @return the value of t_mmall_sub_order.order_type
     *
     * @mbg.generated
     */
    public Byte getOrderType() {
        return orderType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mmall_sub_order.order_type
     *
     * @param orderType the value for t_mmall_sub_order.order_type
     *
     * @mbg.generated
     */
    public void setOrderType(Byte orderType) {
        this.orderType = orderType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mmall_sub_order.pay_operate_time
     *
     * @return the value of t_mmall_sub_order.pay_operate_time
     *
     * @mbg.generated
     */
    public Date getPayOperateTime() {
        return payOperateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mmall_sub_order.pay_operate_time
     *
     * @param payOperateTime the value for t_mmall_sub_order.pay_operate_time
     *
     * @mbg.generated
     */
    public void setPayOperateTime(Date payOperateTime) {
        this.payOperateTime = payOperateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mmall_sub_order.order_create_time
     *
     * @return the value of t_mmall_sub_order.order_create_time
     *
     * @mbg.generated
     */
    public Date getOrderCreateTime() {
        return orderCreateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mmall_sub_order.order_create_time
     *
     * @param orderCreateTime the value for t_mmall_sub_order.order_create_time
     *
     * @mbg.generated
     */
    public void setOrderCreateTime(Date orderCreateTime) {
        this.orderCreateTime = orderCreateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mmall_sub_order.order_refund_time
     *
     * @return the value of t_mmall_sub_order.order_refund_time
     *
     * @mbg.generated
     */
    public Date getOrderRefundTime() {
        return orderRefundTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mmall_sub_order.order_refund_time
     *
     * @param orderRefundTime the value for t_mmall_sub_order.order_refund_time
     *
     * @mbg.generated
     */
    public void setOrderRefundTime(Date orderRefundTime) {
        this.orderRefundTime = orderRefundTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mmall_sub_order.create_time
     *
     * @return the value of t_mmall_sub_order.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mmall_sub_order.create_time
     *
     * @param createTime the value for t_mmall_sub_order.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mmall_sub_order.third_time
     *
     * @return the value of t_mmall_sub_order.third_time
     *
     * @mbg.generated
     */
    public String getThirdTime() {
        return thirdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mmall_sub_order.third_time
     *
     * @param thirdTime the value for t_mmall_sub_order.third_time
     *
     * @mbg.generated
     */
    public void setThirdTime(String thirdTime) {
        this.thirdTime = thirdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mmall_sub_order.pay_business_no
     *
     * @return the value of t_mmall_sub_order.pay_business_no
     *
     * @mbg.generated
     */
    public String getPayBusinessNo() {
        return payBusinessNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mmall_sub_order.pay_business_no
     *
     * @param payBusinessNo the value for t_mmall_sub_order.pay_business_no
     *
     * @mbg.generated
     */
    public void setPayBusinessNo(String payBusinessNo) {
        this.payBusinessNo = payBusinessNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mmall_sub_order.is_super
     *
     * @return the value of t_mmall_sub_order.is_super
     *
     * @mbg.generated
     */
    public Integer getIsSuper() {
        return isSuper;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mmall_sub_order.is_super
     *
     * @param isSuper the value for t_mmall_sub_order.is_super
     *
     * @mbg.generated
     */
    public void setIsSuper(Integer isSuper) {
        this.isSuper = isSuper;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mmall_sub_order.user_id
     *
     * @return the value of t_mmall_sub_order.user_id
     *
     * @mbg.generated
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mmall_sub_order.user_id
     *
     * @param userId the value for t_mmall_sub_order.user_id
     *
     * @mbg.generated
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mmall_sub_order.share_price
     *
     * @return the value of t_mmall_sub_order.share_price
     *
     * @mbg.generated
     */
    public BigDecimal getSharePrice() {
        return sharePrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mmall_sub_order.share_price
     *
     * @param sharePrice the value for t_mmall_sub_order.share_price
     *
     * @mbg.generated
     */
    public void setSharePrice(BigDecimal sharePrice) {
        this.sharePrice = sharePrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mmall_sub_order.wasi_share_price
     *
     * @return the value of t_mmall_sub_order.wasi_share_price
     *
     * @mbg.generated
     */
    public BigDecimal getWasiSharePrice() {
        return wasiSharePrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mmall_sub_order.wasi_share_price
     *
     * @param wasiSharePrice the value for t_mmall_sub_order.wasi_share_price
     *
     * @mbg.generated
     */
    public void setWasiSharePrice(BigDecimal wasiSharePrice) {
        this.wasiSharePrice = wasiSharePrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mmall_sub_order.sku_no
     *
     * @return the value of t_mmall_sub_order.sku_no
     *
     * @mbg.generated
     */
    public String getSkuNo() {
        return skuNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mmall_sub_order.sku_no
     *
     * @param skuNo the value for t_mmall_sub_order.sku_no
     *
     * @mbg.generated
     */
    public void setSkuNo(String skuNo) {
        this.skuNo = skuNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mmall_sub_order.sku_name
     *
     * @return the value of t_mmall_sub_order.sku_name
     *
     * @mbg.generated
     */
    public String getSkuName() {
        return skuName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mmall_sub_order.sku_name
     *
     * @param skuName the value for t_mmall_sub_order.sku_name
     *
     * @mbg.generated
     */
    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mmall_sub_order.sku_type
     *
     * @return the value of t_mmall_sub_order.sku_type
     *
     * @mbg.generated
     */
    public Integer getSkuType() {
        return skuType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mmall_sub_order.sku_type
     *
     * @param skuType the value for t_mmall_sub_order.sku_type
     *
     * @mbg.generated
     */
    public void setSkuType(Integer skuType) {
        this.skuType = skuType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mmall_sub_order.cps_no
     *
     * @return the value of t_mmall_sub_order.cps_no
     *
     * @mbg.generated
     */
    public String getCpsNo() {
        return cpsNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mmall_sub_order.cps_no
     *
     * @param cpsNo the value for t_mmall_sub_order.cps_no
     *
     * @mbg.generated
     */
    public void setCpsNo(String cpsNo) {
        this.cpsNo = cpsNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mmall_sub_order.pay_channel_id
     *
     * @return the value of t_mmall_sub_order.pay_channel_id
     *
     * @mbg.generated
     */
    public Integer getPayChannelId() {
        return payChannelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mmall_sub_order.pay_channel_id
     *
     * @param payChannelId the value for t_mmall_sub_order.pay_channel_id
     *
     * @mbg.generated
     */
    public void setPayChannelId(Integer payChannelId) {
        this.payChannelId = payChannelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mmall_sub_order.origin_order_type
     *
     * @return the value of t_mmall_sub_order.origin_order_type
     *
     * @mbg.generated
     */
    public Integer getOriginOrderType() {
        return originOrderType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mmall_sub_order.origin_order_type
     *
     * @param originOrderType the value for t_mmall_sub_order.origin_order_type
     *
     * @mbg.generated
     */
    public void setOriginOrderType(Integer originOrderType) {
        this.originOrderType = originOrderType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mmall_sub_order.share_copyright_owner_id
     *
     * @return the value of t_mmall_sub_order.share_copyright_owner_id
     *
     * @mbg.generated
     */
    public Long getShareCopyrightOwnerId() {
        return shareCopyrightOwnerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mmall_sub_order.share_copyright_owner_id
     *
     * @param shareCopyrightOwnerId the value for t_mmall_sub_order.share_copyright_owner_id
     *
     * @mbg.generated
     */
    public void setShareCopyrightOwnerId(Long shareCopyrightOwnerId) {
        this.shareCopyrightOwnerId = shareCopyrightOwnerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mmall_sub_order.audit_status
     *
     * @return the value of t_mmall_sub_order.audit_status
     *
     * @mbg.generated
     */
    public Byte getAuditStatus() {
        return auditStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mmall_sub_order.audit_status
     *
     * @param auditStatus the value for t_mmall_sub_order.audit_status
     *
     * @mbg.generated
     */
    public void setAuditStatus(Byte auditStatus) {
        this.auditStatus = auditStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mmall_sub_order.copyright_owner_price
     *
     * @return the value of t_mmall_sub_order.copyright_owner_price
     *
     * @mbg.generated
     */
    public BigDecimal getCopyrightOwnerPrice() {
        return copyrightOwnerPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mmall_sub_order.copyright_owner_price
     *
     * @param copyrightOwnerPrice the value for t_mmall_sub_order.copyright_owner_price
     *
     * @mbg.generated
     */
    public void setCopyrightOwnerPrice(BigDecimal copyrightOwnerPrice) {
        this.copyrightOwnerPrice = copyrightOwnerPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mmall_sub_order.product_type
     *
     * @return the value of t_mmall_sub_order.product_type
     *
     * @mbg.generated
     */
    public Integer getProductType() {
        return productType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mmall_sub_order.product_type
     *
     * @param productType the value for t_mmall_sub_order.product_type
     *
     * @mbg.generated
     */
    public void setProductType(Integer productType) {
        this.productType = productType;
    }
}