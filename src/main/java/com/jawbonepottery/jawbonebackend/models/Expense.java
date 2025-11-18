package com.jawbonepottery.jawbonebackend.models;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Model class representing an Expense.
 */
public class Expense {

    private Long id;
    private String expenseType; // e.g., "Clay", "Glaze", "Tools", "Shipping", "Vendor Item" etc.
    private String description;
    private BigDecimal cost;
    private String storeName;
    private Date purchaseDate;

    public Expense(final String expenseType, final String description, final BigDecimal cost, final String storeName, final Date purchaseDate) {
        this.expenseType = expenseType;
        this.description = description;
        this.cost = cost;
        this.storeName = storeName;
        this.purchaseDate = purchaseDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getExpenseType() {
        return expenseType;
    }

    public void setExpenseType(final String expenseType) {
        this.expenseType = expenseType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(final BigDecimal cost) {
        this.cost = cost;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(final String storeName) {
        this.storeName = storeName;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(final Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }
}
