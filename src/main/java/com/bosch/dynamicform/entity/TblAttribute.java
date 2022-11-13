package com.bosch.dynamicform.entity;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.*;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.util.Date;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-11-11T18:58:13.125+05:30")

@Entity
@Table(name = "TBL_ATTRIBUTE")
public class TblAttribute {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "ATTRIBUTE_ID", updatable = false, nullable = false)
    private String attributeId = null;

    @Column(name = "ATTRIBUTE_NAME")
    private String attributeName;

    @Column(name = "DISPLAY_NAME")
    private String displayName;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "XPATH")
    private String xpath;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "tblAttribute", targetEntity = TblAttributeValidation.class, orphanRemoval = true)
    private TblAttributeValidation tblAttributeValidations;

    @Column(name = "IS_ACTIVE")
    private Boolean isActive;

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

    @Column(name = "JSON_TYPE")
    private String jsonType;

    @Column(name = "IS_ELEMENT_REQUIRED")
    private String isElementRequired;

    @Column(name = "ENCRYPT")
    private boolean encrypt;


    public boolean isEncrypt() {
        return encrypt;
    }

    public void setEncrypt(boolean encrypt) {
        this.encrypt = encrypt;
    }

    public String getAttributeId() {
        return attributeId;
    }

    public void setAttributeId(String attributeId) {
        this.attributeId = attributeId;
    }

    public String getAttributeName() {
        return attributeName;
    }

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getXpath() {
        return xpath;
    }

    public void setXpath(String xpath) {
        this.xpath = xpath;
    }

    public String getIsElementRequired() {
        return isElementRequired;
    }

    public void setIsElementRequired(String isElementRequired) {
        this.isElementRequired = isElementRequired;
    }

    public String getJsonType() {
        return jsonType;
    }

    public void setJsonType(String jsonType) {
        this.jsonType = jsonType;
    }

    public TblAttributeValidation getTblAttributeValidations() {
        return tblAttributeValidations;
    }

    public void setTblAttributeValidations(TblAttributeValidation tblAttributeValidations) {
        this.tblAttributeValidations = tblAttributeValidations;
    }


}