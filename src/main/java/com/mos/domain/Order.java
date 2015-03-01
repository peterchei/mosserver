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
	private long orderid;

	private BigDecimal averageprcgrpid;

	private BigDecimal bookid;

	private String capacity;

	private BigDecimal clientid;

	private BigDecimal commission;

	private String commissiontype;

	private String currency;

	private BigDecimal exchangeid;

	private String executioncountry;

	private String executionregion;

	private String flowtype;

	private String foorderref;

	private BigDecimal frontofficecomment;

	private String fxdirection;

	private BigDecimal fxrate;

	private BigDecimal instrumentid;

	private String mocomment;

	private String orderstatus;

	private BigDecimal portfolioid;

	private BigDecimal quantity;

	private String salesid;

	private String settleconversion;

	private String settlecurrency;

	private BigDecimal settledate;

	private String side;

	private BigDecimal tradedate;

	private String traderid;

	@Column(name="\"VERSION\"")
	private BigDecimal version;

	public Order() {
	}

	public long getOrderid() {
		return this.orderid;
	}

	public void setOrderid(long orderid) {
		this.orderid = orderid;
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

	public String getCapacity() {
		return this.capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	public BigDecimal getClientid() {
		return this.clientid;
	}

	public void setClientid(BigDecimal clientid) {
		this.clientid = clientid;
	}

	public BigDecimal getCommission() {
		return this.commission;
	}

	public void setCommission(BigDecimal commission) {
		this.commission = commission;
	}

	public String getCommissiontype() {
		return this.commissiontype;
	}

	public void setCommissiontype(String commissiontype) {
		this.commissiontype = commissiontype;
	}

	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public BigDecimal getExchangeid() {
		return this.exchangeid;
	}

	public void setExchangeid(BigDecimal exchangeid) {
		this.exchangeid = exchangeid;
	}

	public String getExecutioncountry() {
		return this.executioncountry;
	}

	public void setExecutioncountry(String executioncountry) {
		this.executioncountry = executioncountry;
	}

	public String getExecutionregion() {
		return this.executionregion;
	}

	public void setExecutionregion(String executionregion) {
		this.executionregion = executionregion;
	}

	public String getFlowtype() {
		return this.flowtype;
	}

	public void setFlowtype(String flowtype) {
		this.flowtype = flowtype;
	}

	public String getFoorderref() {
		return this.foorderref;
	}

	public void setFoorderref(String foorderref) {
		this.foorderref = foorderref;
	}

	public BigDecimal getFrontofficecomment() {
		return this.frontofficecomment;
	}

	public void setFrontofficecomment(BigDecimal frontofficecomment) {
		this.frontofficecomment = frontofficecomment;
	}

	public String getFxdirection() {
		return this.fxdirection;
	}

	public void setFxdirection(String fxdirection) {
		this.fxdirection = fxdirection;
	}

	public BigDecimal getFxrate() {
		return this.fxrate;
	}

	public void setFxrate(BigDecimal fxrate) {
		this.fxrate = fxrate;
	}

	public BigDecimal getInstrumentid() {
		return this.instrumentid;
	}

	public void setInstrumentid(BigDecimal instrumentid) {
		this.instrumentid = instrumentid;
	}

	public String getMocomment() {
		return this.mocomment;
	}

	public void setMocomment(String mocomment) {
		this.mocomment = mocomment;
	}

	public String getOrderstatus() {
		return this.orderstatus;
	}

	public void setOrderstatus(String orderstatus) {
		this.orderstatus = orderstatus;
	}

	public BigDecimal getPortfolioid() {
		return this.portfolioid;
	}

	public void setPortfolioid(BigDecimal portfolioid) {
		this.portfolioid = portfolioid;
	}

	public BigDecimal getQuantity() {
		return this.quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public String getSalesid() {
		return this.salesid;
	}

	public void setSalesid(String salesid) {
		this.salesid = salesid;
	}

	public String getSettleconversion() {
		return this.settleconversion;
	}

	public void setSettleconversion(String settleconversion) {
		this.settleconversion = settleconversion;
	}

	public String getSettlecurrency() {
		return this.settlecurrency;
	}

	public void setSettlecurrency(String settlecurrency) {
		this.settlecurrency = settlecurrency;
	}

	public BigDecimal getSettledate() {
		return this.settledate;
	}

	public void setSettledate(BigDecimal settledate) {
		this.settledate = settledate;
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

	public String getTraderid() {
		return this.traderid;
	}

	public void setTraderid(String traderid) {
		this.traderid = traderid;
	}

	public BigDecimal getVersion() {
		return this.version;
	}

	public void setVersion(BigDecimal version) {
		this.version = version;
	}

}