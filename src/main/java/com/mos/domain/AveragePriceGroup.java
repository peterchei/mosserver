package com.mos.domain;

import java.io.Serializable;
import javax.persistence.*;
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

	private BigDecimal clientId;

	private BigDecimal exchangeId;

	private String flowType;

	private BigDecimal instrumentId;

	private String mergeKey;

	private BigDecimal quantity;

	private String status;

	private BigDecimal tradeDate;

	@Column(name="\"VERSION\"")
	private BigDecimal version;

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



	public BigDecimal getClientId() {
		return clientId;
	}



	public void setClientId(BigDecimal clientId) {
		this.clientId = clientId;
	}



	public BigDecimal getExchangeId() {
		return exchangeId;
	}



	public void setExchangeId(BigDecimal exchangeId) {
		this.exchangeId = exchangeId;
	}



	public String getFlowType() {
		return flowType;
	}



	public void setFlowType(String flowType) {
		this.flowType = flowType;
	}



	public BigDecimal getInstrumentId() {
		return instrumentId;
	}



	public void setInstrumentId(BigDecimal instrumentId) {
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



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	public BigDecimal getTradeDate() {
		return tradeDate;
	}



	public void setTradeDate(BigDecimal tradeDate) {
		this.tradeDate = tradeDate;
	}



	public BigDecimal getVersion() {
		return this.version;
	}

	public void setVersion(BigDecimal version) {
		this.version = version;
	}

}