package com.mos.refdata.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Market {
	
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private long marketId;
	private String name;
	private String shortName;
	private String country;
	
	
	

}
