package com.mos.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the CLIENTTRADE database table.
 * 
 */
@Entity
@NamedQuery(name="ClientTrade.findAll", query="SELECT c FROM ClientTrade c")
public class ClientTrade implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private long clienttradeid;

	private BigDecimal allocationid;

	private String bookingstatus;

	private String bookingsuppress;

	private String confirmsuppress;

	private String confstatus;

	private String ctmstatus;

	private BigDecimal exchangeid;

	private BigDecimal instrumentid;

	private BigDecimal quantity;

	private BigDecimal settledate;

	private BigDecimal tradedate;

	@Column(name="\"VERSION\"")
	private BigDecimal version;

	public ClientTrade() {
	}

	public long getClienttradeid() {
		return this.clienttradeid;
	}

	public void setClienttradeid(long clienttradeid) {
		this.clienttradeid = clienttradeid;
	}

	public BigDecimal getAllocationid() {
		return this.allocationid;
	}

	public void setAllocationid(BigDecimal allocationid) {
		this.allocationid = allocationid;
	}

	public String getBookingstatus() {
		return this.bookingstatus;
	}

	public void setBookingstatus(String bookingstatus) {
		this.bookingstatus = bookingstatus;
	}

	public String getBookingsuppress() {
		return this.bookingsuppress;
	}

	public void setBookingsuppress(String bookingsuppress) {
		this.bookingsuppress = bookingsuppress;
	}

	public String getConfirmsuppress() {
		return this.confirmsuppress;
	}

	public void setConfirmsuppress(String confirmsuppress) {
		this.confirmsuppress = confirmsuppress;
	}

	public String getConfstatus() {
		return this.confstatus;
	}

	public void setConfstatus(String confstatus) {
		this.confstatus = confstatus;
	}

	public String getCtmstatus() {
		return this.ctmstatus;
	}

	public void setCtmstatus(String ctmstatus) {
		this.ctmstatus = ctmstatus;
	}

	public BigDecimal getExchangeid() {
		return this.exchangeid;
	}

	public void setExchangeid(BigDecimal exchangeid) {
		this.exchangeid = exchangeid;
	}

	public BigDecimal getInstrumentid() {
		return this.instrumentid;
	}

	public void setInstrumentid(BigDecimal instrumentid) {
		this.instrumentid = instrumentid;
	}

	public BigDecimal getQuantity() {
		return this.quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getSettledate() {
		return this.settledate;
	}

	public void setSettledate(BigDecimal settledate) {
		this.settledate = settledate;
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