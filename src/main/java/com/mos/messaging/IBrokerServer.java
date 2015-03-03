package com.mos.messaging;

public interface IBrokerServer {

	//refactor from startEmbeddedBroker()
	public void start(String brokerUrl) throws Exception;
	
	//refactor from stopTheRunningBroker()
	public void stop() throws Exception;	

	//refactor from getEnqueuedMessageCountAt()
	public long getMessageCount(String destination);
}
