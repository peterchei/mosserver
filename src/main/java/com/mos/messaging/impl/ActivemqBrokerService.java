package com.mos.messaging.impl;


import static org.slf4j.LoggerFactory.getLogger;

import javax.jms.Connection;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.jms.Topic;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.slf4j.Logger;

import com.mos.messaging.IBrokerService;
import com.mos.messaging.IMessageConsumer;
import com.mos.messaging.IMessageProducer;

/**
 *  Implementation of IBrokerSerice, IMessaegeConsumer and IMessageProducer.
 *  
 *  It service as a factory to retrieve IMessageConsumer and IMessageProducer instance 
 *  
  * @author Peter Chei
 *
 */
public class ActivemqBrokerService implements IBrokerService {

	private static final Logger LOG = getLogger(ActivemqBrokerService.class);

	private String brokerUrl;


	@Override
	public void bindToBrokerAtUrl(String aBrokerUrl) {
		brokerUrl = aBrokerUrl;
	}
	
	@Override
	public IMessageConsumer getMessageConsumer(Destination destination) {
		return new ActivemqMessageConsumer(destination);
	}


	@Override
	public IMessageProducer getMessageProducer(Destination destination) {
		return new ActivemqMessageProducer(destination);
	}
	
	
    interface JmsCallback {
        String performJmsFunction(Session aSession, Destination aDestination) throws JMSException;
    }      
 	
	abstract class ActivemqConnection {

		protected Connection connection = null;
		protected Session session = null;

		ActivemqConnection() {
			initConnectionAndSesion();
		}
		
		private void initConnectionAndSesion() {
			//refactor from executeCallbackAgainstRemoteBroker()
			
			try {
				ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory(brokerUrl);
				connection = connectionFactory.createConnection();
				connection.start();

			} catch (JMSException jmse) {
				LOG.error("failed to create connection to {}", brokerUrl);
				throw new IllegalStateException(jmse);
			}

			try {
				session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
			} catch (JMSException jmse) {
				LOG.error("Failed to create session on connection {}",
						connection);
				throw new IllegalStateException(jmse);
			}			
		}

		public void closeSessionAndConnection() {
			if (session != null) {
				try {
					session.close();
				} catch (JMSException jmse) {
					LOG.warn("Failed to close session {}", session);
					throw new IllegalStateException(jmse);
				}
			}

			if (connection != null) {
				try {
					connection.close();
				} catch (JMSException jmse) {
					LOG.warn("Failed to close connection to broker at []", brokerUrl);
					throw new IllegalStateException(jmse);
				}
			}
		}
				
		protected String executeCallbackAgainstRemoteBroker(Destination aDestination, JmsCallback aCallback) {
	        String returnValue = "";
            returnValue = executeCallbackAgainstConnection(connection, aDestination, aCallback);
	        return returnValue;
	    }
	    
	    protected String executeCallbackAgainstConnection(Connection aConnection, Destination aDestination, JmsCallback aCallback) {
	        try {
	        	
	        	if (aDestination instanceof Queue) {
	            Queue queue = session.createQueue(((Queue) aDestination).getQueueName());	            
	            return aCallback.performJmsFunction(session, queue);
	        	} else {
		            Topic topic = session.createTopic(((Topic)aDestination).getTopicName());	            
		            return aCallback.performJmsFunction(session, topic);
	        	}
	        } catch (JMSException jmse) {
	            LOG.error("Failed to create session on connection {}", aConnection);
	            throw new IllegalStateException(jmse);
	        } 
	    }
	
	}
    
    class ActivemqMessageConsumer extends ActivemqConnection implements IMessageConsumer {

    	private Destination destination;
    	private MessageConsumer consumer;
    	
    	ActivemqMessageConsumer(Destination aDestination) {
    		this.destination = aDestination;
    	}
    	   	
		@Override
		public String retrieve(int aTimeout) {
	        return executeCallbackAgainstRemoteBroker(destination, (aSession, aDestination) -> {
	        	
	        	if (consumer ==null) {
	        	
	               consumer = aSession.createConsumer(aDestination);
	        	}
	        	
	            Message message = consumer.receive(aTimeout);
	           
	            if (message == null) {
	                return null;
	            } else {
	            	return ((TextMessage) message).getText();
	            }
	        });
		}
				
		@Override
		public void close() {
			try {
				if (consumer != null) consumer.close();
				super.closeSessionAndConnection();
			} catch (JMSException e) {
				LOG.warn("Failed to close message consumer.", e);
			}
			consumer = null;			
		}    	
    }
    
    
    class ActivemqMessageProducer extends ActivemqConnection implements IMessageProducer {
    	
    	private Destination destination;
    	private MessageProducer producer;
    	    	
    	ActivemqMessageProducer(Destination aDestination) {
    		this.destination = aDestination;
    	}
    	
		@Override
		public void send(String aMessageToSend) {
	        executeCallbackAgainstRemoteBroker(destination, (aSession, aDestination) -> {
	        	if (producer == null) {
	        		producer = aSession.createProducer(aDestination);
	        	}
	            producer.send(aSession.createTextMessage(aMessageToSend));
	            return "";
	        });		
		}

		@Override
		public void close() {
			try {
				if (producer != null)
				producer.close();
				super.closeSessionAndConnection();
			} catch (JMSException e) {
				LOG.warn("Failed to close message producer.", e);
			}
			producer = null;
		}    	
    }
    
    

    

    
    
}
