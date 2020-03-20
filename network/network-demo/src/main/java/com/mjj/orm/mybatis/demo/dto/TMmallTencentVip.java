package com.mjj.orm.mybatis.demo.dto;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table t_mmall_tencent_vip
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class TMmallTencentVip extends BaseEntity {
    /**
     * Database Column Remarks:
     *   自增ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mmall_tencent_vip.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * Database Column Remarks:
     *   乐视用户ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mmall_tencent_vip.user_id
     *
     * @mbg.generated
     */
    private Long userId;

    /**
     * Database Column Remarks:
     *   用户mac地址
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mmall_tencent_vip.user_mac
     *
     * @mbg.generated
     */
    private String userMac;

    /**
     * Database Column Remarks:
     *   腾讯用户ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mmall_tencent_vip.tencent_uid
     *
     * @mbg.generated
     */
    private String tencentUid;

    /**
     * Database Column Remarks:
     *   会员开始时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mmall_tencent_vip.start_time
     *
     * @mbg.generated
     */
    private Date startTime;

    /**
     * Database Column Remarks:
     *   会员结束时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mmall_tencent_vip.end_time
     *
     * @mbg.generated
     */
    private Date endTime;

    /**
     * Database Column Remarks:
     *   标识登录登出
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mmall_tencent_vip.type
     *
     * @mbg.generated
     */
    private Integer type;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mmall_tencent_vip.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mmall_tencent_vip.modify_time
     *
     * @mbg.generated
     */
    private Date modifyTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mmall_tencent_vip.tencent_uid_type
     *
     * @mbg.generated
     */
    private String tencentUidType;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mmall_tencent_vip.id
     *
     * @return the value of t_mmall_tencent_vip.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mmall_tencent_vip.id
     *
     * @param id the value for t_mmall_tencent_vip.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mmall_tencent_vip.user_id
     *
     * @return the value of t_mmall_tencent_vip.user_id
     *
     * @mbg.generated
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mmall_tencent_vip.user_id
     *
     * @param userId the value for t_mmall_tencent_vip.user_id
     *
     * @mbg.generated
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mmall_tencent_vip.user_mac
     *
     * @return the value of t_mmall_tencent_vip.user_mac
     *
     * @mbg.generated
     */
    public String getUserMac() {
        return userMac;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mmall_tencent_vip.user_mac
     *
     * @param userMac the value for t_mmall_tencent_vip.user_mac
     *
     * @mbg.generated
     */
    public void setUserMac(String userMac) {
        this.userMac = userMac;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mmall_tencent_vip.tencent_uid
     *
     * @return the value of t_mmall_tencent_vip.tencent_uid
     *
     * @mbg.generated
     */
    public String getTencentUid() {
        return tencentUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mmall_tencent_vip.tencent_uid
     *
     * @param tencentUid the value for t_mmall_tencent_vip.tencent_uid
     *
     * @mbg.generated
     */
    public void setTencentUid(String tencentUid) {
        this.tencentUid = tencentUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mmall_tencent_vip.start_time
     *
     * @return the value of t_mmall_tencent_vip.start_time
     *
     * @mbg.generated
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mmall_tencent_vip.start_time
     *
     * @param startTime the value for t_mmall_tencent_vip.start_time
     *
     * @mbg.generated
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mmall_tencent_vip.end_time
     *
     * @return the value of t_mmall_tencent_vip.end_time
     *
     * @mbg.generated
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mmall_tencent_vip.end_time
     *
     * @param endTime the value for t_mmall_tencent_vip.end_time
     *
     * @mbg.generated
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mmall_tencent_vip.type
     *
     * @return the value of t_mmall_tencent_vip.type
     *
     * @mbg.generated
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mmall_tencent_vip.type
     *
     * @param type the value for t_mmall_tencent_vip.type
     *
     * @mbg.generated
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mmall_tencent_vip.create_time
     *
     * @return the value of t_mmall_tencent_vip.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mmall_tencent_vip.create_time
     *
     * @param createTime the value for t_mmall_tencent_vip.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mmall_tencent_vip.modify_time
     *
     * @return the value of t_mmall_tencent_vip.modify_time
     *
     * @mbg.generated
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mmall_tencent_vip.modify_time
     *
     * @param modifyTime the value for t_mmall_tencent_vip.modify_time
     *
     * @mbg.generated
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mmall_tencent_vip.tencent_uid_type
     *
     * @return the value of t_mmall_tencent_vip.tencent_uid_type
     *
     * @mbg.generated
     */
    public String getTencentUidType() {
        return tencentUidType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mmall_tencent_vip.tencent_uid_type
     *
     * @param tencentUidType the value for t_mmall_tencent_vip.tencent_uid_type
     *
     * @mbg.generated
     */
    public void setTencentUidType(String tencentUidType) {
        this.tencentUidType = tencentUidType;
    }
}