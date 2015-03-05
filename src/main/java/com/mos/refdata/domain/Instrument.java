package com.mos.refdata.domain;


public class Instrument {

	public enum Type {
		COM,
		EDG,
		OTC
	}
	
	public enum SubType {
		STK,
		ETF,
		WAR,
		BON,
		NOTE,
		RET
	}
	
	private long instrumentId;
	private long marketId;
	private String currency;	
	private String shortName;
	private String name;
	private String local;
	private String ric;
	private String symbol;
	private String isin;
	private String bloomberg;
	
	
}
