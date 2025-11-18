package com.jawbonepottery.jawbonebackend.models;

import java.math.BigDecimal;

/**
 * Model class representing a Commission request.
 */
public class Commission {

    private Long id;
    private String name;
    private String email;
    private String phone;
    private Product product;
    private BigDecimal cost;

    public Commission(final String name, final String email, final String phone, final Product product, final BigDecimal cost) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.product = product;
        this.cost = cost;
    }

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(final String phone) {
        this.phone = phone;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(final Product product) {
        this.product = product;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(final BigDecimal cost) {
        this.cost = cost;
    }
}
