package com.mos.refdata.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Instrument  implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3344225255808305427L;
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private long instrumentId;
	private long exchangeId;
	private long marketId;
	private String currency;
	private String shortName;
	private String name;
	private String local;
	private String ric;
	private String symbol;
	private String isin;
	private String bloomberg;

	public long getInstrumentId() {
		return instrumentId;
	}

	public void setInstrumentId(long instrumentId) {
		this.instrumentId = instrumentId;
	}

	public long getExchangeId() {
		return exchangeId;
	}

	public void setExchangeId(long exchangeId) {
		this.exchangeId = exchangeId;
	}

	public long getMarketId() {
		return marketId;
	}

	public void setMarketId(long marketId) {
		this.marketId = marketId;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getRic() {
		return ric;
	}

	public void setRic(String ric) {
		this.ric = ric;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getIsin() {
		return isin;
	}

	public void setIsin(String isin) {
		this.isin = isin;
	}

	public String getBloomberg() {
		return bloomberg;
	}

	public void setBloomberg(String bloomberg) {
		this.bloomberg = bloomberg;
	}

}
