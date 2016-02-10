package com.mos.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;


/**
 * The persistent class for the CONFIRMATION database table.
 * 
 */
@Entity
@NamedQuery(name="Confirmation.findAll", query="SELECT c FROM Confirmation c")
public class Confirmation implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7869092351776071683L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private long confirmationId;

	private long bulkId;

	private long clientTradeId;

	private DomainEnums.ConfStatus confStatus;

	private boolean isBulk;

	@Column(name="\"VERSION\"")
	private int version;

	public Confirmation() {
	}

	public long getConfirmationId() {
		return this.confirmationId;
	}

	public void setConfirmationId(long confirmationId) {
		this.confirmationId = confirmationId;
	}

	public long getBulkId() {
		return this.bulkId;
	}

	public void setBulkId(long bulkId) {
		this.bulkId = bulkId;
	}

	public long getClientTradeId() {
		return this.clientTradeId;
	}

	public void setClientTradeId(long clientTradeId) {
		this.clientTradeId = clientTradeId;
	}

	public DomainEnums.ConfStatus getConfStatus() {
		return this.confStatus;
	}

	public void setConfStatus(DomainEnums.ConfStatus confStatus) {
		this.confStatus = confStatus;
	}

	public boolean getBulk() {
		return this.isBulk;
	}

	public void setBulk(boolean bulk) {
		this.isBulk = bulk;
	}

	public int getVersion() {
		return this.version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

}