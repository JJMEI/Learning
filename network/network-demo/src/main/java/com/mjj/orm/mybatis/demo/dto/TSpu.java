package com.mjj.orm.mybatis.demo.dto;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table t_spu
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class TSpu extends BaseEntity {
    /**
     * Database Column Remarks:
     *   自增ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_spu.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * Database Column Remarks:
     *   支付后活动URL
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_spu.activity_url
     *
     * @mbg.generated
     */
    private String activityUrl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_spu.cashier_template_id
     *
     * @mbg.generated
     */
    private Integer cashierTemplateId;

    /**
     * Database Column Remarks:
     *   SPU编码（唯一）
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_spu.spu_no
     *
     * @mbg.generated
     */
    private String spuNo;

    /**
     * Database Column Remarks:
     *   SPU名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_spu.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     * Database Column Remarks:
     *   SPU标题
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_spu.title
     *
     * @mbg.generated
     */
    private String title;

    /**
     * Database Column Remarks:
     *   SPU价格，只做展示
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_spu.price
     *
     * @mbg.generated
     */
    private BigDecimal price;

    /**
     * Database Column Remarks:
     *   1级品类ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_spu.category_id_1
     *
     * @mbg.generated
     */
    private Long categoryId1;

    /**
     * Database Column Remarks:
     *   2级品类ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_spu.category_id_2
     *
     * @mbg.generated
     */
    private Long categoryId2;

    /**
     * Database Column Remarks:
     *   3级品类ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_spu.category_id_3
     *
     * @mbg.generated
     */
    private Long categoryId3;

    /**
     * Database Column Remarks:
     *   直接所属品类ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_spu.category_id
     *
     * @mbg.generated
     */
    private Long categoryId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_spu.sale_time_start
     *
     * @mbg.generated
     */
    private Date saleTimeStart;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_spu.sale_time_end
     *
     * @mbg.generated
     */
    private Date saleTimeEnd;

    /**
     * Database Column Remarks:
     *   是否是虚拟商品（1虚拟2实物）
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_spu.is_virtual
     *
     * @mbg.generated
     */
    private Byte isVirtual;

    /**
     * Database Column Remarks:
     *   是否含实物附赠品（1不含2包含）
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_spu.is_entity_bundle
     *
     * @mbg.generated
     */
    private Byte isEntityBundle;

    /**
     * Database Column Remarks:
     *   实物附赠品领取二维码地址
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_spu.qrcode_url
     *
     * @mbg.generated
     */
    private String qrcodeUrl;

    /**
     * Database Column Remarks:
     *   上架标识(1下架2上架)
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_spu.is_online
     *
     * @mbg.generated
     */
    private Byte isOnline;

    /**
     * Database Column Remarks:
     *   是否有销售属性(1无2有)
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_spu.is_sale_attribute
     *
     * @mbg.generated
     */
    private Byte isSaleAttribute;

    /**
     * Database Column Remarks:
     *   销售平台（第一位代表国广，第二位代表华数）
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_spu.sale_platform
     *
     * @mbg.generated
     */
    private String salePlatform;

    /**
     * Database Column Remarks:
     *   最小购买数量
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_spu.min_purchase_cnt
     *
     * @mbg.generated
     */
    private Integer minPurchaseCnt;

    /**
     * Database Column Remarks:
     *   是否支持优惠券(1不支持2支持)
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_spu.is_coupon
     *
     * @mbg.generated
     */
    private Byte isCoupon;

    /**
     * Database Column Remarks:
     *   最大购买数量
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_spu.max_purchase_cnt
     *
     * @mbg.generated
     */
    private Integer maxPurchaseCnt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_spu.img_urls
     *
     * @mbg.generated
     */
    private String imgUrls;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_spu.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     * Database Column Remarks:
     *   修改时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_spu.modify_time
     *
     * @mbg.generated
     */
    private Date modifyTime;

    /**
     * Database Column Remarks:
     *   创建人
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_spu.create_user
     *
     * @mbg.generated
     */
    private String createUser;

    /**
     * Database Column Remarks:
     *   修改人
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_spu.modify_user
     *
     * @mbg.generated
     */
    private String modifyUser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_spu.business_id
     *
     * @mbg.generated
     */
    private String businessId;

    /**
     * Database Column Remarks:
     *   品类目录
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_spu.path_tree
     *
     * @mbg.generated
     */
    private String pathTree;

    /**
     * Database Column Remarks:
     *   预计下线时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_spu.planed_off_line_date
     *
     * @mbg.generated
     */
    private Date planedOffLineDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_spu.test_time
     *
     * @mbg.generated
     */
    private String testTime;

    /**
     * Database Column Remarks:
     *   是否分屏 0不分屏 1分屏 默认使用分屏0
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_spu.is_split_screen
     *
     * @mbg.generated
     */
    private Integer isSplitScreen;

    /**
     * Database Column Remarks:
     *   是否分割
     *   0 不分割
     *   1 分割
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_spu.is_segmentation
     *
     * @mbg.generated
     */
    private Integer isSegmentation;

    /**
     * Database Column Remarks:
     *   新收银台图片上传
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_spu.img_urls_cashier
     *
     * @mbg.generated
     */
    private String imgUrlsCashier;

    /**
     * Database Column Remarks:
     *   商品描述
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_spu.description
     *
     * @mbg.generated
     */
    private String description;

    /**
     * Database Column Remarks:
     *   温馨提示
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_spu.warm_tip
     *
     * @mbg.generated
     */
    private String warmTip;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_spu.id
     *
     * @return the value of t_spu.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_spu.id
     *
     * @param id the value for t_spu.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_spu.activity_url
     *
     * @return the value of t_spu.activity_url
     *
     * @mbg.generated
     */
    public String getActivityUrl() {
        return activityUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_spu.activity_url
     *
     * @param activityUrl the value for t_spu.activity_url
     *
     * @mbg.generated
     */
    public void setActivityUrl(String activityUrl) {
        this.activityUrl = activityUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_spu.cashier_template_id
     *
     * @return the value of t_spu.cashier_template_id
     *
     * @mbg.generated
     */
    public Integer getCashierTemplateId() {
        return cashierTemplateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_spu.cashier_template_id
     *
     * @param cashierTemplateId the value for t_spu.cashier_template_id
     *
     * @mbg.generated
     */
    public void setCashierTemplateId(Integer cashierTemplateId) {
        this.cashierTemplateId = cashierTemplateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_spu.spu_no
     *
     * @return the value of t_spu.spu_no
     *
     * @mbg.generated
     */
    public String getSpuNo() {
        return spuNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_spu.spu_no
     *
     * @param spuNo the value for t_spu.spu_no
     *
     * @mbg.generated
     */
    public void setSpuNo(String spuNo) {
        this.spuNo = spuNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_spu.name
     *
     * @return the value of t_spu.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_spu.name
     *
     * @param name the value for t_spu.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_spu.title
     *
     * @return the value of t_spu.title
     *
     * @mbg.generated
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_spu.title
     *
     * @param title the value for t_spu.title
     *
     * @mbg.generated
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_spu.price
     *
     * @return the value of t_spu.price
     *
     * @mbg.generated
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_spu.price
     *
     * @param price the value for t_spu.price
     *
     * @mbg.generated
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_spu.category_id_1
     *
     * @return the value of t_spu.category_id_1
     *
     * @mbg.generated
     */
    public Long getCategoryId1() {
        return categoryId1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_spu.category_id_1
     *
     * @param categoryId1 the value for t_spu.category_id_1
     *
     * @mbg.generated
     */
    public void setCategoryId1(Long categoryId1) {
        this.categoryId1 = categoryId1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_spu.category_id_2
     *
     * @return the value of t_spu.category_id_2
     *
     * @mbg.generated
     */
    public Long getCategoryId2() {
        return categoryId2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_spu.category_id_2
     *
     * @param categoryId2 the value for t_spu.category_id_2
     *
     * @mbg.generated
     */
    public void setCategoryId2(Long categoryId2) {
        this.categoryId2 = categoryId2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_spu.category_id_3
     *
     * @return the value of t_spu.category_id_3
     *
     * @mbg.generated
     */
    public Long getCategoryId3() {
        return categoryId3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_spu.category_id_3
     *
     * @param categoryId3 the value for t_spu.category_id_3
     *
     * @mbg.generated
     */
    public void setCategoryId3(Long categoryId3) {
        this.categoryId3 = categoryId3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_spu.category_id
     *
     * @return the value of t_spu.category_id
     *
     * @mbg.generated
     */
    public Long getCategoryId() {
        return categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_spu.category_id
     *
     * @param categoryId the value for t_spu.category_id
     *
     * @mbg.generated
     */
    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_spu.sale_time_start
     *
     * @return the value of t_spu.sale_time_start
     *
     * @mbg.generated
     */
    public Date getSaleTimeStart() {
        return saleTimeStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_spu.sale_time_start
     *
     * @param saleTimeStart the value for t_spu.sale_time_start
     *
     * @mbg.generated
     */
    public void setSaleTimeStart(Date saleTimeStart) {
        this.saleTimeStart = saleTimeStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_spu.sale_time_end
     *
     * @return the value of t_spu.sale_time_end
     *
     * @mbg.generated
     */
    public Date getSaleTimeEnd() {
        return saleTimeEnd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_spu.sale_time_end
     *
     * @param saleTimeEnd the value for t_spu.sale_time_end
     *
     * @mbg.generated
     */
    public void setSaleTimeEnd(Date saleTimeEnd) {
        this.saleTimeEnd = saleTimeEnd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_spu.is_virtual
     *
     * @return the value of t_spu.is_virtual
     *
     * @mbg.generated
     */
    public Byte getIsVirtual() {
        return isVirtual;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_spu.is_virtual
     *
     * @param isVirtual the value for t_spu.is_virtual
     *
     * @mbg.generated
     */
    public void setIsVirtual(Byte isVirtual) {
        this.isVirtual = isVirtual;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_spu.is_entity_bundle
     *
     * @return the value of t_spu.is_entity_bundle
     *
     * @mbg.generated
     */
    public Byte getIsEntityBundle() {
        return isEntityBundle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_spu.is_entity_bundle
     *
     * @param isEntityBundle the value for t_spu.is_entity_bundle
     *
     * @mbg.generated
     */
    public void setIsEntityBundle(Byte isEntityBundle) {
        this.isEntityBundle = isEntityBundle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_spu.qrcode_url
     *
     * @return the value of t_spu.qrcode_url
     *
     * @mbg.generated
     */
    public String getQrcodeUrl() {
        return qrcodeUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_spu.qrcode_url
     *
     * @param qrcodeUrl the value for t_spu.qrcode_url
     *
     * @mbg.generated
     */
    public void setQrcodeUrl(String qrcodeUrl) {
        this.qrcodeUrl = qrcodeUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_spu.is_online
     *
     * @return the value of t_spu.is_online
     *
     * @mbg.generated
     */
    public Byte getIsOnline() {
        return isOnline;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_spu.is_online
     *
     * @param isOnline the value for t_spu.is_online
     *
     * @mbg.generated
     */
    public void setIsOnline(Byte isOnline) {
        this.isOnline = isOnline;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_spu.is_sale_attribute
     *
     * @return the value of t_spu.is_sale_attribute
     *
     * @mbg.generated
     */
    public Byte getIsSaleAttribute() {
        return isSaleAttribute;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_spu.is_sale_attribute
     *
     * @param isSaleAttribute the value for t_spu.is_sale_attribute
     *
     * @mbg.generated
     */
    public void setIsSaleAttribute(Byte isSaleAttribute) {
        this.isSaleAttribute = isSaleAttribute;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_spu.sale_platform
     *
     * @return the value of t_spu.sale_platform
     *
     * @mbg.generated
     */
    public String getSalePlatform() {
        return salePlatform;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_spu.sale_platform
     *
     * @param salePlatform the value for t_spu.sale_platform
     *
     * @mbg.generated
     */
    public void setSalePlatform(String salePlatform) {
        this.salePlatform = salePlatform;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_spu.min_purchase_cnt
     *
     * @return the value of t_spu.min_purchase_cnt
     *
     * @mbg.generated
     */
    public Integer getMinPurchaseCnt() {
        return minPurchaseCnt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_spu.min_purchase_cnt
     *
     * @param minPurchaseCnt the value for t_spu.min_purchase_cnt
     *
     * @mbg.generated
     */
    public void setMinPurchaseCnt(Integer minPurchaseCnt) {
        this.minPurchaseCnt = minPurchaseCnt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_spu.is_coupon
     *
     * @return the value of t_spu.is_coupon
     *
     * @mbg.generated
     */
    public Byte getIsCoupon() {
        return isCoupon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_spu.is_coupon
     *
     * @param isCoupon the value for t_spu.is_coupon
     *
     * @mbg.generated
     */
    public void setIsCoupon(Byte isCoupon) {
        this.isCoupon = isCoupon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_spu.max_purchase_cnt
     *
     * @return the value of t_spu.max_purchase_cnt
     *
     * @mbg.generated
     */
    public Integer getMaxPurchaseCnt() {
        return maxPurchaseCnt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_spu.max_purchase_cnt
     *
     * @param maxPurchaseCnt the value for t_spu.max_purchase_cnt
     *
     * @mbg.generated
     */
    public void setMaxPurchaseCnt(Integer maxPurchaseCnt) {
        this.maxPurchaseCnt = maxPurchaseCnt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_spu.img_urls
     *
     * @return the value of t_spu.img_urls
     *
     * @mbg.generated
     */
    public String getImgUrls() {
        return imgUrls;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_spu.img_urls
     *
     * @param imgUrls the value for t_spu.img_urls
     *
     * @mbg.generated
     */
    public void setImgUrls(String imgUrls) {
        this.imgUrls = imgUrls;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_spu.create_time
     *
     * @return the value of t_spu.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_spu.create_time
     *
     * @param createTime the value for t_spu.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_spu.modify_time
     *
     * @return the value of t_spu.modify_time
     *
     * @mbg.generated
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_spu.modify_time
     *
     * @param modifyTime the value for t_spu.modify_time
     *
     * @mbg.generated
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_spu.create_user
     *
     * @return the value of t_spu.create_user
     *
     * @mbg.generated
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_spu.create_user
     *
     * @param createUser the value for t_spu.create_user
     *
     * @mbg.generated
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_spu.modify_user
     *
     * @return the value of t_spu.modify_user
     *
     * @mbg.generated
     */
    public String getModifyUser() {
        return modifyUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_spu.modify_user
     *
     * @param modifyUser the value for t_spu.modify_user
     *
     * @mbg.generated
     */
    public void setModifyUser(String modifyUser) {
        this.modifyUser = modifyUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_spu.business_id
     *
     * @return the value of t_spu.business_id
     *
     * @mbg.generated
     */
    public String getBusinessId() {
        return businessId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_spu.business_id
     *
     * @param businessId the value for t_spu.business_id
     *
     * @mbg.generated
     */
    public void setBusinessId(String businessId) {
        this.businessId = businessId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_spu.path_tree
     *
     * @return the value of t_spu.path_tree
     *
     * @mbg.generated
     */
    public String getPathTree() {
        return pathTree;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_spu.path_tree
     *
     * @param pathTree the value for t_spu.path_tree
     *
     * @mbg.generated
     */
    public void setPathTree(String pathTree) {
        this.pathTree = pathTree;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_spu.planed_off_line_date
     *
     * @return the value of t_spu.planed_off_line_date
     *
     * @mbg.generated
     */
    public Date getPlanedOffLineDate() {
        return planedOffLineDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_spu.planed_off_line_date
     *
     * @param planedOffLineDate the value for t_spu.planed_off_line_date
     *
     * @mbg.generated
     */
    public void setPlanedOffLineDate(Date planedOffLineDate) {
        this.planedOffLineDate = planedOffLineDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_spu.test_time
     *
     * @return the value of t_spu.test_time
     *
     * @mbg.generated
     */
    public String getTestTime() {
        return testTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_spu.test_time
     *
     * @param testTime the value for t_spu.test_time
     *
     * @mbg.generated
     */
    public void setTestTime(String testTime) {
        this.testTime = testTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_spu.is_split_screen
     *
     * @return the value of t_spu.is_split_screen
     *
     * @mbg.generated
     */
    public Integer getIsSplitScreen() {
        return isSplitScreen;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_spu.is_split_screen
     *
     * @param isSplitScreen the value for t_spu.is_split_screen
     *
     * @mbg.generated
     */
    public void setIsSplitScreen(Integer isSplitScreen) {
        this.isSplitScreen = isSplitScreen;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_spu.is_segmentation
     *
     * @return the value of t_spu.is_segmentation
     *
     * @mbg.generated
     */
    public Integer getIsSegmentation() {
        return isSegmentation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_spu.is_segmentation
     *
     * @param isSegmentation the value for t_spu.is_segmentation
     *
     * @mbg.generated
     */
    public void setIsSegmentation(Integer isSegmentation) {
        this.isSegmentation = isSegmentation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_spu.img_urls_cashier
     *
     * @return the value of t_spu.img_urls_cashier
     *
     * @mbg.generated
     */
    public String getImgUrlsCashier() {
        return imgUrlsCashier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_spu.img_urls_cashier
     *
     * @param imgUrlsCashier the value for t_spu.img_urls_cashier
     *
     * @mbg.generated
     */
    public void setImgUrlsCashier(String imgUrlsCashier) {
        this.imgUrlsCashier = imgUrlsCashier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_spu.description
     *
     * @return the value of t_spu.description
     *
     * @mbg.generated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_spu.description
     *
     * @param description the value for t_spu.description
     *
     * @mbg.generated
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_spu.warm_tip
     *
     * @return the value of t_spu.warm_tip
     *
     * @mbg.generated
     */
    public String getWarmTip() {
        return warmTip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_spu.warm_tip
     *
     * @param warmTip the value for t_spu.warm_tip
     *
     * @mbg.generated
     */
    public void setWarmTip(String warmTip) {
        this.warmTip = warmTip;
    }
}