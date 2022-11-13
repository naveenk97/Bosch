package com.bosch.dynamicform.entity;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.*;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "TBL_PRODUCT_CATEGORY")
public class TblProductCategory {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Column(name = "PRODUCT_CATEGORY_ID")
    private String productCategoryId;

    @Column(name = "PARENT_PRODUCT_CATEGORY_ID")
    private String parentProductCategoryId;

    @Column(name = "PRODUCT_CATEGORY_NAME")
    private String productCategoryName;

    @Column(name = "DISPLAY_NAME")
    private String displayName;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "NODE_TYPE")
    private String nodeType;

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

    @ManyToMany(fetch = FetchType.EAGER, cascade = { CascadeType.ALL})
    @JoinTable(name = "tbl_category_attributes", joinColumns = @JoinColumn(name = "product_category_id", referencedColumnName = "product_category_id"), inverseJoinColumns = @JoinColumn(name = "attribute_id", referencedColumnName = "attribute_id"))
    private Set<TblAttribute> tblAttribute = new HashSet<>();

    public String getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(String productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public String getParentProductCategoryId() {
        return parentProductCategoryId;
    }

    public void setParentProductCategoryId(String parentProductCategoryId) {
        this.parentProductCategoryId = parentProductCategoryId;
    }

    public String getProductCategoryName() {
        return productCategoryName;
    }

    public void setProductCategoryName(String productCategoryName) {
        this.productCategoryName = productCategoryName;
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

    public String getNodeType() {
        return nodeType;
    }

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    public Set<TblAttribute> getTblAttribute() {
        return tblAttribute;
    }

    public void setTblAttribute(Set<TblAttribute> tblAttribute) {
        this.tblAttribute = tblAttribute;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean active) {
        isActive = active;
    }


}

