package com.mos.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the CONFIRMATION database table.
 * 
 */
@Entity
@NamedQuery(name="Confirmation.findAll", query="SELECT c FROM Confirmation c")
public class Confirmation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private long confirmationid;

	private BigDecimal bulkid;

	private BigDecimal clienttradeid;

	private String confstatus;

	private BigDecimal isbulk;

	@Column(name="\"VERSION\"")
	private BigDecimal version;

	public Confirmation() {
	}

	public long getConfirmationid() {
		return this.confirmationid;
	}

	public void setConfirmationid(long confirmationid) {
		this.confirmationid = confirmationid;
	}

	public BigDecimal getBulkid() {
		return this.bulkid;
	}

	public void setBulkid(BigDecimal bulkid) {
		this.bulkid = bulkid;
	}

	public BigDecimal getClienttradeid() {
		return this.clienttradeid;
	}

	public void setClienttradeid(BigDecimal clienttradeid) {
		this.clienttradeid = clienttradeid;
	}

	public String getConfstatus() {
		return this.confstatus;
	}

	public void setConfstatus(String confstatus) {
		this.confstatus = confstatus;
	}

	public BigDecimal getIsbulk() {
		return this.isbulk;
	}

	public void setIsbulk(BigDecimal isbulk) {
		this.isbulk = isbulk;
	}

	public BigDecimal getVersion() {
		return this.version;
	}

	public void setVersion(BigDecimal version) {
		this.version = version;
	}

}