package com.bluexiii.microservice.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModel;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by bluexiii on 21/06/2017.
 */
@ApiModel("用户")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name = "TF_F_USER", schema = "UCR_CRM6")
public class TfFUser {
    private long partitionId;
    private long userId;
    private long custId;
    private long usecustId;
    private String brandCode;
    private long productId;
    private String eparchyCode;
    private String cityCode;
    private String userPasswd;
    private String userDiffCode;
    private String userTypeCode;
    private String serialNumber;
    private String netTypeCode;
    private long scoreValue;
    private long creditClass;
    private long basicCreditValue;
    private long creditValue;
    private String acctTag;
    private String prepayTag;
    private Date inDate;
    private Date openDate;
    private String openMode;
    private String openDepartId;
    private String openStaffId;
    private String inDepartId;
    private String inStaffId;
    private String removeTag;
    private Date destroyTime;
    private String removeEparchyCode;
    private String removeCityCode;
    private String removeDepartId;
    private String removeReasonCode;
    private Date preDestroyTime;
    private Date firstCallTime;
    private Date lastStopTime;
    private String userStateCodeset;
    private String mputeMonthFee;
    private Date mputeDate;
    private Date updateTime;
    private Long assureCustId;
    private String assureTypeCode;
    private Date assureDate;
    private String developStaffId;
    private Date developDate;
    private String developEparchyCode;
    private String developCityCode;
    private String developDepartId;
    private String developNo;
    private String remark;
    private Long creditRuleId;
    private String contractId;
    private Date changeuserDate;
    private String inNetMode;
    private String productTypeCode;
    private Long mainDiscntCode;
    private String productSpec;
    private String provinceCode;

    @Basic
    @Column(name = "PARTITION_ID")
    public long getPartitionId() {
        return partitionId;
    }

    public void setPartitionId(long partitionId) {
        this.partitionId = partitionId;
    }

