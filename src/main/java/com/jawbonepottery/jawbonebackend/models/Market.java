package com.jawbonepottery.jawbonebackend.models;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Model class representing a Market/Event.
 */
public class Market {

    private Long id;
    private String name;
    private Date startDate;
    private Date endDate;
    private BigDecimal cost;
    private String description;

    public Market(final String name, final Date startDate, final Date endDate, final BigDecimal cost, final String description) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.cost = cost;
        this.description = description;
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

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(final Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(final Date endDate) {
        this.endDate = endDate;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(final BigDecimal cost) {
        this.cost = cost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }
}
