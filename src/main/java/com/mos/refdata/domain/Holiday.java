package com.mos.refdata.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Holiday {

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private long id;
	
	private int date;
	private long marketId;

	/*
	 * Date in yyyyMMdd format
	 */
	public int getDate() {
		return date;
	}

}
