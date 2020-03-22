package com.mjj.orm.mybatis.demo.dto;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table t_benefit_hades_erp
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class TBenefitHadesErp extends BaseEntity {
    /**
     * Database Column Remarks:
     *   开始日期结束日期产品id构成的唯一键
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_benefit_hades_erp.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     * Database Column Remarks:
     *   settlementNo
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_benefit_hades_erp.settlement_no
     *
     * @mbg.generated
     */
    private String settlementNo;

    /**
     * Database Column Remarks:
     *   0初始，1成功，2失败
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_benefit_hades_erp.rectipt_type
     *
     * @mbg.generated
     */
    private Integer rectiptType;

    /**
     * Database Column Remarks:
     *   应收id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_benefit_hades_erp.receivable_id
     *
     * @mbg.generated
     */
    private String receivableId;

    /**
     * Database Column Remarks:
     *   0初始，1成功，2失败
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_benefit_hades_erp.receivable_type
     *
     * @mbg.generated
     */
    private Integer receivableType;

    /**
     * Database Column Remarks:
     *   应付id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_benefit_hades_erp.payable_id
     *
     * @mbg.generated
     */
    private String payableId;

    /**
     * Database Column Remarks:
     *   0初始，1成功，2失败
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_benefit_hades_erp.payable_type
     *
     * @mbg.generated
     */
    private Integer payableType;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_benefit_hades_erp.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     * Database Column Remarks:
     *   更新时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_benefit_hades_erp.update_time
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     * Database Column Remarks:
     *   开始时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_benefit_hades_erp.start_time
     *
     * @mbg.generated
     */
    private Date startTime;

    /**
     * Database Column Remarks:
     *   结束时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_benefit_hades_erp.end_time
     *
     * @mbg.generated
     */
    private Date endTime;

    /**
     * Database Column Remarks:
     *   版权方
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_benefit_hades_erp.copyright
     *
     * @mbg.generated
     */
    private Integer copyright;

    /**
     * Database Column Remarks:
     *   业务线
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_benefit_hades_erp.channel
     *
     * @mbg.generated
     */
    private Integer channel;

    /**
     * Database Column Remarks:
     *   收款id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_benefit_hades_erp.receipt_id
     *
     * @mbg.generated
     */
    private String receiptId;

    /**
     * Database Column Remarks:
     *   业务线
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_benefit_hades_erp.business_id
     *
     * @mbg.generated
     */
    private String businessId;

    /**
     * Database Column Remarks:
     *   推送原因
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_benefit_hades_erp.receipt_reason
     *
     * @mbg.generated
     */
    private String receiptReason;

    /**
     * Database Column Remarks:
     *   应收推送原因
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_benefit_hades_erp.receivable_reason
     *
     * @mbg.generated
     */
    private String receivableReason;

    /**
     * Database Column Remarks:
     *   应付推送原因
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_benefit_hades_erp.payable_reason
     *
     * @mbg.generated
     */
    private String payableReason;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_benefit_hades_erp.id
     *
     * @return the value of t_benefit_hades_erp.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_benefit_hades_erp.id
     *
     * @param id the value for t_benefit_hades_erp.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_benefit_hades_erp.settlement_no
     *
     * @return the value of t_benefit_hades_erp.settlement_no
     *
     * @mbg.generated
     */
    public String getSettlementNo() {
        return settlementNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_benefit_hades_erp.settlement_no
     *
     * @param settlementNo the value for t_benefit_hades_erp.settlement_no
     *
     * @mbg.generated
     */
    public void setSettlementNo(String settlementNo) {
        this.settlementNo = settlementNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_benefit_hades_erp.rectipt_type
     *
     * @return the value of t_benefit_hades_erp.rectipt_type
     *
     * @mbg.generated
     */
    public Integer getRectiptType() {
        return rectiptType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_benefit_hades_erp.rectipt_type
     *
     * @param rectiptType the value for t_benefit_hades_erp.rectipt_type
     *
     * @mbg.generated
     */
    public void setRectiptType(Integer rectiptType) {
        this.rectiptType = rectiptType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_benefit_hades_erp.receivable_id
     *
     * @return the value of t_benefit_hades_erp.receivable_id
     *
     * @mbg.generated
     */
    public String getReceivableId() {
        return receivableId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_benefit_hades_erp.receivable_id
     *
     * @param receivableId the value for t_benefit_hades_erp.receivable_id
     *
     * @mbg.generated
     */
    public void setReceivableId(String receivableId) {
        this.receivableId = receivableId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_benefit_hades_erp.receivable_type
     *
     * @return the value of t_benefit_hades_erp.receivable_type
     *
     * @mbg.generated
     */
    public Integer getReceivableType() {
        return receivableType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_benefit_hades_erp.receivable_type
     *
     * @param receivableType the value for t_benefit_hades_erp.receivable_type
     *
     * @mbg.generated
     */
    public void setReceivableType(Integer receivableType) {
        this.receivableType = receivableType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_benefit_hades_erp.payable_id
     *
     * @return the value of t_benefit_hades_erp.payable_id
     *
     * @mbg.generated
     */
    public String getPayableId() {
        return payableId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_benefit_hades_erp.payable_id
     *
     * @param payableId the value for t_benefit_hades_erp.payable_id
     *
     * @mbg.generated
     */
    public void setPayableId(String payableId) {
        this.payableId = payableId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_benefit_hades_erp.payable_type
     *
     * @return the value of t_benefit_hades_erp.payable_type
     *
     * @mbg.generated
     */
    public Integer getPayableType() {
        return payableType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_benefit_hades_erp.payable_type
     *
     * @param payableType the value for t_benefit_hades_erp.payable_type
     *
     * @mbg.generated
     */
    public void setPayableType(Integer payableType) {
        this.payableType = payableType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_benefit_hades_erp.create_time
     *
     * @return the value of t_benefit_hades_erp.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_benefit_hades_erp.create_time
     *
     * @param createTime the value for t_benefit_hades_erp.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_benefit_hades_erp.update_time
     *
     * @return the value of t_benefit_hades_erp.update_time
     *
     * @mbg.generated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_benefit_hades_erp.update_time
     *
     * @param updateTime the value for t_benefit_hades_erp.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_benefit_hades_erp.start_time
     *
     * @return the value of t_benefit_hades_erp.start_time
     *
     * @mbg.generated
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_benefit_hades_erp.start_time
     *
     * @param startTime the value for t_benefit_hades_erp.start_time
     *
     * @mbg.generated
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_benefit_hades_erp.end_time
     *
     * @return the value of t_benefit_hades_erp.end_time
     *
     * @mbg.generated
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_benefit_hades_erp.end_time
     *
     * @param endTime the value for t_benefit_hades_erp.end_time
     *
     * @mbg.generated
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_benefit_hades_erp.copyright
     *
     * @return the value of t_benefit_hades_erp.copyright
     *
     * @mbg.generated
     */
    public Integer getCopyright() {
        return copyright;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_benefit_hades_erp.copyright
     *
     * @param copyright the value for t_benefit_hades_erp.copyright
     *
     * @mbg.generated
     */
    public void setCopyright(Integer copyright) {
        this.copyright = copyright;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_benefit_hades_erp.channel
     *
     * @return the value of t_benefit_hades_erp.channel
     *
     * @mbg.generated
     */
    public Integer getChannel() {
        return channel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_benefit_hades_erp.channel
     *
     * @param channel the value for t_benefit_hades_erp.channel
     *
     * @mbg.generated
     */
    public void setChannel(Integer channel) {
        this.channel = channel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_benefit_hades_erp.receipt_id
     *
     * @return the value of t_benefit_hades_erp.receipt_id
     *
     * @mbg.generated
     */
    public String getReceiptId() {
        return receiptId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_benefit_hades_erp.receipt_id
     *
     * @param receiptId the value for t_benefit_hades_erp.receipt_id
     *
     * @mbg.generated
     */
    public void setReceiptId(String receiptId) {
        this.receiptId = receiptId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_benefit_hades_erp.business_id
     *
     * @return the value of t_benefit_hades_erp.business_id
     *
     * @mbg.generated
     */
    public String getBusinessId() {
        return businessId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_benefit_hades_erp.business_id
     *
     * @param businessId the value for t_benefit_hades_erp.business_id
     *
     * @mbg.generated
     */
    public void setBusinessId(String businessId) {
        this.businessId = businessId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_benefit_hades_erp.receipt_reason
     *
     * @return the value of t_benefit_hades_erp.receipt_reason
     *
     * @mbg.generated
     */
    public String getReceiptReason() {
        return receiptReason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_benefit_hades_erp.receipt_reason
     *
     * @param receiptReason the value for t_benefit_hades_erp.receipt_reason
     *
     * @mbg.generated
     */
    public void setReceiptReason(String receiptReason) {
        this.receiptReason = receiptReason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_benefit_hades_erp.receivable_reason
     *
     * @return the value of t_benefit_hades_erp.receivable_reason
     *
     * @mbg.generated
     */
    public String getReceivableReason() {
        return receivableReason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_benefit_hades_erp.receivable_reason
     *
     * @param receivableReason the value for t_benefit_hades_erp.receivable_reason
     *
     * @mbg.generated
     */
    public void setReceivableReason(String receivableReason) {
        this.receivableReason = receivableReason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_benefit_hades_erp.payable_reason
     *
     * @return the value of t_benefit_hades_erp.payable_reason
     *
     * @mbg.generated
     */
    public String getPayableReason() {
        return payableReason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_benefit_hades_erp.payable_reason
     *
     * @param payableReason the value for t_benefit_hades_erp.payable_reason
     *
     * @mbg.generated
     */
    public void setPayableReason(String payableReason) {
        this.payableReason = payableReason;
    }
}