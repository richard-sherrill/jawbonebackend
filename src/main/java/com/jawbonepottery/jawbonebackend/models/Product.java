package com.jawbonepottery.jawbonebackend.models;

import java.math.BigDecimal;

/**
 * Model class representing a Product ready to be sold, or Product to be created.
 */
public class Product {

    private Long id;
    private String productType;
    private String productName;
    private String productDescription;
    private BigDecimal productPrice;
    private Boolean doesExist;

    public Product(final String productType, final String productName, final String productDescription, final BigDecimal productPrice, final Boolean doesExist) {
        this.productType = productType;
        this.productName = productName;
        this.productDescription = productDescription;
        this.productPrice = productPrice;
        this.doesExist = doesExist;
    }

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(final String productType) {
        this.productType = productType;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(final String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(final String productDescription) {
        this.productDescription = productDescription;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(final BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public Boolean getDoesExist() {
        return doesExist;
    }

    public void setDoesExist(final Boolean doesExist) {
        this.doesExist = doesExist;
    }
}
