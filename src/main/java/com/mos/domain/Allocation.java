package com.mos.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the ALLOCATION database table.
 * 
 */
@Entity
@NamedQuery(name="Allocation.findAll", query="SELECT a FROM Allocation a")
public class Allocation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private long allocationid;

	private BigDecimal allocationprice;

	private String allocstatus;

	private String alloctype;

	private BigDecimal averageprcgrpid;

	private BigDecimal averageprice;

	private String clearingmechanism;

	private BigDecimal clientssi;

	private BigDecimal commission;

	private BigDecimal commissionamount;

	private String commissiontype;

	private BigDecimal exchangeid;

	private BigDecimal firmdepo;

	private BigDecimal instrumentid;

	private String paymentmethod;

	private BigDecimal quantity;

	private BigDecimal settledate;

	private BigDecimal subaccountid;

	private BigDecimal topaccountid;

	private BigDecimal tradedate;

	@Column(name="\"VERSION\"")
	private BigDecimal version;

	public Allocation() {
	}

	public long getAllocationid() {
		return this.allocationid;
	}

	public void setAllocationid(long allocationid) {
		this.allocationid = allocationid;
	}

	public BigDecimal getAllocationprice() {
		return this.allocationprice;
	}

	public void setAllocationprice(BigDecimal allocationprice) {
		this.allocationprice = allocationprice;
	}

	public String getAllocstatus() {
		return this.allocstatus;
	}

	public void setAllocstatus(String allocstatus) {
		this.allocstatus = allocstatus;
	}

	public String getAlloctype() {
		return this.alloctype;
	}

	public void setAlloctype(String alloctype) {
		this.alloctype = alloctype;
	}

	public BigDecimal getAverageprcgrpid() {
		return this.averageprcgrpid;
	}

	public void setAverageprcgrpid(BigDecimal averageprcgrpid) {
		this.averageprcgrpid = averageprcgrpid;
	}

	public BigDecimal getAverageprice() {
		return this.averageprice;
	}

	public void setAverageprice(BigDecimal averageprice) {
		this.averageprice = averageprice;
	}

	public String getClearingmechanism() {
		return this.clearingmechanism;
	}

	public void setClearingmechanism(String clearingmechanism) {
		this.clearingmechanism = clearingmechanism;
	}

	public BigDecimal getClientssi() {
		return this.clientssi;
	}

	public void setClientssi(BigDecimal clientssi) {
		this.clientssi = clientssi;
	}

	public BigDecimal getCommission() {
		return this.commission;
	}

	public void setCommission(BigDecimal commission) {
		this.commission = commission;
	}

	public BigDecimal getCommissionamount() {
		return this.commissionamount;
	}

	public void setCommissionamount(BigDecimal commissionamount) {
		this.commissionamount = commissionamount;
	}

	public String getCommissiontype() {
		return this.commissiontype;
	}

	public void setCommissiontype(String commissiontype) {
		this.commissiontype = commissiontype;
	}

	public BigDecimal getExchangeid() {
		return this.exchangeid;
	}

	public void setExchangeid(BigDecimal exchangeid) {
		this.exchangeid = exchangeid;
	}

	public BigDecimal getFirmdepo() {
		return this.firmdepo;
	}

	public void setFirmdepo(BigDecimal firmdepo) {
		this.firmdepo = firmdepo;
	}

	public BigDecimal getInstrumentid() {
		return this.instrumentid;
	}

	public void setInstrumentid(BigDecimal instrumentid) {
		this.instrumentid = instrumentid;
	}

	public String getPaymentmethod() {
		return this.paymentmethod;
	}

	public void setPaymentmethod(String paymentmethod) {
		this.paymentmethod = paymentmethod;
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

	public BigDecimal getSubaccountid() {
		return this.subaccountid;
	}

	public void setSubaccountid(BigDecimal subaccountid) {
		this.subaccountid = subaccountid;
	}

	public BigDecimal getTopaccountid() {
		return this.topaccountid;
	}

	public void setTopaccountid(BigDecimal topaccountid) {
		this.topaccountid = topaccountid;
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