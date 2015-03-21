package com.mos.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.mos.domain.DomainEnums.EntityType;
import com.mos.domain.DomainEnums.Priority;
import com.mos.domain.DomainEnums.TaskStatus;
import com.mos.domain.DomainEnums.TaskType;

/**
 * The persistent class for the TASK database table.
 * 
 */
@Entity
@NamedQuery(name = "Task.findAll", query = "SELECT t FROM Task t")
public class Task implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5051797379308552026L;

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private long taskId;

	private String assignedGroup;

	private String assignedUser;

	private String comments;

	@Temporal( TemporalType.TIME)
	private Date creationTime;

	private String description;

	@Temporal( TemporalType.TIME)
	private Date modifiedTime;

	private long objectId;

	@Enumerated(EnumType.STRING)
	private EntityType objectType;

	@Enumerated(EnumType.STRING)
	private Priority priority;

	@Enumerated(EnumType.STRING)
	private TaskStatus taskStatus;

	@Enumerated(EnumType.STRING)
	private TaskType taskType;

	private int tradeDate;

	@Column(name = "\"VERSION\"")
	private int version;

	public Task() {
	}

	public long getTaskId() {
		return taskId;
	}

	public void setTaskId(long taskId) {
		this.taskId = taskId;
	}

	public String getAssignedGroup() {
		return assignedGroup;
	}

	public void setAssignedGroup(String assignedGroup) {
		this.assignedGroup = assignedGroup;
	}

	public String getAssignedUser() {
		return assignedUser;
	}

	public void setAssignedUser(String assignedUser) {
		this.assignedUser = assignedUser;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Date getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(Date creationTime) {
		this.creationTime = creationTime;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getModifiedTime() {
		return modifiedTime;
	}

	public void setModifiedTime(Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	public long getObjectId() {
		return objectId;
	}

	public void setObjectId(long objectId) {
		this.objectId = objectId;
	}

	public EntityType getObjectType() {
		return objectType;
	}

	public void setObjectType(EntityType objectType) {
		this.objectType = objectType;
	}

	public Priority getPriority() {
		return priority;
	}

	public void setPriority(Priority priority) {
		this.priority = priority;
	}

	public TaskStatus getTaskStatus() {
		return taskStatus;
	}

	public void setTaskStatus(TaskStatus taskStatus) {
		this.taskStatus = taskStatus;
	}

	public TaskType getTaskType() {
		return taskType;
	}

	public void setTaskType(TaskType taskType) {
		this.taskType = taskType;
	}

	public int getTradeDate() {
		return tradeDate;
	}

	public void setTradeDate(int tradeDate) {
		this.tradeDate = tradeDate;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

}