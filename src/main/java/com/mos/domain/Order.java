package com.mos.domain;

import java.io.Serializable;

import javax.persistence.*;

import com.mos.domain.DomainEnums.Capacity;
import com.mos.domain.DomainEnums.CommissionType;
import com.mos.domain.DomainEnums.FlowType;
import com.mos.domain.DomainEnums.OrderStatus;
import com.mos.domain.DomainEnums.Side;

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

	private long averagePrcGrpId;

	private long bookId;

	@Enumerated(EnumType.STRING)
	private Capacity capacity;

	private long clientId;

	private BigDecimal commission;

	@Enumerated(EnumType.STRING)
	private CommissionType commissionType;

	private String currency;

	private long exchangeId;

	private String executionCountry;

	private String executionRegion;

	@Enumerated(EnumType.STRING)
	private FlowType flowType;

	private String foOrderRef;

	private BigDecimal frontOfficeComment;

	private String fxDirection;

	private BigDecimal fxRate;

	private long instrumentId;

	private String moComment;

	@Enumerated(EnumType.STRING)
	private OrderStatus orderStatus;

	private long portfolioId;

	private BigDecimal quantity;

	private String salesId;

	private String settleConversion;

	private String settleCurrency;

	private int settleDate;

	@Enumerated(EnumType.STRING)
	private Side side;

	private int tradeDate;

	private String traderId;

	@Column(name="\"VERSION\"")
	private int version;

	public Order() {
	}

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public long getAveragePrcGrpId() {
		return averagePrcGrpId;
	}

	public void setAveragePrcGrpId(long averagePrcGrpId) {
		this.averagePrcGrpId = averagePrcGrpId;
	}

	public long getBookId() {
		return bookId;
	}

	public void setBookId(long bookId) {
		this.bookId = bookId;
	}

	public Capacity getCapacity() {
		return capacity;
	}

	public void setCapacity(Capacity capacity) {
		this.capacity = capacity;
	}

	public long getClientId() {
		return clientId;
	}

	public void setClientId(long clientId) {
		this.clientId = clientId;
	}

	public BigDecimal getCommission() {
		return commission;
	}

	public void setCommission(BigDecimal commission) {
		this.commission = commission;
	}

	public CommissionType getCommissionType() {
		return commissionType;
	}

	public void setCommissionType(CommissionType commissionType) {
		this.commissionType = commissionType;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public long getExchangeId() {
		return exchangeId;
	}

	public void setExchangeId(long exchangeId) {
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

	public FlowType getFlowType() {
		return flowType;
	}

	public void setFlowType(FlowType flowType) {
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

	public long getInstrumentId() {
		return instrumentId;
	}

	public void setInstrumentId(long instrumentId) {
		this.instrumentId = instrumentId;
	}

	public String getMoComment() {
		return moComment;
	}

	public void setMoComment(String moComment) {
		this.moComment = moComment;
	}

	public OrderStatus getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}

	public long getPortfolioId() {
		return portfolioId;
	}

	public void setPortfolioId(long portfolioId) {
		this.portfolioId = portfolioId;
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

	public int getSettleDate() {
		return settleDate;
	}

	public void setSettleDate(int settleDate) {
		this.settleDate = settleDate;
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

	public String getTraderId() {
		return traderId;
	}

	public void setTraderId(String traderId) {
		this.traderId = traderId;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}	
	
}