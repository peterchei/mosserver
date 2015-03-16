package com.mos.event;

import java.util.Date;


public class Notification {	
	public String name = this.getClass().getSimpleName();
	
	private Date publishDate = new Date();
	public Date getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}
}
