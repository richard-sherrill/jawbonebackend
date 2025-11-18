package com.jawbonepottery.jawbonebackend.models;

import java.math.BigDecimal;

/**
 * Model class representing an Inventory item.
 */
public class Inventory {

    private Long id;
    private Product product;
    private BigDecimal price;

    public Inventory(final Product product, final BigDecimal price) {
        this.product = product;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(final Product product) {
        this.product = product;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(final BigDecimal price) {
        this.price = price;
    }
}
