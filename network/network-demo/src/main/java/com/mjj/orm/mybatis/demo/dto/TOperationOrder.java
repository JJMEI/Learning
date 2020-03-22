package com.mjj.orm.mybatis.demo.dto;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table t_operation_order
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class TOperationOrder extends BaseEntity {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_operation_order.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     * Database Column Remarks:
     *   订单号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_operation_order.orderNo
     *
     * @mbg.generated
     */
    private String orderno;

    /**
     * Database Column Remarks:
     *   商户号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_operation_order.merchantNo
     *
     * @mbg.generated
     */
    private String merchantno;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_operation_order.appKey
     *
     * @mbg.generated
     */
    private String appkey;

    /**
     * Database Column Remarks:
     *   sku编码
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_operation_order.skuNo
     *
     * @mbg.generated
     */
    private String skuno;

    /**
     * Database Column Remarks:
     *   sku数量
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_operation_order.skuCnt
     *
     * @mbg.generated
     */
    private Integer skucnt;

    /**
     * Database Column Remarks:
     *   订单状态：0-初始 1-已支付 2-已退款 3-支付失败 4-退款中
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_operation_order.status
     *
     * @mbg.generated
     */
    private Integer status;

    /**
     * Database Column Remarks:
     *   产品名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_operation_order.productName
     *
     * @mbg.generated
     */
    private String productname;

    /**
     * Database Column Remarks:
     *   第三方产品ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_operation_order.externalProductId
     *
     * @mbg.generated
     */
    private String externalproductid;

    /**
     * Database Column Remarks:
     *   第三方订单ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_operation_order.externalOrderId
     *
     * @mbg.generated
     */
    private String externalorderid;

    /**
     * Database Column Remarks:
     *   支付订单号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_operation_order.payOrderNo
     *
     * @mbg.generated
     */
    private String payorderno;

    /**
     * Database Column Remarks:
     *   支付平台流水号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_operation_order.payTxNo
     *
     * @mbg.generated
     */
    private String paytxno;

    /**
     * Database Column Remarks:
     *   产品单价
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_operation_order.price
     *
     * @mbg.generated
     */
    private BigDecimal price;

    /**
     * Database Column Remarks:
     *   服务端回调扩展参数
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_operation_order.paramExt
     *
     * @mbg.generated
     */
    private String paramext;

    /**
     * Database Column Remarks:
     *   统计使用
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_operation_order.client
     *
     * @mbg.generated
     */
    private String client;

    /**
     * Database Column Remarks:
     *   产品图片
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_operation_order.productImg
     *
     * @mbg.generated
     */
    private String productimg;

    /**
     * Database Column Remarks:
     *   mac地址
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_operation_order.macAddress
     *
     * @mbg.generated
     */
    private String macaddress;

    /**
     * Database Column Remarks:
     *   统计使用
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_operation_order.clickPath
     *
     * @mbg.generated
     */
    private String clickpath;

    /**
     * Database Column Remarks:
     *   用户ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_operation_order.userId
     *
     * @mbg.generated
     */
    private String userid;

    /**
     * Database Column Remarks:
     *   用户名
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_operation_order.userName
     *
     * @mbg.generated
     */
    private String username;

    /**
     * Database Column Remarks:
     *   扩展参数
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_operation_order.ext
     *
     * @mbg.generated
     */
    private String ext;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_operation_order.createTime
     *
     * @mbg.generated
     */
    private Date createtime;

    /**
     * Database Column Remarks:
     *   支付时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_operation_order.payTime
     *
     * @mbg.generated
     */
    private Date paytime;

    /**
     * Database Column Remarks:
     *   总价格
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_operation_order.totalPrice
     *
     * @mbg.generated
     */
    private BigDecimal totalprice;

    /**
     * Database Column Remarks:
     *   支付渠道
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_operation_order.payChannel
     *
     * @mbg.generated
     */
    private Integer paychannel;

    /**
     * Database Column Remarks:
     *   父支付渠道（支付宝|微信）
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_operation_order.payParentChannel
     *
     * @mbg.generated
     */
    private Integer payparentchannel;

    /**
     * Database Column Remarks:
     *   0:应用类 1:游戏类 2:乐钻 10:大屏专辑 11:大屏视频 12:大屏打包套餐
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_operation_order.businessId
     *
     * @mbg.generated
     */
    private Byte businessid;

    /**
     * Database Column Remarks:
     *   是否是家庭超级会员 0:否 1:是
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_operation_order.svip
     *
     * @mbg.generated
     */
    private Byte svip;

    /**
     * Database Column Remarks:
     *   会员分成价格
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_operation_order.benefitPrice
     *
     * @mbg.generated
     */
    private BigDecimal benefitprice;

    /**
     * Database Column Remarks:
     *   支付业务线ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_operation_order.payBusinessNo
     *
     * @mbg.generated
     */
    private String paybusinessno;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_operation_order.cpsId
     *
     * @mbg.generated
     */
    private String cpsid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_operation_order.packageNameExt
     *
     * @mbg.generated
     */
    private String packagenameext;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_operation_order.id
     *
     * @return the value of t_operation_order.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_operation_order.id
     *
     * @param id the value for t_operation_order.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_operation_order.orderNo
     *
     * @return the value of t_operation_order.orderNo
     *
     * @mbg.generated
     */
    public String getOrderno() {
        return orderno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_operation_order.orderNo
     *
     * @param orderno the value for t_operation_order.orderNo
     *
     * @mbg.generated
     */
    public void setOrderno(String orderno) {
        this.orderno = orderno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_operation_order.merchantNo
     *
     * @return the value of t_operation_order.merchantNo
     *
     * @mbg.generated
     */
    public String getMerchantno() {
        return merchantno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_operation_order.merchantNo
     *
     * @param merchantno the value for t_operation_order.merchantNo
     *
     * @mbg.generated
     */
    public void setMerchantno(String merchantno) {
        this.merchantno = merchantno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_operation_order.appKey
     *
     * @return the value of t_operation_order.appKey
     *
     * @mbg.generated
     */
    public String getAppkey() {
        return appkey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_operation_order.appKey
     *
     * @param appkey the value for t_operation_order.appKey
     *
     * @mbg.generated
     */
    public void setAppkey(String appkey) {
        this.appkey = appkey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_operation_order.skuNo
     *
     * @return the value of t_operation_order.skuNo
     *
     * @mbg.generated
     */
    public String getSkuno() {
        return skuno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_operation_order.skuNo
     *
     * @param skuno the value for t_operation_order.skuNo
     *
     * @mbg.generated
     */
    public void setSkuno(String skuno) {
        this.skuno = skuno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_operation_order.skuCnt
     *
     * @return the value of t_operation_order.skuCnt
     *
     * @mbg.generated
     */
    public Integer getSkucnt() {
        return skucnt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_operation_order.skuCnt
     *
     * @param skucnt the value for t_operation_order.skuCnt
     *
     * @mbg.generated
     */
    public void setSkucnt(Integer skucnt) {
        this.skucnt = skucnt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_operation_order.status
     *
     * @return the value of t_operation_order.status
     *
     * @mbg.generated
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_operation_order.status
     *
     * @param status the value for t_operation_order.status
     *
     * @mbg.generated
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_operation_order.productName
     *
     * @return the value of t_operation_order.productName
     *
     * @mbg.generated
     */
    public String getProductname() {
        return productname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_operation_order.productName
     *
     * @param productname the value for t_operation_order.productName
     *
     * @mbg.generated
     */
    public void setProductname(String productname) {
        this.productname = productname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_operation_order.externalProductId
     *
     * @return the value of t_operation_order.externalProductId
     *
     * @mbg.generated
     */
    public String getExternalproductid() {
        return externalproductid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_operation_order.externalProductId
     *
     * @param externalproductid the value for t_operation_order.externalProductId
     *
     * @mbg.generated
     */
    public void setExternalproductid(String externalproductid) {
        this.externalproductid = externalproductid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_operation_order.externalOrderId
     *
     * @return the value of t_operation_order.externalOrderId
     *
     * @mbg.generated
     */
    public String getExternalorderid() {
        return externalorderid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_operation_order.externalOrderId
     *
     * @param externalorderid the value for t_operation_order.externalOrderId
     *
     * @mbg.generated
     */
    public void setExternalorderid(String externalorderid) {
        this.externalorderid = externalorderid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_operation_order.payOrderNo
     *
     * @return the value of t_operation_order.payOrderNo
     *
     * @mbg.generated
     */
    public String getPayorderno() {
        return payorderno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_operation_order.payOrderNo
     *
     * @param payorderno the value for t_operation_order.payOrderNo
     *
     * @mbg.generated
     */
    public void setPayorderno(String payorderno) {
        this.payorderno = payorderno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_operation_order.payTxNo
     *
     * @return the value of t_operation_order.payTxNo
     *
     * @mbg.generated
     */
    public String getPaytxno() {
        return paytxno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_operation_order.payTxNo
     *
     * @param paytxno the value for t_operation_order.payTxNo
     *
     * @mbg.generated
     */
    public void setPaytxno(String paytxno) {
        this.paytxno = paytxno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_operation_order.price
     *
     * @return the value of t_operation_order.price
     *
     * @mbg.generated
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_operation_order.price
     *
     * @param price the value for t_operation_order.price
     *
     * @mbg.generated
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_operation_order.paramExt
     *
     * @return the value of t_operation_order.paramExt
     *
     * @mbg.generated
     */
    public String getParamext() {
        return paramext;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_operation_order.paramExt
     *
     * @param paramext the value for t_operation_order.paramExt
     *
     * @mbg.generated
     */
    public void setParamext(String paramext) {
        this.paramext = paramext;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_operation_order.client
     *
     * @return the value of t_operation_order.client
     *
     * @mbg.generated
     */
    public String getClient() {
        return client;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_operation_order.client
     *
     * @param client the value for t_operation_order.client
     *
     * @mbg.generated
     */
    public void setClient(String client) {
        this.client = client;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_operation_order.productImg
     *
     * @return the value of t_operation_order.productImg
     *
     * @mbg.generated
     */
    public String getProductimg() {
        return productimg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_operation_order.productImg
     *
     * @param productimg the value for t_operation_order.productImg
     *
     * @mbg.generated
     */
    public void setProductimg(String productimg) {
        this.productimg = productimg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_operation_order.macAddress
     *
     * @return the value of t_operation_order.macAddress
     *
     * @mbg.generated
     */
    public String getMacaddress() {
        return macaddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_operation_order.macAddress
     *
     * @param macaddress the value for t_operation_order.macAddress
     *
     * @mbg.generated
     */
    public void setMacaddress(String macaddress) {
        this.macaddress = macaddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_operation_order.clickPath
     *
     * @return the value of t_operation_order.clickPath
     *
     * @mbg.generated
     */
    public String getClickpath() {
        return clickpath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_operation_order.clickPath
     *
     * @param clickpath the value for t_operation_order.clickPath
     *
     * @mbg.generated
     */
    public void setClickpath(String clickpath) {
        this.clickpath = clickpath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_operation_order.userId
     *
     * @return the value of t_operation_order.userId
     *
     * @mbg.generated
     */
    public String getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_operation_order.userId
     *
     * @param userid the value for t_operation_order.userId
     *
     * @mbg.generated
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_operation_order.userName
     *
     * @return the value of t_operation_order.userName
     *
     * @mbg.generated
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_operation_order.userName
     *
     * @param username the value for t_operation_order.userName
     *
     * @mbg.generated
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_operation_order.ext
     *
     * @return the value of t_operation_order.ext
     *
     * @mbg.generated
     */
    public String getExt() {
        return ext;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_operation_order.ext
     *
     * @param ext the value for t_operation_order.ext
     *
     * @mbg.generated
     */
    public void setExt(String ext) {
        this.ext = ext;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_operation_order.createTime
     *
     * @return the value of t_operation_order.createTime
     *
     * @mbg.generated
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_operation_order.createTime
     *
     * @param createtime the value for t_operation_order.createTime
     *
     * @mbg.generated
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_operation_order.payTime
     *
     * @return the value of t_operation_order.payTime
     *
     * @mbg.generated
     */
    public Date getPaytime() {
        return paytime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_operation_order.payTime
     *
     * @param paytime the value for t_operation_order.payTime
     *
     * @mbg.generated
     */
    public void setPaytime(Date paytime) {
        this.paytime = paytime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_operation_order.totalPrice
     *
     * @return the value of t_operation_order.totalPrice
     *
     * @mbg.generated
     */
    public BigDecimal getTotalprice() {
        return totalprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_operation_order.totalPrice
     *
     * @param totalprice the value for t_operation_order.totalPrice
     *
     * @mbg.generated
     */
    public void setTotalprice(BigDecimal totalprice) {
        this.totalprice = totalprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_operation_order.payChannel
     *
     * @return the value of t_operation_order.payChannel
     *
     * @mbg.generated
     */
    public Integer getPaychannel() {
        return paychannel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_operation_order.payChannel
     *
     * @param paychannel the value for t_operation_order.payChannel
     *
     * @mbg.generated
     */
    public void setPaychannel(Integer paychannel) {
        this.paychannel = paychannel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_operation_order.payParentChannel
     *
     * @return the value of t_operation_order.payParentChannel
     *
     * @mbg.generated
     */
    public Integer getPayparentchannel() {
        return payparentchannel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_operation_order.payParentChannel
     *
     * @param payparentchannel the value for t_operation_order.payParentChannel
     *
     * @mbg.generated
     */
    public void setPayparentchannel(Integer payparentchannel) {
        this.payparentchannel = payparentchannel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_operation_order.businessId
     *
     * @return the value of t_operation_order.businessId
     *
     * @mbg.generated
     */
    public Byte getBusinessid() {
        return businessid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_operation_order.businessId
     *
     * @param businessid the value for t_operation_order.businessId
     *
     * @mbg.generated
     */
    public void setBusinessid(Byte businessid) {
        this.businessid = businessid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_operation_order.svip
     *
     * @return the value of t_operation_order.svip
     *
     * @mbg.generated
     */
    public Byte getSvip() {
        return svip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_operation_order.svip
     *
     * @param svip the value for t_operation_order.svip
     *
     * @mbg.generated
     */
    public void setSvip(Byte svip) {
        this.svip = svip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_operation_order.benefitPrice
     *
     * @return the value of t_operation_order.benefitPrice
     *
     * @mbg.generated
     */
    public BigDecimal getBenefitprice() {
        return benefitprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_operation_order.benefitPrice
     *
     * @param benefitprice the value for t_operation_order.benefitPrice
     *
     * @mbg.generated
     */
    public void setBenefitprice(BigDecimal benefitprice) {
        this.benefitprice = benefitprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_operation_order.payBusinessNo
     *
     * @return the value of t_operation_order.payBusinessNo
     *
     * @mbg.generated
     */
    public String getPaybusinessno() {
        return paybusinessno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_operation_order.payBusinessNo
     *
     * @param paybusinessno the value for t_operation_order.payBusinessNo
     *
     * @mbg.generated
     */
    public void setPaybusinessno(String paybusinessno) {
        this.paybusinessno = paybusinessno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_operation_order.cpsId
     *
     * @return the value of t_operation_order.cpsId
     *
     * @mbg.generated
     */
    public String getCpsid() {
        return cpsid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_operation_order.cpsId
     *
     * @param cpsid the value for t_operation_order.cpsId
     *
     * @mbg.generated
     */
    public void setCpsid(String cpsid) {
        this.cpsid = cpsid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_operation_order.packageNameExt
     *
     * @return the value of t_operation_order.packageNameExt
     *
     * @mbg.generated
     */
    public String getPackagenameext() {
        return packagenameext;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_operation_order.packageNameExt
     *
     * @param packagenameext the value for t_operation_order.packageNameExt
     *
     * @mbg.generated
     */
    public void setPackagenameext(String packagenameext) {
        this.packagenameext = packagenameext;
    }
}