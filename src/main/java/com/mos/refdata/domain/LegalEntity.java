package com.mos.refdata.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LegalEntity  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -340106084339538141L;
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private long legalEntityId;
	private String name;
	private String shortName;
	private String OU;
	private String location;
	private String branch;

	public long getLegalEntityId() {
		return legalEntityId;
	}

	public void setLegalEntityId(long legalEntityId) {
		this.legalEntityId = legalEntityId;
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

	public String getOU() {
		return OU;
	}

	public void setOU(String oU) {
		OU = oU;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

}
