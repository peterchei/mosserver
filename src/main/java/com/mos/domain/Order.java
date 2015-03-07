package com.mos.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the ORDERS database table.
 * 
 */
@Entity
@Table(name="ORDERS")
@NamedQuery(name="Order.findAll", query="SELECT o FROM Order o")
public class Order implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private long orderId;

	private BigDecimal averagePrcGrpId;

	private BigDecimal bookId;

	private String capacity;

	private BigDecimal clientId;

	private BigDecimal commission;

	private String commissionType;

	private String currency;

	private BigDecimal exchangeId;

	private String executionCountry;

	private String executionRegion;

	private String flowType;

	private String foOrderRef;

	private BigDecimal frontOfficeComment;

	private String fxDirection;

	private BigDecimal fxRate;

	private BigDecimal instrumentId;

	private String moComment;

	private String orderStatus;

	private BigDecimal portfolioId;

	private BigDecimal quantity;

	private String salesId;

	private String settleConversion;

	private String settleCurrency;

	private BigDecimal settleDate;

	private String side;

	private BigDecimal tradeDate;

	private String traderId;

	@Column(name="\"VERSION\"")
	private BigDecimal version;

	public Order() {
	}

	public BigDecimal getAveragePrcGrpId() {
		return averagePrcGrpId;
	}

	public void setAveragePrcGrpId(BigDecimal averagePrcGrpId) {
		this.averagePrcGrpId = averagePrcGrpId;
	}

	public BigDecimal getBookId() {
		return bookId;
	}

	public void setBookId(BigDecimal bookId) {
		this.bookId = bookId;
	}

	public String getCapacity() {
		return capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	public BigDecimal getClientId() {
		return clientId;
	}

	public void setClientId(BigDecimal clientId) {
		this.clientId = clientId;
	}

	public BigDecimal getCommission() {
		return commission;
	}

	public void setCommission(BigDecimal commission) {
		this.commission = commission;
	}

	public String getCommissionType() {
		return commissionType;
	}

	public void setCommissionType(String commissionType) {
		this.commissionType = commissionType;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public BigDecimal getExchangeId() {
		return exchangeId;
	}

	public void setExchangeId(BigDecimal exchangeId) {
		this.exchangeId = exchangeId;
	}

	public String getExecutionCountry() {
		return executionCountry;
	}

	public void setExecutionCountry(String executionCountry) {
		this.executionCountry = executionCountry;
	}

	public String getExecutionRegion() {
		return executionRegion;
	}

	public void setExecutionRegion(String executionRegion) {
		this.executionRegion = executionRegion;
	}

	public String getFlowType() {
		return flowType;
	}

	public void setFlowType(String flowType) {
		this.flowType = flowType;
	}

	public String getFoOrderRef() {
		return foOrderRef;
	}

	public void setFoOrderRef(String foOrderRef) {
		this.foOrderRef = foOrderRef;
	}

	public BigDecimal getFrontOfficeComment() {
		return frontOfficeComment;
	}

	public void setFrontOfficeComment(BigDecimal frontOfficeComment) {
		this.frontOfficeComment = frontOfficeComment;
	}

	public String getFxDirection() {
		return fxDirection;
	}

	public void setFxDirection(String fxDirection) {
		this.fxDirection = fxDirection;
	}

	public BigDecimal getFxRate() {
		return fxRate;
	}

	public void setFxRate(BigDecimal fxRate) {
		this.fxRate = fxRate;
	}

	public BigDecimal getInstrumentId() {
		return instrumentId;
	}

	public void setInstrumentId(BigDecimal instrumentId) {
		this.instrumentId = instrumentId;
	}

	public String getMoComment() {
		return moComment;
	}

	public void setMoComment(String moComment) {
		this.moComment = moComment;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public BigDecimal getPortfolioId() {
		return portfolioId;
	}

	public void setPortfolioId(BigDecimal protfolioId) {
		this.portfolioId = protfolioId;
	}

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public String getSalesId() {
		return salesId;
	}

	public void setSalesId(String salesId) {
		this.salesId = salesId;
	}

	public String getSettleConversion() {
		return settleConversion;
	}

	public void setSettleConversion(String settleConversion) {
		this.settleConversion = settleConversion;
	}

	public String getSettleCurrency() {
		return settleCurrency;
	}

	public void setSettleCurrency(String settleCurrency) {
		this.settleCurrency = settleCurrency;
	}

	public BigDecimal getSettleDate() {
		return settleDate;
	}

	public void setSettleDate(BigDecimal settleDate) {
		this.settleDate = settleDate;
	}

	public String getSide() {
		return side;
	}

	public void setSide(String side) {
		this.side = side;
	}

	public BigDecimal getTradeDate() {
		return tradeDate;
	}

	public void setTradeDate(BigDecimal tradeDate) {
		this.tradeDate = tradeDate;
	}

	public String getTraderId() {
		return traderId;
	}

	public void setTraderId(String traderId) {
		this.traderId = traderId;
	}

	public BigDecimal getVersion() {
		return version;
	}

	public void setVersion(BigDecimal version) {
		this.version = version;
	}

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	
	
	
}