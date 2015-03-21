package com.mos.refdata.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Holiday  implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7579693835593825057L;


	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private long id;

	private int date;
	private long marketId;

	/*
	 * Date in yyyyMMdd format
	 */
	public int getDate() {
		return date;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getMarketId() {
		return marketId;
	}

	public void setMarketId(long marketId) {
		this.marketId = marketId;
	}

	public void setDate(int date) {
		this.date = date;
	}

}
