package com.bluexiii.microservice.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by bluexiii on 21/06/2017.
 */
@ApiModel("资费")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name = "TF_F_USER_DISCNT", schema = "UCR_CRM6")
public class TfFUserDiscnt {
    private long partitionId;
    private long userId;
    private long userIdA;
    private long productId;
    private long packageId;
    private String specTag;
    private String relationTypeCode;
    private Date startDate;
    private Date endDate;
    private Long itemId;
    private TdBDiscnt discnt;

    @ApiModelProperty(value = "分区标识")
    @Basic
    @Column(name = "PARTITION_ID")
    public long getPartitionId() {
        return partitionId;
    }

    public void setPartitionId(long partitionId) {
        this.partitionId = partitionId;
    }

    @ApiModelProperty(value = "用户标识")
    @Basic
    @Column(name = "USER_ID")
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    @ApiModelProperty(value = "融合用户标识")
    @Basic
    @Column(name = "USER_ID_A")
    public long getUserIdA() {
        return userIdA;
    }

    public void setUserIdA(long userIdA) {
        this.userIdA = userIdA;
    }

    @ApiModelProperty(value = "产品标识")
    @Basic
    @Column(name = "PRODUCT_ID")
    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    @ApiModelProperty(value = "包标识")
    @Basic
    @Column(name = "PACKAGE_ID")
    public long getPackageId() {
        return packageId;
    }

    public void setPackageId(long packageId) {
        this.packageId = packageId;
    }

    @Basic
    @Column(name = "SPEC_TAG")
    public String getSpecTag() {
        return specTag;
    }

    public void setSpecTag(String specTag) {
        this.specTag = specTag;
    }

    @Basic
    @Column(name = "RELATION_TYPE_CODE")
    public String getRelationTypeCode() {
        return relationTypeCode;
    }

    public void setRelationTypeCode(String relationTypeCode) {
        this.relationTypeCode = relationTypeCode;
    }

    @ApiModelProperty(value = "生效时间")
    @Basic
    @Column(name = "START_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @ApiModelProperty(value = "失效时间")
    @Basic
    @Column(name = "END_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @ApiModelProperty(value = "主键")
    @Id
    @Basic
    @Column(name = "ITEM_ID")
    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    @ApiModelProperty(value = "资费详情")
    @OneToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "DISCNT_CODE", unique = true)
    public TdBDiscnt getDiscnt() {
        return discnt;
    }

    public void setDiscnt(TdBDiscnt discnt) {
        this.discnt = discnt;
    }

    @Override
    public String toString() {
        return "TfFUserDiscnt{" +
                "partitionId=" + partitionId +
                ", userId=" + userId +
                ", userIdA=" + userIdA +
                ", productId=" + productId +
                ", packageId=" + packageId +
                ", specTag='" + specTag + '\'' +
                ", relationTypeCode='" + relationTypeCode + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", itemId=" + itemId +
                ", discnt=" + discnt +
                '}';
    }
}
