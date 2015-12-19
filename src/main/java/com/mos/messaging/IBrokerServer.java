package com.mos.messaging;

/**
 * Embedded messaging service
 *  
 * @author peter
 *
 */
public interface IBrokerServer {

	public void start(String brokerUrl) throws Exception;
	
	public void stop() throws Exception;

	public long getMessageCount(String destination);
}
