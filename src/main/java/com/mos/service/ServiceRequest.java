package com.mos.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ServiceRequest {
	
	Set<Long> objectIds;

	public ServiceRequest(long id) {		
		objectIds = new HashSet<Long>(1);
		objectIds.add(id);
	}
		
	public ServiceRequest(long[] id) {
		objectIds = new HashSet<Long>(1);
		for (int i = 0; i < id.length; i++) {
			objectIds.add(id[i]);
		}
	}
	
	public Set<Long> getObjectIds() {		
		return objectIds;
	}
	
	public String getRequestBy() {
		return null;
	}
	
	
}
