package com.mos.messaging;

/**
 * BrokerService Factory interface to retrieve IMessageConsumer and IMessageProducer
 * 
 * Prior to retrieve message consumer / producer. Service need to bind to targeted broker first.
 * 
 * @author Peter Chei
 *
 */
public interface IBrokerService {

	public void bindToBrokerAtUrl(String aBrokerUrl);

	public IMessageConsumer getMessageConsumer(String destination);

	public IMessageProducer getMessageProducer(String destination);

}
