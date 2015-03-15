package com.mos.domain;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;


/**
 * The persistent class for the TRADELEG database table.
 * 
 */
@Entity
@NamedQuery(name="Tradeleg.findAll", query="SELECT t FROM Tradeleg t")
public class Tradeleg implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long tradelegid;

	private BigDecimal accountid;

	private BigDecimal averageprcgrpid;

	private BigDecimal bookid;

	private BigDecimal clienttradeid;

	private BigDecimal orderid;

	@Column(name="\"TYPE\"")
	private String type;

	public Tradeleg() {
	}

	public long getTradelegid() {
		
		return this.tradelegid;
	}

	public void setTradelegid(long tradelegid) {
		this.tradelegid = tradelegid;
	}

	public BigDecimal getAccountid() {
		return this.accountid;
	}

	public void setAccountid(BigDecimal accountid) {
		this.accountid = accountid;
	}

	public BigDecimal getAverageprcgrpid() {
		return this.averageprcgrpid;
	}

	public void setAverageprcgrpid(BigDecimal averageprcgrpid) {
		this.averageprcgrpid = averageprcgrpid;
	}

	public BigDecimal getBookid() {
		return this.bookid;
	}

	public void setBookid(BigDecimal bookid) {
		this.bookid = bookid;
	}

	public BigDecimal getClienttradeid() {
		return this.clienttradeid;
	}

	public void setClienttradeid(BigDecimal clienttradeid) {
		this.clienttradeid = clienttradeid;
	}

	public BigDecimal getOrderid() {
		return this.orderid;
	}

	public void setOrderid(BigDecimal orderid) {
		this.orderid = orderid;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}