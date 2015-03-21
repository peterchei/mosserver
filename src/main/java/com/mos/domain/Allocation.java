package com.mos.domain;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

import com.mos.domain.DomainEnums.AllocStatus;
import com.mos.domain.DomainEnums.AllocType;
import com.mos.domain.DomainEnums.CommissionType;
import com.mos.domain.DomainEnums.PaymentMethod;


/**
 * The persistent class for the ALLOCATION database table.
 * 
 */
@Entity
@NamedQuery(name="Allocation.findAll", query="SELECT a FROM Allocation a")
public class Allocation implements Serializable {


	private static final long serialVersionUID = 679979459697236377L;


	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private long allocationId;

	
	private BigDecimal allocationPrice;

	@Enumerated(EnumType.STRING)
	private AllocStatus allocStatus;

	@Enumerated(EnumType.STRING)
	private AllocType allocType;

	private long averagePrcGrpId;

	private BigDecimal averagePrice;

	private String clearingMechanism;

	private long clientSSI;

	private BigDecimal commission;

	private BigDecimal commissionAmount;

	@Enumerated(EnumType.STRING)
	private CommissionType commissionType;

	private long exchangeId;

	private long firmDepo;

	private long instrumentId;

	@Enumerated(EnumType.STRING)
	private PaymentMethod paymentMethod;

	private BigDecimal quantity;

	private int settleDate;

	private long subAccountId;

	private long topAccountId;

	private int tradeDate;

	@Column(name="\"VERSION\"")
	private int version;

	public Allocation() {
	}

	public long getAllocationId() {
		return allocationId;
	}

	public void setAllocationId(long allocationId) {
		this.allocationId = allocationId;
	}

	public BigDecimal getAllocationPrice() {
		return allocationPrice;
	}

	public void setAllocationPrice(BigDecimal allocationPrice) {
		this.allocationPrice = allocationPrice;
	}

	public AllocStatus getAllocStatus() {
		return allocStatus;
	}

	public void setAllocStatus(AllocStatus allocStatus) {
		this.allocStatus = allocStatus;
	}

	public AllocType getAllocType() {
		return allocType;
	}

	public void setAllocType(AllocType allocType) {
		this.allocType = allocType;
	}

	public long getAveragePrcGrpId() {
		return averagePrcGrpId;
	}

	public void setAveragePrcGrpId(long averagePrcGrpId) {
		this.averagePrcGrpId = averagePrcGrpId;
	}

	public BigDecimal getAveragePrice() {
		return averagePrice;
	}

	public void setAveragePrice(BigDecimal averagePrice) {
		this.averagePrice = averagePrice;
	}

	public String getClearingMechanism() {
		return clearingMechanism;
	}

	public void setClearingMechanism(String clearingMechanism) {
		this.clearingMechanism = clearingMechanism;
	}

	public long getClientSSI() {
		return clientSSI;
	}

	public void setClientSSI(long clientSSI) {
		this.clientSSI = clientSSI;
	}

	public BigDecimal getCommission() {
		return commission;
	}

	public void setCommission(BigDecimal commission) {
		this.commission = commission;
	}

	public BigDecimal getCommissionAmount() {
		return commissionAmount;
	}

	public void setCommissionAmount(BigDecimal commissionAmount) {
		this.commissionAmount = commissionAmount;
	}

	public CommissionType getCommissionType() {
		return commissionType;
	}

	public void setCommissionType(CommissionType commissionType) {
		this.commissionType = commissionType;
	}

	public long getExchangeId() {
		return exchangeId;
	}

	public void setExchangeId(long exchangeId) {
		this.exchangeId = exchangeId;
	}

	public long getFirmDepo() {
		return firmDepo;
	}

	public void setFirmDepo(long firmDepo) {
		this.firmDepo = firmDepo;
	}

	public long getInstrumentId() {
		return instrumentId;
	}

	public void setInstrumentId(long instrumentId) {
		this.instrumentId = instrumentId;
	}

	public PaymentMethod getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(PaymentMethod paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public int getSettleDate() {
		return settleDate;
	}

	public void setSettleDate(int settleDate) {
		this.settleDate = settleDate;
	}

	public long getSubAccountId() {
		return subAccountId;
	}

	public void setSubAccountId(long subAccountId) {
		this.subAccountId = subAccountId;
	}

	public long getTopAccountId() {
		return topAccountId;
	}

	public void setTopAccountId(long topAccountId) {
		this.topAccountId = topAccountId;
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