package com.mos.refdata.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Exchange  implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5523509049730463172L;
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private long exchangeId;
	private String name;
	private String shortName;
	private String ricSuffix;
	private String bloombergSuffix;
	private String code;
	private Country country;

	public long getExchangeId() {
		return exchangeId;
	}

	public void setExchangeId(long exchangeId) {
		this.exchangeId = exchangeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getRicSuffix() {
		return ricSuffix;
	}

	public void setRicSuffix(String ricSuffix) {
		this.ricSuffix = ricSuffix;
	}

	public String getBloombergSuffix() {
		return bloombergSuffix;
	}

	public void setBloombergSuffix(String bloombergSuffix) {
		this.bloombergSuffix = bloombergSuffix;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

}
