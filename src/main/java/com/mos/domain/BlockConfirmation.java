package com.mos.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the BLOCKCONFIRMATION database table.
 * 
 */
@Entity
@NamedQuery(name="BlockConfirmation.findAll", query="SELECT b FROM BlockConfirmation b")
public class BlockConfirmation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private long id;

	private java.math.BigDecimal allocationid;

	public BlockConfirmation() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public java.math.BigDecimal getAllocationid() {
		return this.allocationid;
	}

	public void setAllocationid(java.math.BigDecimal allocationid) {
		this.allocationid = allocationid;
	}

}