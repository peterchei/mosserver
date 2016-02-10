package com.mos.domain;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;


/**
 * The persistent class for the CONTRACTNOTE database table.
 *
 */
@Entity
@NamedQuery(name="ContractNote.findAll", query="SELECT c FROM ContractNote c")
public class ContractNote implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4175897997601817799L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private long id;

	private long clientTradeId;

	public ContractNote() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getClientTradeId() {
		return this.clientTradeId;
	}

	public void setClientTradeId(long clientTradeId) {
		this.clientTradeId = clientTradeId;
	}

}