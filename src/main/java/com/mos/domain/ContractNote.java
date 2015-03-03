package com.mos.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the CONTRACTNOTE database table.
 * 
 */
@Entity
@NamedQuery(name="ContractNote.findAll", query="SELECT c FROM ContractNote c")
public class ContractNote implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private long id;

	private BigDecimal clienttradeid;

	public ContractNote() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public BigDecimal getClienttradeid() {
		return this.clienttradeid;
	}

	public void setClienttradeid(BigDecimal clienttradeid) {
		this.clienttradeid = clienttradeid;
	}

}