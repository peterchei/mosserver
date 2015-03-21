package com.mos.refdata.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Country {

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private long id;
	private String isoCode;
	private String name;
	private String shortName;
	private String currency;
	public String getIsoCode() {
		return isoCode;
	}
	public void setIsoCode(String isoCode) {
		this.isoCode = isoCode;
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
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	
}
