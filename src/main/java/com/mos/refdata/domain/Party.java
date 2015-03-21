package com.mos.refdata.domain;

import java.io.Serializable;

import com.mos.domain.DomainEnums.ClientRegion;
import com.mos.refdata.domain.RefEnums.AccountType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Party   implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4431764729478601982L;
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private long partyId;
	private long name;
	private long shortName;
	private ClientRegion clientRegion;
	private Country clientCountry;
	private AccountType accountType;

	public long getPartyId() {
		return partyId;
	}

	public void setPartyId(long partyId) {
		this.partyId = partyId;
	}

	public long getName() {
		return name;
	}

	public void setName(long name) {
		this.name = name;
	}

	public long getShortName() {
		return shortName;
	}

	public void setShortName(long shortName) {
		this.shortName = shortName;
	}

	public ClientRegion getClientRegion() {
		return clientRegion;
	}

	public void setClientRegion(ClientRegion clientRegion) {
		this.clientRegion = clientRegion;
	}

	public Country getClientCountry() {
		return clientCountry;
	}

	public void setClientCountry(Country clientCountry) {
		this.clientCountry = clientCountry;
	}

	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

}
