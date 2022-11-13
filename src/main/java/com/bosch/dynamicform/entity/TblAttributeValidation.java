package com.bosch.dynamicform.entity;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.*;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.util.Date;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-11-11T18:58:13.125+05:30")

@Entity
@Table(name = "TBL_ATTRIBUTE_VALIDATION")
public class TblAttributeValidation {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "ATTRIBUTE_VALIDATION_ID", updatable = false, nullable = false)
    private String attributeValidationId;

    @OneToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "ATTRIBUTE_ID", nullable = false)
    private TblAttribute tblAttribute;

    @Column(name = "ATTRIBUTE_VALIDATION")
    private String attributeValidation;

    @Column(name = "NONEDITABLE_ATTRIBUTEVALIDATION")
    private String nonEditableAttributeValidation;

    @Column(name = "IS_ACTIVE")
    private Boolean isActive;

    @Column(name = "STATE_CHANGE_ON_EDIT")
    private Boolean stateChanegOnEdit;

    @Column(name = "CREATED_BY")
    @CreatedBy
    private String createdBy;

    @Column(name = "CREATED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date createdDate;

    @Column(name = "LAST_MODIFIED_BY")
    @LastModifiedBy
    private String lastModifiedBy;

    @Column(name = "LAST_MODIFIED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    private Date lastModifiedDate;

    public Boolean getStateChanegOnEdit() {
        return stateChanegOnEdit;
    }

    public void setStateChanegOnEdit(Boolean stateChanegOnEdit) {
        this.stateChanegOnEdit = stateChanegOnEdit;
    }

    public String getAttributeValidationId() {
        return attributeValidationId;
    }

    public void setAttributeValidationId(String attributeValidationId) {
        this.attributeValidationId = attributeValidationId;
    }

    public TblAttribute getTblAttribute() {
        return tblAttribute;
    }

    public void setTblAttribute(TblAttribute tblAttribute) {
        this.tblAttribute = tblAttribute;
    }

    public String getAttributeValidation() {
        return attributeValidation;
    }

    public void setAttributeValidation(String attributeValidation) {
        this.attributeValidation = attributeValidation;
    }

    public String getNonEditableAttributeValidation() {
        return nonEditableAttributeValidation;
    }

    public void setNonEditableAttributeValidation(String nonEditableAttributeValidation) {
        this.nonEditableAttributeValidation = nonEditableAttributeValidation;
    }


}

