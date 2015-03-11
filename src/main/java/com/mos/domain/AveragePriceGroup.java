package com.mos.domain;

import java.io.Serializable;

import javax.persistence.*;

import com.mos.domain.DomainEnums.AVGStatus;
import com.mos.domain.DomainEnums.FlowType;
import com.sun.xml.bind.v2.runtime.RuntimeUtil.ToStringAdapter;

import java.math.BigDecimal;


/**
 * The persistent class for the AVERAGEPRICEGROUP database table.
 * 
 */
@Entity
@NamedQuery(name="AveragePriceGroup.findAll", query="SELECT a FROM AveragePriceGroup a")

public class AveragePriceGroup implements Serializable {
	private static final long serialVersionUID = 1L;
	

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private long averagePrcGrpId;

	private BigDecimal averagePrice;

	private String capacity;

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



	public String getCapacity() {
		return capacity;
	}



	public void setCapacity(String capacity) {
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