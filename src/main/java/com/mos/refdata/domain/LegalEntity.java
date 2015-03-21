package com.mos.refdata.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LegalEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private long legalEntityId;
	private String name;
	private String shortName;
	private String OU;
	private String location;
	private String branch;

}
