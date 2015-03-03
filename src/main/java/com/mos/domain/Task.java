package com.mos.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the TASK database table.
 * 
 */
@Entity
@NamedQuery(name="Task.findAll", query="SELECT t FROM Task t")
public class Task implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private long taskid;

	private BigDecimal assignedgroup;

	private BigDecimal assigneduser;

	private String comments;

	private Timestamp creationtime;

	private String description;

	private Timestamp modifiedtime;

	private BigDecimal objectid;

	private String objecttype;

	private String priority;

	private String taskstatus;

	private String tasktype;

	private BigDecimal tradedate;

	@Column(name="\"VERSION\"")
	private BigDecimal version;

	public Task() {
	}

	public long getTaskid() {
		return this.taskid;
	}

	public void setTaskid(long taskid) {
		this.taskid = taskid;
	}

	public BigDecimal getAssignedgroup() {
		return this.assignedgroup;
	}

	public void setAssignedgroup(BigDecimal assignedgroup) {
		this.assignedgroup = assignedgroup;
	}

	public BigDecimal getAssigneduser() {
		return this.assigneduser;
	}

	public void setAssigneduser(BigDecimal assigneduser) {
		this.assigneduser = assigneduser;
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Timestamp getCreationtime() {
		return this.creationtime;
	}

	public void setCreationtime(Timestamp creationtime) {
		this.creationtime = creationtime;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Timestamp getModifiedtime() {
		return this.modifiedtime;
	}

	public void setModifiedtime(Timestamp modifiedtime) {
		this.modifiedtime = modifiedtime;
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

	public String getPriority() {
		return this.priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getTaskstatus() {
		return this.taskstatus;
	}

	public void setTaskstatus(String taskstatus) {
		this.taskstatus = taskstatus;
	}

	public String getTasktype() {
		return this.tasktype;
	}

	public void setTasktype(String tasktype) {
		this.tasktype = tasktype;
	}

	public BigDecimal getTradedate() {
		return this.tradedate;
	}

	public void setTradedate(BigDecimal tradedate) {
		this.tradedate = tradedate;
	}

	public BigDecimal getVersion() {
		return this.version;
	}

	public void setVersion(BigDecimal version) {
		this.version = version;
	}

}