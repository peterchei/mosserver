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
	private long fillId;

	private String capacity;

	private long exchangeId;

	private BigDecimal executedShares;

	private Timestamp executionTime;

	private String externalRef;

	private long instrumentId;

	private String isOffMarket;

	private long orderId;

	private BigDecimal price;

	private String side;

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

	public String getCapacity() {
		return capacity;
	}

	public void setCapacity(String capacity) {
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

	public Timestamp getExecutionTime() {
		return executionTime;
	}

	public void setExecutionTime(Timestamp executionTime) {
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

	public String getIsOffMarket() {
		return isOffMarket;
	}

	public void setIsOffMarket(String isOffMarket) {
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

	public String getSide() {
		return side;
	}

	public void setSide(String side) {
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