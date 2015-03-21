package com.mos.refdata.domain;

import com.mos.domain.DomainEnums.ClientRegion;
import com.mos.refdata.domain.RefEnums.AccountType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Party {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private long partyId;
	private long name;
	private long shortName;
	private ClientRegion clientRegion;
	private Country clientCountry;
	private AccountType accountType;

}
