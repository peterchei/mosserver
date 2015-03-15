package com.mos.domain;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;


/**
 * The persistent class for the BULKCONF database table.
 * 
 */
@Entity
@NamedQuery(name="BulkConf.findAll", query="SELECT b FROM BulkConf b")
public class BulkConf implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private long bulkid;

	private String bulktype;

	private BigDecimal clientid;

	private String confstatus;

	private BigDecimal exchangeid;

	private String executioncountry;

	private String executionregion;

	@Column(name="\"VERSION\"")
	private BigDecimal version;

	public BulkConf() {
	}

	public long getBulkid() {
		return this.bulkid;
	}

	public void setBulkid(long bulkid) {
		this.bulkid = bulkid;
	}

	public String getBulktype() {
		return this.bulktype;
	}

	public void setBulktype(String bulktype) {
		this.bulktype = bulktype;
	}

	public BigDecimal getClientid() {
		return this.clientid;
	}

	public void setClientid(BigDecimal clientid) {
		this.clientid = clientid;
	}

	public String getConfstatus() {
		return this.confstatus;
	}

	public void setConfstatus(String confstatus) {
		this.confstatus = confstatus;
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

	public BigDecimal getVersion() {
		return this.version;
	}

	public void setVersion(BigDecimal version) {
		this.version = version;
	}

}