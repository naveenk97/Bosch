package com.bosch.dynamicform.entity;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.Id;

import javax.persistence.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-11-11T18:58:13.125+05:30")

@Entity
@Table(name = "TBL_CATEGORY_ATTRIBUTES")
public class TblCategoryAttribute {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Column(name = "CATEGORY_ATTRIBUTE_ID")
    private String categoryAttributeId;

    @OneToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "ATTRIBUTE_ID", nullable = false)
    @Column(name = "ATTRIBUTE_ID")
    private TblAttribute attributeId;

    @OneToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "PRODUCT_CATEGORY_ID", nullable = false)
    @Column(name = "PRODUCT_CATEGORY_ID")
    private TblProductCategory productCategoryId;
    
    @Column(name = "IS_ACTIVE")
    private Boolean isActive;

}