    @Id
    @Basic
    @Column(name = "USER_ID")
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "CUST_ID")
    public long getCustId() {
        return custId;
    }

    public void setCustId(long custId) {
        this.custId = custId;
    }

    @Basic
    @Column(name = "USECUST_ID")
    public long getUsecustId() {
        return usecustId;
    }

    public void setUsecustId(long usecustId) {
        this.usecustId = usecustId;
    }

    @Basic
    @Column(name = "BRAND_CODE")
    public String getBrandCode() {
        return brandCode;
    }

    public void setBrandCode(String brandCode) {
        this.brandCode = brandCode;
    }

    @Basic
    @Column(name = "PRODUCT_ID")
    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    @Basic
    @Column(name = "EPARCHY_CODE")
    public String getEparchyCode() {
        return eparchyCode;
    }

    public void setEparchyCode(String eparchyCode) {
        this.eparchyCode = eparchyCode;
    }

    @Basic
    @Column(name = "CITY_CODE")
    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    @Basic
    @Column(name = "USER_PASSWD")
    public String getUserPasswd() {
        return userPasswd;
    }

    public void setUserPasswd(String userPasswd) {
        this.userPasswd = userPasswd;
    }

    @Basic
    @Column(name = "USER_DIFF_CODE")
    public String getUserDiffCode() {
        return userDiffCode;
    }

    public void setUserDiffCode(String userDiffCode) {
        this.userDiffCode = userDiffCode;
    }

    @Basic
    @Column(name = "USER_TYPE_CODE")
    public String getUserTypeCode() {
        return userTypeCode;
    }

    public void setUserTypeCode(String userTypeCode) {
        this.userTypeCode = userTypeCode;
    }

    @Basic
    @Column(name = "SERIAL_NUMBER")
    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Basic
    @Column(name = "NET_TYPE_CODE")
    public String getNetTypeCode() {
        return netTypeCode;
    }

    public void setNetTypeCode(String netTypeCode) {
        this.netTypeCode = netTypeCode;
    }

    @Basic
    @Column(name = "SCORE_VALUE")
    public long getScoreValue() {
        return scoreValue;
    }

    public void setScoreValue(long scoreValue) {
        this.scoreValue = scoreValue;
    }

    @Basic
    @Column(name = "CREDIT_CLASS")
    public long getCreditClass() {
        return creditClass;
    }

    public void setCreditClass(long creditClass) {
        this.creditClass = creditClass;
    }

    @Basic
    @Column(name = "BASIC_CREDIT_VALUE")
    public long getBasicCreditValue() {
        return basicCreditValue;
    }

    public void setBasicCreditValue(long basicCreditValue) {
        this.basicCreditValue = basicCreditValue;
    }

    @Basic
    @Column(name = "CREDIT_VALUE")
    public long getCreditValue() {
        return creditValue;
    }

    public void setCreditValue(long creditValue) {
        this.creditValue = creditValue;
    }

    @Basic
    @Column(name = "ACCT_TAG")
    public String getAcctTag() {
        return acctTag;
    }

    public void setAcctTag(String acctTag) {
        this.acctTag = acctTag;
    }

    @Basic
    @Column(name = "PREPAY_TAG")
    public String getPrepayTag() {
        return prepayTag;
    }

    public void setPrepayTag(String prepayTag) {
        this.prepayTag = prepayTag;
    }

    @Basic
    @Column(name = "IN_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public Date getInDate() {
        return inDate;
    }

    public void setInDate(Date inDate) {
        this.inDate = inDate;
    }

    @Basic
    @Column(name = "OPEN_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public Date getOpenDate() {
        return openDate;
    }

    public void setOpenDate(Date openDate) {
        this.openDate = openDate;
    }

    @Basic
    @Column(name = "OPEN_MODE")
    public String getOpenMode() {
        return openMode;
    }

    public void setOpenMode(String openMode) {
        this.openMode = openMode;
    }

    @Basic
    @Column(name = "OPEN_DEPART_ID")
    public String getOpenDepartId() {
        return openDepartId;
    }

    public void setOpenDepartId(String openDepartId) {
        this.openDepartId = openDepartId;
    }

    @Basic
    @Column(name = "OPEN_STAFF_ID")
    public String getOpenStaffId() {
        return openStaffId;
    }

    public void setOpenStaffId(String openStaffId) {
        this.openStaffId = openStaffId;
    }

    @Basic
    @Column(name = "IN_DEPART_ID")
    public String getInDepartId() {
        return inDepartId;
    }

    public void setInDepartId(String inDepartId) {
        this.inDepartId = inDepartId;
    }

    @Basic
    @Column(name = "IN_STAFF_ID")
    public String getInStaffId() {
        return inStaffId;
    }

    public void setInStaffId(String inStaffId) {
        this.inStaffId = inStaffId;
    }

    @Basic
    @Column(name = "REMOVE_TAG")
    public String getRemoveTag() {
        return removeTag;
    }

    public void setRemoveTag(String removeTag) {
        this.removeTag = removeTag;
    }

    @Basic
    @Column(name = "DESTROY_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public Date getDestroyTime() {
        return destroyTime;
    }

    public void setDestroyTime(Date destroyTime) {
        this.destroyTime = destroyTime;
    }

    @Basic
    @Column(name = "REMOVE_EPARCHY_CODE")
    public String getRemoveEparchyCode() {
        return removeEparchyCode;
    }

    public void setRemoveEparchyCode(String removeEparchyCode) {
        this.removeEparchyCode = removeEparchyCode;
    }

    @Basic
    @Column(name = "REMOVE_CITY_CODE")
    public String getRemoveCityCode() {
        return removeCityCode;
    }

    public void setRemoveCityCode(String removeCityCode) {
        this.removeCityCode = removeCityCode;
    }

    @Basic
    @Column(name = "REMOVE_DEPART_ID")
    public String getRemoveDepartId() {
        return removeDepartId;
    }

    public void setRemoveDepartId(String removeDepartId) {
        this.removeDepartId = removeDepartId;
    }

    @Basic
    @Column(name = "REMOVE_REASON_CODE")
    public String getRemoveReasonCode() {
        return removeReasonCode;
    }

    public void setRemoveReasonCode(String removeReasonCode) {
        this.removeReasonCode = removeReasonCode;
    }

    @Basic
    @Column(name = "PRE_DESTROY_TIME")
    public Date getPreDestroyTime() {
        return preDestroyTime;
    }

    public void setPreDestroyTime(Date preDestroyTime) {
        this.preDestroyTime = preDestroyTime;
    }

    @Basic
    @Column(name = "FIRST_CALL_TIME")
    public Date getFirstCallTime() {
        return firstCallTime;
    }

    public void setFirstCallTime(Date firstCallTime) {
        this.firstCallTime = firstCallTime;
    }

    @Basic
    @Column(name = "LAST_STOP_TIME")
    public Date getLastStopTime() {
        return lastStopTime;
    }

    public void setLastStopTime(Date lastStopTime) {
        this.lastStopTime = lastStopTime;
    }

    @Basic
    @Column(name = "USER_STATE_CODESET")
    public String getUserStateCodeset() {
        return userStateCodeset;
    }

    public void setUserStateCodeset(String userStateCodeset) {
        this.userStateCodeset = userStateCodeset;
    }

    @Basic
    @Column(name = "MPUTE_MONTH_FEE")
    public String getMputeMonthFee() {
        return mputeMonthFee;
    }

    public void setMputeMonthFee(String mputeMonthFee) {
        this.mputeMonthFee = mputeMonthFee;
    }

    @Basic
    @Column(name = "MPUTE_DATE")
    public Date getMputeDate() {
        return mputeDate;
    }

    public void setMputeDate(Date mputeDate) {
        this.mputeDate = mputeDate;
    }

    @Basic
    @Column(name = "UPDATE_TIME")
    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Basic
    @Column(name = "ASSURE_CUST_ID")
    public Long getAssureCustId() {
        return assureCustId;
    }

    public void setAssureCustId(Long assureCustId) {
        this.assureCustId = assureCustId;
    }

    @Basic
    @Column(name = "ASSURE_TYPE_CODE")
    public String getAssureTypeCode() {
        return assureTypeCode;
    }

    public void setAssureTypeCode(String assureTypeCode) {
        this.assureTypeCode = assureTypeCode;
    }

    @Basic
    @Column(name = "ASSURE_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public Date getAssureDate() {
        return assureDate;
    }

    public void setAssureDate(Date assureDate) {
        this.assureDate = assureDate;
    }

    @Basic
    @Column(name = "DEVELOP_STAFF_ID")
    public String getDevelopStaffId() {
        return developStaffId;
    }

    public void setDevelopStaffId(String developStaffId) {
        this.developStaffId = developStaffId;
    }

    @Basic
    @Column(name = "DEVELOP_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public Date getDevelopDate() {
        return developDate;
    }

    public void setDevelopDate(Date developDate) {
        this.developDate = developDate;
    }

    @Basic
    @Column(name = "DEVELOP_EPARCHY_CODE")
    public String getDevelopEparchyCode() {
        return developEparchyCode;
    }

    public void setDevelopEparchyCode(String developEparchyCode) {
        this.developEparchyCode = developEparchyCode;
    }

    @Basic
    @Column(name = "DEVELOP_CITY_CODE")
    public String getDevelopCityCode() {
        return developCityCode;
    }

    public void setDevelopCityCode(String developCityCode) {
        this.developCityCode = developCityCode;
    }

    @Basic
    @Column(name = "DEVELOP_DEPART_ID")
    public String getDevelopDepartId() {
        return developDepartId;
    }

    public void setDevelopDepartId(String developDepartId) {
        this.developDepartId = developDepartId;
    }

    @Basic
    @Column(name = "DEVELOP_NO")
    public String getDevelopNo() {
        return developNo;
    }

    public void setDevelopNo(String developNo) {
        this.developNo = developNo;
    }

    @Basic
    @Column(name = "REMARK")
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Basic
    @Column(name = "CREDIT_RULE_ID")
    public Long getCreditRuleId() {
        return creditRuleId;
    }

    public void setCreditRuleId(Long creditRuleId) {
        this.creditRuleId = creditRuleId;
    }

    @Basic
    @Column(name = "CONTRACT_ID")
    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    @Basic
    @Column(name = "CHANGEUSER_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public Date getChangeuserDate() {
        return changeuserDate;
    }

    public void setChangeuserDate(Date changeuserDate) {
        this.changeuserDate = changeuserDate;
    }

    @Basic
    @Column(name = "IN_NET_MODE")
    public String getInNetMode() {
        return inNetMode;
    }

    public void setInNetMode(String inNetMode) {
        this.inNetMode = inNetMode;
    }

    @Basic
    @Column(name = "PRODUCT_TYPE_CODE")
    public String getProductTypeCode() {
        return productTypeCode;
    }

    public void setProductTypeCode(String productTypeCode) {
        this.productTypeCode = productTypeCode;
    }

    @Basic
    @Column(name = "MAIN_DISCNT_CODE")
    public Long getMainDiscntCode() {
        return mainDiscntCode;
    }

    public void setMainDiscntCode(Long mainDiscntCode) {
        this.mainDiscntCode = mainDiscntCode;
    }

    @Basic
    @Column(name = "PRODUCT_SPEC")
    public String getProductSpec() {
        return productSpec;
    }

    public void setProductSpec(String productSpec) {
        this.productSpec = productSpec;
    }

    @Basic
    @Column(name = "PROVINCE_CODE")
    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    @Override
    public String toString() {
        return "TfFUser{" +
                "partitionId=" + partitionId +
                ", userId=" + userId +
                ", custId=" + custId +
                ", usecustId=" + usecustId +
                ", brandCode='" + brandCode + '\'' +
                ", productId=" + productId +
                ", eparchyCode='" + eparchyCode + '\'' +
                ", cityCode='" + cityCode + '\'' +
                ", userDiffCode='" + userDiffCode + '\'' +
                ", userTypeCode='" + userTypeCode + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                ", netTypeCode='" + netTypeCode + '\'' +
                ", scoreValue=" + scoreValue +
                ", creditClass=" + creditClass +
                ", basicCreditValue=" + basicCreditValue +
                ", creditValue=" + creditValue +
                ", acctTag='" + acctTag + '\'' +
                ", prepayTag='" + prepayTag + '\'' +
                ", inDate=" + inDate +
                ", openDate=" + openDate +
                ", openMode='" + openMode + '\'' +
                ", openDepartId='" + openDepartId + '\'' +
                ", openStaffId='" + openStaffId + '\'' +
                ", inDepartId='" + inDepartId + '\'' +
                ", inStaffId='" + inStaffId + '\'' +
                ", removeTag='" + removeTag + '\'' +
                ", destroyTime=" + destroyTime +
                ", removeEparchyCode='" + removeEparchyCode + '\'' +
                ", removeCityCode='" + removeCityCode + '\'' +
                ", removeDepartId='" + removeDepartId + '\'' +
                ", removeReasonCode='" + removeReasonCode + '\'' +
                ", preDestroyTime=" + preDestroyTime +
                ", firstCallTime=" + firstCallTime +
                ", lastStopTime=" + lastStopTime +
                ", userStateCodeset='" + userStateCodeset + '\'' +
                ", mputeMonthFee='" + mputeMonthFee + '\'' +
                ", mputeDate=" + mputeDate +
                ", updateTime=" + updateTime +
                ", assureCustId=" + assureCustId +
                ", assureTypeCode='" + assureTypeCode + '\'' +
                ", assureDate=" + assureDate +
                ", developStaffId='" + developStaffId + '\'' +
                ", developDate=" + developDate +
                ", developEparchyCode='" + developEparchyCode + '\'' +
                ", developCityCode='" + developCityCode + '\'' +
                ", developDepartId='" + developDepartId + '\'' +
                ", developNo='" + developNo + '\'' +
                ", remark='" + remark + '\'' +
                ", creditRuleId=" + creditRuleId +
                ", contractId='" + contractId + '\'' +
                ", changeuserDate=" + changeuserDate +
                ", inNetMode='" + inNetMode + '\'' +
                ", productTypeCode='" + productTypeCode + '\'' +
                ", mainDiscntCode=" + mainDiscntCode +
                ", productSpec='" + productSpec + '\'' +
                ", provinceCode='" + provinceCode + '\'' +
                '}';
    }
}
