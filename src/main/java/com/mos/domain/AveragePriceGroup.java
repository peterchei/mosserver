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
	private long averageprcgrpid;

	private BigDecimal averageprice;

	private String capacity;

	private BigDecimal clientid;

	private BigDecimal exchangeid;

	private String flowtype;

	private BigDecimal instrumentid;

	private String mergekey;

	private BigDecimal quantity;

	private String status;

	private BigDecimal tradedate;

	@Column(name="\"VERSION\"")
	private BigDecimal version;

	public AveragePriceGroup() {
	}

	public long getAverageprcgrpid() {
		return this.averageprcgrpid;
	}

	public void setAverageprcgrpid(long averageprcgrpid) {
		this.averageprcgrpid = averageprcgrpid;
	}

	public BigDecimal getAverageprice() {
		return this.averageprice;
	}

	public void setAverageprice(BigDecimal averageprice) {
		this.averageprice = averageprice;
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

	public BigDecimal getExchangeid() {
		return this.exchangeid;
	}

	public void setExchangeid(BigDecimal exchangeid) {
		this.exchangeid = exchangeid;
	}

	public String getFlowtype() {
		return this.flowtype;
	}

	public void setFlowtype(String flowtype) {
		this.flowtype = flowtype;
	}

	public BigDecimal getInstrumentid() {
		return this.instrumentid;
	}

	public void setInstrumentid(BigDecimal instrumentid) {
		this.instrumentid = instrumentid;
	}

	public String getMergekey() {
		return this.mergekey;
	}

	public void setMergekey(String mergekey) {
		this.mergekey = mergekey;
	}

	public BigDecimal getQuantity() {
		return this.quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
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