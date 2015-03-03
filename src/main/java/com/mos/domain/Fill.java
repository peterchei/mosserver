package com.mos.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the FILL database table.
 * 
 */
@Entity
@NamedQuery(name="Fill.findAll", query="SELECT f FROM Fill f")
public class Fill implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private long fillid;

	private String capacity;

	private BigDecimal exchangeid;

	private BigDecimal executedshares;

	private Timestamp executiontime;

	private String externalref;

	private BigDecimal instrumentid;

	private String isoffmarket;

	private BigDecimal orderid;

	private BigDecimal price;

	private String side;

	private BigDecimal tradedate;

	@Column(name="\"VERSION\"")
	private BigDecimal version;

	public Fill() {
	}

	public long getFillid() {
		return this.fillid;
	}

	public void setFillid(long fillid) {
		this.fillid = fillid;
	}

	public String getCapacity() {
		return this.capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	public BigDecimal getExchangeid() {
		return this.exchangeid;
	}

	public void setExchangeid(BigDecimal exchangeid) {
		this.exchangeid = exchangeid;
	}

	public BigDecimal getExecutedshares() {
		return this.executedshares;
	}

	public void setExecutedshares(BigDecimal executedshares) {
		this.executedshares = executedshares;
	}

	public Timestamp getExecutiontime() {
		return this.executiontime;
	}

	public void setExecutiontime(Timestamp executiontime) {
		this.executiontime = executiontime;
	}

	public String getExternalref() {
		return this.externalref;
	}

	public void setExternalref(String externalref) {
		this.externalref = externalref;
	}

	public BigDecimal getInstrumentid() {
		return this.instrumentid;
	}

	public void setInstrumentid(BigDecimal instrumentid) {
		this.instrumentid = instrumentid;
	}

	public String getIsoffmarket() {
		return this.isoffmarket;
	}

	public void setIsoffmarket(String isoffmarket) {
		this.isoffmarket = isoffmarket;
	}

	public BigDecimal getOrderid() {
		return this.orderid;
	}

	public void setOrderid(BigDecimal orderid) {
		this.orderid = orderid;
	}

	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getSide() {
		return this.side;
	}

	public void setSide(String side) {
		this.side = side;
	}

	public BigDecimal getTradedate() {
		return this.tradedate;
	}

	public void setTradedate(BigDecimal tradedate) {
		this.tradedate = tradedate;
	}

	public BigDecimal getVersion() {
		return this.version;
	}

	public void setVersion(BigDecimal version) {
		this.version = version;
	}

}