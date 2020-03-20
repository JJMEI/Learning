package com.mjj.orm.mybatis.demo.dto;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table t_mmall_vip_log
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class TMmallVipLog extends BaseEntity {
    /**
     * Database Column Remarks:
     *   自增ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mmall_vip_log.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * Database Column Remarks:
     *   操作类型(1:开通会员，2:关闭会员)
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mmall_vip_log.type
     *
     * @mbg.generated
     */
    private Byte type;

    /**
     * Database Column Remarks:
     *   订单号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mmall_vip_log.order_no
     *
     * @mbg.generated
     */
    private String orderNo;

    /**
     * Database Column Remarks:
     *   操作用户IP
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mmall_vip_log.operate_ip
     *
     * @mbg.generated
     */
    private String operateIp;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mmall_vip_log.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     * Database Column Remarks:
     *   操作详情
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mmall_vip_log.operate_detail
     *
     * @mbg.generated
     */
    private String operateDetail;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mmall_vip_log.id
     *
     * @return the value of t_mmall_vip_log.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mmall_vip_log.id
     *
     * @param id the value for t_mmall_vip_log.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mmall_vip_log.type
     *
     * @return the value of t_mmall_vip_log.type
     *
     * @mbg.generated
     */
    public Byte getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mmall_vip_log.type
     *
     * @param type the value for t_mmall_vip_log.type
     *
     * @mbg.generated
     */
    public void setType(Byte type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mmall_vip_log.order_no
     *
     * @return the value of t_mmall_vip_log.order_no
     *
     * @mbg.generated
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mmall_vip_log.order_no
     *
     * @param orderNo the value for t_mmall_vip_log.order_no
     *
     * @mbg.generated
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mmall_vip_log.operate_ip
     *
     * @return the value of t_mmall_vip_log.operate_ip
     *
     * @mbg.generated
     */
    public String getOperateIp() {
        return operateIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mmall_vip_log.operate_ip
     *
     * @param operateIp the value for t_mmall_vip_log.operate_ip
     *
     * @mbg.generated
     */
    public void setOperateIp(String operateIp) {
        this.operateIp = operateIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mmall_vip_log.create_time
     *
     * @return the value of t_mmall_vip_log.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mmall_vip_log.create_time
     *
     * @param createTime the value for t_mmall_vip_log.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mmall_vip_log.operate_detail
     *
     * @return the value of t_mmall_vip_log.operate_detail
     *
     * @mbg.generated
     */
    public String getOperateDetail() {
        return operateDetail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mmall_vip_log.operate_detail
     *
     * @param operateDetail the value for t_mmall_vip_log.operate_detail
     *
     * @mbg.generated
     */
    public void setOperateDetail(String operateDetail) {
        this.operateDetail = operateDetail;
    }
}