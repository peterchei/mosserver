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

import com.mos.domain.DomainEnums.AVGStatus;
import com.mos.domain.DomainEnums.Capacity;
import com.mos.domain.DomainEnums.FlowType;


/**
 * The persistent class for the AVERAGEPRICEGROUP database table.
 * 
 */
@Entity
@NamedQuery(name="AveragePriceGroup.findAll", query="SELECT a FROM AveragePriceGroup a")

public class AveragePriceGroup implements Serializable {

	private static final long serialVersionUID = -7751759136597709194L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private long averagePrcGrpId;

	private BigDecimal averagePrice;

	@Enumerated(EnumType.STRING)
	private Capacity capacity;

	private long clientId;

	private long exchangeId;

	@Enumerated(EnumType.STRING)
	private FlowType flowType;

	private long instrumentId;

	private String mergeKey;

	private BigDecimal quantity;
	
	@Enumerated(EnumType.STRING)
	private AVGStatus status;

	private int tradeDate;

	@Column(name="\"VERSION\"")
	private int version;

	public AveragePriceGroup() {
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



	public long getExchangeId() {
		return exchangeId;
	}



	public void setExchangeId(long exchangeId) {
		this.exchangeId = exchangeId;
	}



	public FlowType getFlowType() {
		return flowType;
	}



	public void setFlowType(FlowType flowType) {
		this.flowType = flowType;
	}



	public long getInstrumentId() {
		return instrumentId;
	}



	public void setInstrumentId(long instrumentId) {
		this.instrumentId = instrumentId;
	}



	public String getMergeKey() {
		return mergeKey;
	}



	public void setMergeKey(String mergeKey) {
		this.mergeKey = mergeKey;
	}



	public BigDecimal getQuantity() {
		return quantity;
	}



	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}



	public AVGStatus getStatus() {
		return status;
	}



	public void setStatus(AVGStatus status) {
		this.status = status;
	}



	public int getTradeDate() {
		return tradeDate;
	}



	public void setTradeDate(int tradeDate) {
		this.tradeDate = tradeDate;
	}



	public int getVersion() {
		return this.version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

}