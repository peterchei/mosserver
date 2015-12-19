package com.mos.domain;

import javax.persistence.*;
import java.io.Serializable;


/**
 * The persistent class for the PORTFOLIO database table.
 */
@Entity
@NamedQuery(name = "Portfolio.findAll", query = "SELECT p FROM Portfolio p")
public class Portfolio implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 7932027908293157522L;

    @Id
    //@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="sequencePortfolio")
    //@SequenceGenerator(name="sequencePortfolio", sequenceName="seq_Portfolio", allocationSize=1)
    @GeneratedValue(strategy = GenerationType.TABLE)
    private long portfolioId;

    private String name;

    private int tradeDate;

    public Portfolio() {
    }

    public long getPortfolioid() {
        return this.portfolioId;
    }

    public void setPortfolioid(long portfolioId) {
        this.portfolioId = portfolioId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTradeDate() {
        return this.tradeDate;
    }

    public void setTradeDate(int tradeDate) {
        this.tradeDate = tradeDate;
    }

}