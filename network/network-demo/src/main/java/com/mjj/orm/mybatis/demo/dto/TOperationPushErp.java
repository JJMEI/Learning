package com.mjj.orm.mybatis.demo.dto;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table t_operation_push_erp
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class TOperationPushErp extends BaseEntity {
    /**
     * Database Column Remarks:
     *   1:游戏类
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_operation_push_erp.type
     *
     * @mbg.generated
     */
    private Integer type;

    /**
     * Database Column Remarks:
     *   审计月份
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_operation_push_erp.audit_date
     *
     * @mbg.generated
     */
    private String auditDate;

    /**
     * Database Column Remarks:
     *   父支付渠道 1微信 2支付宝
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_operation_push_erp.pay_parent_channel
     *
     * @mbg.generated
     */
    private Byte payParentChannel;

    /**
     * Database Column Remarks:
     *   供应商编码
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_operation_push_erp.vendor_code
     *
     * @mbg.generated
     */
    private String vendorCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_operation_push_erp.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * Database Column Remarks:
     *   收款批次ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_operation_push_erp.receipt_batch_id
     *
     * @mbg.generated
     */
    private String receiptBatchId;

    /**
     * Database Column Remarks:
     *   erp收款接口返回信息
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_operation_push_erp.receipt_error_message
     *
     * @mbg.generated
     */
    private String receiptErrorMessage;

    /**
     * Database Column Remarks:
     *   收款ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_operation_push_erp.receipt_id
     *
     * @mbg.generated
     */
    private String receiptId;

    /**
     * Database Column Remarks:
     *   收款状态
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_operation_push_erp.receipt_status
     *
     * @mbg.generated
     */
    private Integer receiptStatus;

    /**
     * Database Column Remarks:
     *   应收接口推送批次ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_operation_push_erp.receivable_batch_id
     *
     * @mbg.generated
     */
    private String receivableBatchId;

    /**
     * Database Column Remarks:
     *   应收接口返回信息
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_operation_push_erp.receivable_error_message
     *
     * @mbg.generated
     */
    private String receivableErrorMessage;

    /**
     * Database Column Remarks:
     *   应收状态
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_operation_push_erp.receivable_status
     *
     * @mbg.generated
     */
    private Integer receivableStatus;

    /**
     * Database Column Remarks:
     *   应付接口推送批次ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_operation_push_erp.payable_batch_id
     *
     * @mbg.generated
     */
    private String payableBatchId;

    /**
     * Database Column Remarks:
     *   应付接口返回错误信息
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_operation_push_erp.payable_error_message
     *
     * @mbg.generated
     */
    private String payableErrorMessage;

    /**
     * Database Column Remarks:
     *   应付状态
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_operation_push_erp.payable_status
     *
     * @mbg.generated
     */
    private Integer payableStatus;

    /**
     * Database Column Remarks:
     *   日志记录创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_operation_push_erp.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     * Database Column Remarks:
     *   日志记录更新时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_operation_push_erp.update_time
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     * Database Column Remarks:
     *   结算单号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_operation_push_erp.settlement_no
     *
     * @mbg.generated
     */
    private String settlementNo;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_operation_push_erp.type
     *
     * @return the value of t_operation_push_erp.type
     *
     * @mbg.generated
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_operation_push_erp.type
     *
     * @param type the value for t_operation_push_erp.type
     *
     * @mbg.generated
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_operation_push_erp.audit_date
     *
     * @return the value of t_operation_push_erp.audit_date
     *
     * @mbg.generated
     */
    public String getAuditDate() {
        return auditDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_operation_push_erp.audit_date
     *
     * @param auditDate the value for t_operation_push_erp.audit_date
     *
     * @mbg.generated
     */
    public void setAuditDate(String auditDate) {
        this.auditDate = auditDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_operation_push_erp.pay_parent_channel
     *
     * @return the value of t_operation_push_erp.pay_parent_channel
     *
     * @mbg.generated
     */
    public Byte getPayParentChannel() {
        return payParentChannel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_operation_push_erp.pay_parent_channel
     *
     * @param payParentChannel the value for t_operation_push_erp.pay_parent_channel
     *
     * @mbg.generated
     */
    public void setPayParentChannel(Byte payParentChannel) {
        this.payParentChannel = payParentChannel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_operation_push_erp.vendor_code
     *
     * @return the value of t_operation_push_erp.vendor_code
     *
     * @mbg.generated
     */
    public String getVendorCode() {
        return vendorCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_operation_push_erp.vendor_code
     *
     * @param vendorCode the value for t_operation_push_erp.vendor_code
     *
     * @mbg.generated
     */
    public void setVendorCode(String vendorCode) {
        this.vendorCode = vendorCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_operation_push_erp.id
     *
     * @return the value of t_operation_push_erp.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_operation_push_erp.id
     *
     * @param id the value for t_operation_push_erp.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_operation_push_erp.receipt_batch_id
     *
     * @return the value of t_operation_push_erp.receipt_batch_id
     *
     * @mbg.generated
     */
    public String getReceiptBatchId() {
        return receiptBatchId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_operation_push_erp.receipt_batch_id
     *
     * @param receiptBatchId the value for t_operation_push_erp.receipt_batch_id
     *
     * @mbg.generated
     */
    public void setReceiptBatchId(String receiptBatchId) {
        this.receiptBatchId = receiptBatchId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_operation_push_erp.receipt_error_message
     *
     * @return the value of t_operation_push_erp.receipt_error_message
     *
     * @mbg.generated
     */
    public String getReceiptErrorMessage() {
        return receiptErrorMessage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_operation_push_erp.receipt_error_message
     *
     * @param receiptErrorMessage the value for t_operation_push_erp.receipt_error_message
     *
     * @mbg.generated
     */
    public void setReceiptErrorMessage(String receiptErrorMessage) {
        this.receiptErrorMessage = receiptErrorMessage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_operation_push_erp.receipt_id
     *
     * @return the value of t_operation_push_erp.receipt_id
     *
     * @mbg.generated
     */
    public String getReceiptId() {
        return receiptId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_operation_push_erp.receipt_id
     *
     * @param receiptId the value for t_operation_push_erp.receipt_id
     *
     * @mbg.generated
     */
    public void setReceiptId(String receiptId) {
        this.receiptId = receiptId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_operation_push_erp.receipt_status
     *
     * @return the value of t_operation_push_erp.receipt_status
     *
     * @mbg.generated
     */
    public Integer getReceiptStatus() {
        return receiptStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_operation_push_erp.receipt_status
     *
     * @param receiptStatus the value for t_operation_push_erp.receipt_status
     *
     * @mbg.generated
     */
    public void setReceiptStatus(Integer receiptStatus) {
        this.receiptStatus = receiptStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_operation_push_erp.receivable_batch_id
     *
     * @return the value of t_operation_push_erp.receivable_batch_id
     *
     * @mbg.generated
     */
    public String getReceivableBatchId() {
        return receivableBatchId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_operation_push_erp.receivable_batch_id
     *
     * @param receivableBatchId the value for t_operation_push_erp.receivable_batch_id
     *
     * @mbg.generated
     */
    public void setReceivableBatchId(String receivableBatchId) {
        this.receivableBatchId = receivableBatchId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_operation_push_erp.receivable_error_message
     *
     * @return the value of t_operation_push_erp.receivable_error_message
     *
     * @mbg.generated
     */
    public String getReceivableErrorMessage() {
        return receivableErrorMessage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_operation_push_erp.receivable_error_message
     *
     * @param receivableErrorMessage the value for t_operation_push_erp.receivable_error_message
     *
     * @mbg.generated
     */
    public void setReceivableErrorMessage(String receivableErrorMessage) {
        this.receivableErrorMessage = receivableErrorMessage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_operation_push_erp.receivable_status
     *
     * @return the value of t_operation_push_erp.receivable_status
     *
     * @mbg.generated
     */
    public Integer getReceivableStatus() {
        return receivableStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_operation_push_erp.receivable_status
     *
     * @param receivableStatus the value for t_operation_push_erp.receivable_status
     *
     * @mbg.generated
     */
    public void setReceivableStatus(Integer receivableStatus) {
        this.receivableStatus = receivableStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_operation_push_erp.payable_batch_id
     *
     * @return the value of t_operation_push_erp.payable_batch_id
     *
     * @mbg.generated
     */
    public String getPayableBatchId() {
        return payableBatchId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_operation_push_erp.payable_batch_id
     *
     * @param payableBatchId the value for t_operation_push_erp.payable_batch_id
     *
     * @mbg.generated
     */
    public void setPayableBatchId(String payableBatchId) {
        this.payableBatchId = payableBatchId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_operation_push_erp.payable_error_message
     *
     * @return the value of t_operation_push_erp.payable_error_message
     *
     * @mbg.generated
     */
    public String getPayableErrorMessage() {
        return payableErrorMessage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_operation_push_erp.payable_error_message
     *
     * @param payableErrorMessage the value for t_operation_push_erp.payable_error_message
     *
     * @mbg.generated
     */
    public void setPayableErrorMessage(String payableErrorMessage) {
        this.payableErrorMessage = payableErrorMessage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_operation_push_erp.payable_status
     *
     * @return the value of t_operation_push_erp.payable_status
     *
     * @mbg.generated
     */
    public Integer getPayableStatus() {
        return payableStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_operation_push_erp.payable_status
     *
     * @param payableStatus the value for t_operation_push_erp.payable_status
     *
     * @mbg.generated
     */
    public void setPayableStatus(Integer payableStatus) {
        this.payableStatus = payableStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_operation_push_erp.create_time
     *
     * @return the value of t_operation_push_erp.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_operation_push_erp.create_time
     *
     * @param createTime the value for t_operation_push_erp.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_operation_push_erp.update_time
     *
     * @return the value of t_operation_push_erp.update_time
     *
     * @mbg.generated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_operation_push_erp.update_time
     *
     * @param updateTime the value for t_operation_push_erp.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_operation_push_erp.settlement_no
     *
     * @return the value of t_operation_push_erp.settlement_no
     *
     * @mbg.generated
     */
    public String getSettlementNo() {
        return settlementNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_operation_push_erp.settlement_no
     *
     * @param settlementNo the value for t_operation_push_erp.settlement_no
     *
     * @mbg.generated
     */
    public void setSettlementNo(String settlementNo) {
        this.settlementNo = settlementNo;
    }
}