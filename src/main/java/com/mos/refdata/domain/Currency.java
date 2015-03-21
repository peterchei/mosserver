package com.mos.refdata.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Currency  implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3025704759012380109L;
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private long id;
	private String name;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
