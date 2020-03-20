package com.mjj.orm.mybatis.demo.dto;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table t_mmall_order_parameters_snapshot
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class TMmallOrderParametersSnapshot extends BaseEntity {
    /**
     * Database Column Remarks:
     *   自增主键
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mmall_order_parameters_snapshot.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * Database Column Remarks:
     *   最大自动续费次数默认50
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mmall_order_parameters_snapshot.renew_periods
     *
     * @mbg.generated
     */
    private Integer renewPeriods;

    /**
     * Database Column Remarks:
     *   用户签约id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mmall_order_parameters_snapshot.bind_id
     *
     * @mbg.generated
     */
    private String bindId;

    /**
     * Database Column Remarks:
     *   sku编码
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mmall_order_parameters_snapshot.sku_no
     *
     * @mbg.generated
     */
    private String skuNo;

    /**
     * Database Column Remarks:
     *   sku购买数量，默认为1
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mmall_order_parameters_snapshot.sku_cnt
     *
     * @mbg.generated
     */
    private Integer skuCnt;

    /**
     * Database Column Remarks:
     *   用户IP
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mmall_order_parameters_snapshot.user_ip
     *
     * @mbg.generated
     */
    private String userIp;

    /**
     * Database Column Remarks:
     *   平台来源
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mmall_order_parameters_snapshot.platform
     *
     * @mbg.generated
     */
    private Integer platform;

    /**
     * Database Column Remarks:
     *   支付成功回调地址
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mmall_order_parameters_snapshot.callback_url
     *
     * @mbg.generated
     */
    private String callbackUrl;

    /**
     * Database Column Remarks:
     *   终端来源
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mmall_order_parameters_snapshot.terminal
     *
     * @mbg.generated
     */
    private Integer terminal;

    /**
     * Database Column Remarks:
     *   调用APP包名
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mmall_order_parameters_snapshot.package_name
     *
     * @mbg.generated
     */
    private String packageName;

    /**
     * Database Column Remarks:
     *   扩展包名
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mmall_order_parameters_snapshot.package_name_ext
     *
     * @mbg.generated
     */
    private String packageNameExt;

    /**
     * Database Column Remarks:
     *   推广位
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mmall_order_parameters_snapshot.cps_id
     *
     * @mbg.generated
     */
    private String cpsId;

    /**
     * Database Column Remarks:
     *   mac地址
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mmall_order_parameters_snapshot.mac
     *
     * @mbg.generated
     */
    private String mac;

    /**
     * Database Column Remarks:
     *   腾讯透传字段
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mmall_order_parameters_snapshot.tx_transmit
     *
     * @mbg.generated
     */
    private String txTransmit;

    /**
     * Database Column Remarks:
     *   用户id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mmall_order_parameters_snapshot.user_id
     *
     * @mbg.generated
     */
    private Long userId;

    /**
     * Database Column Remarks:
     *   用户名
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mmall_order_parameters_snapshot.user_name
     *
     * @mbg.generated
     */
    private String userName;

    /**
     * Database Column Remarks:
     *   当前已自动续费次数
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mmall_order_parameters_snapshot.renew_count
     *
     * @mbg.generated
     */
    private Integer renewCount;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mmall_order_parameters_snapshot.id
     *
     * @return the value of t_mmall_order_parameters_snapshot.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mmall_order_parameters_snapshot.id
     *
     * @param id the value for t_mmall_order_parameters_snapshot.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mmall_order_parameters_snapshot.renew_periods
     *
     * @return the value of t_mmall_order_parameters_snapshot.renew_periods
     *
     * @mbg.generated
     */
    public Integer getRenewPeriods() {
        return renewPeriods;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mmall_order_parameters_snapshot.renew_periods
     *
     * @param renewPeriods the value for t_mmall_order_parameters_snapshot.renew_periods
     *
     * @mbg.generated
     */
    public void setRenewPeriods(Integer renewPeriods) {
        this.renewPeriods = renewPeriods;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mmall_order_parameters_snapshot.bind_id
     *
     * @return the value of t_mmall_order_parameters_snapshot.bind_id
     *
     * @mbg.generated
     */
    public String getBindId() {
        return bindId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mmall_order_parameters_snapshot.bind_id
     *
     * @param bindId the value for t_mmall_order_parameters_snapshot.bind_id
     *
     * @mbg.generated
     */
    public void setBindId(String bindId) {
        this.bindId = bindId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mmall_order_parameters_snapshot.sku_no
     *
     * @return the value of t_mmall_order_parameters_snapshot.sku_no
     *
     * @mbg.generated
     */
    public String getSkuNo() {
        return skuNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mmall_order_parameters_snapshot.sku_no
     *
     * @param skuNo the value for t_mmall_order_parameters_snapshot.sku_no
     *
     * @mbg.generated
     */
    public void setSkuNo(String skuNo) {
        this.skuNo = skuNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mmall_order_parameters_snapshot.sku_cnt
     *
     * @return the value of t_mmall_order_parameters_snapshot.sku_cnt
     *
     * @mbg.generated
     */
    public Integer getSkuCnt() {
        return skuCnt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mmall_order_parameters_snapshot.sku_cnt
     *
     * @param skuCnt the value for t_mmall_order_parameters_snapshot.sku_cnt
     *
     * @mbg.generated
     */
    public void setSkuCnt(Integer skuCnt) {
        this.skuCnt = skuCnt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mmall_order_parameters_snapshot.user_ip
     *
     * @return the value of t_mmall_order_parameters_snapshot.user_ip
     *
     * @mbg.generated
     */
    public String getUserIp() {
        return userIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mmall_order_parameters_snapshot.user_ip
     *
     * @param userIp the value for t_mmall_order_parameters_snapshot.user_ip
     *
     * @mbg.generated
     */
    public void setUserIp(String userIp) {
        this.userIp = userIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mmall_order_parameters_snapshot.platform
     *
     * @return the value of t_mmall_order_parameters_snapshot.platform
     *
     * @mbg.generated
     */
    public Integer getPlatform() {
        return platform;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mmall_order_parameters_snapshot.platform
     *
     * @param platform the value for t_mmall_order_parameters_snapshot.platform
     *
     * @mbg.generated
     */
    public void setPlatform(Integer platform) {
        this.platform = platform;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mmall_order_parameters_snapshot.callback_url
     *
     * @return the value of t_mmall_order_parameters_snapshot.callback_url
     *
     * @mbg.generated
     */
    public String getCallbackUrl() {
        return callbackUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mmall_order_parameters_snapshot.callback_url
     *
     * @param callbackUrl the value for t_mmall_order_parameters_snapshot.callback_url
     *
     * @mbg.generated
     */
    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mmall_order_parameters_snapshot.terminal
     *
     * @return the value of t_mmall_order_parameters_snapshot.terminal
     *
     * @mbg.generated
     */
    public Integer getTerminal() {
        return terminal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mmall_order_parameters_snapshot.terminal
     *
     * @param terminal the value for t_mmall_order_parameters_snapshot.terminal
     *
     * @mbg.generated
     */
    public void setTerminal(Integer terminal) {
        this.terminal = terminal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mmall_order_parameters_snapshot.package_name
     *
     * @return the value of t_mmall_order_parameters_snapshot.package_name
     *
     * @mbg.generated
     */
    public String getPackageName() {
        return packageName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mmall_order_parameters_snapshot.package_name
     *
     * @param packageName the value for t_mmall_order_parameters_snapshot.package_name
     *
     * @mbg.generated
     */
    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mmall_order_parameters_snapshot.package_name_ext
     *
     * @return the value of t_mmall_order_parameters_snapshot.package_name_ext
     *
     * @mbg.generated
     */
    public String getPackageNameExt() {
        return packageNameExt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mmall_order_parameters_snapshot.package_name_ext
     *
     * @param packageNameExt the value for t_mmall_order_parameters_snapshot.package_name_ext
     *
     * @mbg.generated
     */
    public void setPackageNameExt(String packageNameExt) {
        this.packageNameExt = packageNameExt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mmall_order_parameters_snapshot.cps_id
     *
     * @return the value of t_mmall_order_parameters_snapshot.cps_id
     *
     * @mbg.generated
     */
    public String getCpsId() {
        return cpsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mmall_order_parameters_snapshot.cps_id
     *
     * @param cpsId the value for t_mmall_order_parameters_snapshot.cps_id
     *
     * @mbg.generated
     */
    public void setCpsId(String cpsId) {
        this.cpsId = cpsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mmall_order_parameters_snapshot.mac
     *
     * @return the value of t_mmall_order_parameters_snapshot.mac
     *
     * @mbg.generated
     */
    public String getMac() {
        return mac;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mmall_order_parameters_snapshot.mac
     *
     * @param mac the value for t_mmall_order_parameters_snapshot.mac
     *
     * @mbg.generated
     */
    public void setMac(String mac) {
        this.mac = mac;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mmall_order_parameters_snapshot.tx_transmit
     *
     * @return the value of t_mmall_order_parameters_snapshot.tx_transmit
     *
     * @mbg.generated
     */
    public String getTxTransmit() {
        return txTransmit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mmall_order_parameters_snapshot.tx_transmit
     *
     * @param txTransmit the value for t_mmall_order_parameters_snapshot.tx_transmit
     *
     * @mbg.generated
     */
    public void setTxTransmit(String txTransmit) {
        this.txTransmit = txTransmit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mmall_order_parameters_snapshot.user_id
     *
     * @return the value of t_mmall_order_parameters_snapshot.user_id
     *
     * @mbg.generated
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mmall_order_parameters_snapshot.user_id
     *
     * @param userId the value for t_mmall_order_parameters_snapshot.user_id
     *
     * @mbg.generated
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mmall_order_parameters_snapshot.user_name
     *
     * @return the value of t_mmall_order_parameters_snapshot.user_name
     *
     * @mbg.generated
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mmall_order_parameters_snapshot.user_name
     *
     * @param userName the value for t_mmall_order_parameters_snapshot.user_name
     *
     * @mbg.generated
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mmall_order_parameters_snapshot.renew_count
     *
     * @return the value of t_mmall_order_parameters_snapshot.renew_count
     *
     * @mbg.generated
     */
    public Integer getRenewCount() {
        return renewCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mmall_order_parameters_snapshot.renew_count
     *
     * @param renewCount the value for t_mmall_order_parameters_snapshot.renew_count
     *
     * @mbg.generated
     */
    public void setRenewCount(Integer renewCount) {
        this.renewCount = renewCount;
    }
}