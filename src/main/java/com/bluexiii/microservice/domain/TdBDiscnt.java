package com.bluexiii.microservice.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModel;

import javax.persistence.*;

/**
 * Created by bluexiii on 21/06/2017.
 */
@ApiModel("资费定义")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name = "TD_B_DISCNT", schema = "UCR_CEN1")
public class TdBDiscnt {
    private Long discntCode;
    private String discntName;


    @Id
    @Basic
    @Column(name = "DISCNT_CODE")
    public Long getDiscntCode() {
        return discntCode;
    }

    public void setDiscntCode(Long discntCode) {
        this.discntCode = discntCode;
    }

    @Basic
    @Column(name = "DISCNT_NAME")
    public String getDiscntName() {
        return discntName;
    }

    public void setDiscntName(String discntName) {
        this.discntName = discntName;
    }

    @Override
    public String toString() {
        return "TdBDiscnt{" +
                "discntCode=" + discntCode +
                ", discntName='" + discntName + '\'' +
                '}';
    }
}
