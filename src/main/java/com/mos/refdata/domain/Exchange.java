package com.mos.refdata.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Exchange {
	
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private long exchangeId;
	private String name;
	private String shortName;
	private String ricSuffix;
	private String bloombergSuffix;
	private String code;	
	private Country country;

	
	
	

}
