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

	private static final long serialVersionUID = 5331184101641231940L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private long id;

	private String actor;

	private String description;

	private Timestamp creationDateTime;

	private String isDeleted;

	@Lob
	@Column(name="\"OBJECT\"")
	private String object;

	private BigDecimal objectId;

	private String objectType;

	public AuditRecord() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
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

	public Timestamp getCreationDateTime() {
		return this.creationDateTime;
	}

	public void setCreationDateTime(Timestamp creationDateTime) {
		this.creationDateTime = creationDateTime;
	}

	public String getIsDeleted() {
		return this.isDeleted;
	}

	public void setIsDeleted(String isDeleted) {
		this.isDeleted = isDeleted;
	}

	public String getObject() {
		return this.object;
	}

	public void setObject(String object) {
		this.object = object;
	}

	public BigDecimal getObjectId() {
		return this.objectId;
	}

	public void setObjectIdd(BigDecimal objectId) {
		this.objectId = objectId;
	}

	public String getObjectType() {
		return this.objectType;
	}

	public void setObjectType(String objectType) {
		this.objectType = objectType;
	}

}