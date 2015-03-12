package com.mos.messaging;

import javax.jms.Destination;

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

	public IMessageConsumer getMessageConsumer(Destination destination);

	public IMessageProducer getMessageProducer(Destination destination);

}
