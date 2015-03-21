package com.mos.refdata.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Instrument {


	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)	
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
