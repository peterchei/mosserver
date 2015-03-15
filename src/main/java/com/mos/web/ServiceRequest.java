package com.mos.web;


public class ServiceRequest {
	
	private long objectIds[];

	public ServiceRequest(long id) {		
		objectIds = new long[1];
		objectIds[0] = id;
	}
		
	public ServiceRequest(long[] id) {
		objectIds = id;
	}
	
	public long[] getObjectIds() {		
		return objectIds;
	}
	
	public String getRequestBy() {
		return "ProtoType";
	}
	
	
}
