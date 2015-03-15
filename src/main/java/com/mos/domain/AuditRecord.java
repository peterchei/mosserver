package com.mos.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQuery;


/**
 * The persistent class for the AUDITRECORD database table.
 * 
 */
@Entity
@NamedQuery(name="AuditRecord.findAll", query="SELECT a FROM AuditRecord a")
public class AuditRecord implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private long auditid;

	private String actor;

	private String description;

	private Timestamp entereddatetime;

	private String isdeleted;

	@Lob
	@Column(name="\"OBJECT\"")
	private String object;

	private BigDecimal objectid;

	private String objecttype;

	public AuditRecord() {
	}

	public long getAuditid() {
		return this.auditid;
	}

	public void setAuditid(long auditid) {
		this.auditid = auditid;
	}

	public String getActor() {
		return this.actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Timestamp getEntereddatetime() {
		return this.entereddatetime;
	}

	public void setEntereddatetime(Timestamp entereddatetime) {
		this.entereddatetime = entereddatetime;
	}

	public String getIsdeleted() {
		return this.isdeleted;
	}

	public void setIsdeleted(String isdeleted) {
		this.isdeleted = isdeleted;
	}

	public String getObject() {
		return this.object;
	}

	public void setObject(String object) {
		this.object = object;
	}

	public BigDecimal getObjectid() {
		return this.objectid;
	}

	public void setObjectid(BigDecimal objectid) {
		this.objectid = objectid;
	}

	public String getObjecttype() {
		return this.objecttype;
	}

	public void setObjecttype(String objecttype) {
		this.objecttype = objecttype;
	}

}