package com.mos.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;


/**
 * The persistent class for the BACKOFFICENOTIFICATION database table.
 * 
 */
@Entity
@NamedQuery(name="BackOfficeNotification.findAll", query="SELECT b FROM BackOfficeNotification b")
public class BackOfficeNotification implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 513601364855782311L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private long id;

	private String backOfficeId;

	public BackOfficeNotification() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getBackOfficeId() {
		return backOfficeId;
	}

	public void setBackOfficeId(String backOfficeId) {
		this.backOfficeId = backOfficeId;
	}
}