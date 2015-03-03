package com.mos.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the PORTFOLIO database table.
 * 
 */
@Entity
@NamedQuery(name="Portfolio.findAll", query="SELECT p FROM Portfolio p")
public class Portfolio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	//@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="sequencePortfolio")
    //@SequenceGenerator(name="sequencePortfolio", sequenceName="seq_Portfolio", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.TABLE)
	private long portfolioid;

	private String name;

	private int tradedate;

	public Portfolio() {
	}

	public long getPortfolioid() {
		return this.portfolioid;
	}

	public void setPortfolioid(long portfolioid) {
		this.portfolioid = portfolioid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTradedate() {
		return this.tradedate;
	}

	public void setTradedate(int tradedate) {
		this.tradedate = tradedate;
	}

}