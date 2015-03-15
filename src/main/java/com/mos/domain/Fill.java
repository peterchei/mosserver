package com.mos.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.mos.domain.DomainEnums.Capacity;
import com.mos.domain.DomainEnums.Side;


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
	private long fillId;

	@Enumerated(EnumType.STRING)
	private Capacity capacity;

	private long exchangeId;

	private BigDecimal executedShares;

	@Temporal( TemporalType.TIME)
	private Date executionTime;

	private String externalRef;

	private long instrumentId;

	private boolean isOffMarket;

	private long orderId;

	private BigDecimal price;

	@Enumerated(EnumType.STRING)
	private Side side;

	private int tradeDate;

	@Column(name="\"VERSION\"")
	private int version;

	public Fill() {
	}

	public long getFillId() {
		return fillId;
	}

	public void setFillId(long fillId) {
		this.fillId = fillId;
	}

	public Capacity getCapacity() {
		return capacity;
	}

	public void setCapacity(Capacity capacity) {
		this.capacity = capacity;
	}

	public long getExchangeId() {
		return exchangeId;
	}

	public void setExchangeId(long exchangeId) {
		this.exchangeId = exchangeId;
	}

	public BigDecimal getExecutedShares() {
		return executedShares;
	}

	public void setExecutedShares(BigDecimal executedShares) {
		this.executedShares = executedShares;
	}

	public Date getExecutionTime() {
		return executionTime;
	}

	public void setExecutionTime(Date executionTime) {
		this.executionTime = executionTime;
	}

	public String getExternalRef() {
		return externalRef;
	}

	public void setExternalRef(String externalRef) {
		this.externalRef = externalRef;
	}

	public long getInstrumentId() {
		return instrumentId;
	}

	public void setInstrumentId(long instrumentId) {
		this.instrumentId = instrumentId;
	}

	public boolean getIsOffMarket() {
		return isOffMarket;
	}

	public void setIsOffMarket(boolean isOffMarket) {
		this.isOffMarket = isOffMarket;
	}

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Side getSide() {
		return side;
	}

	public void setSide(Side side) {
		this.side = side;
	}

	public int getTradeDate() {
		return tradeDate;
	}

	public void setTradeDate(int tradeDate) {
		this.tradeDate = tradeDate;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}



}