package com.mos.messaging;


import org.apache.activemq.broker.Broker;
import org.apache.activemq.broker.BrokerService;
import org.apache.activemq.broker.region.DestinationStatistics;

/**
 * 
 * Create, start and stop broker server.  In addition, it provide some non standard JMS features for the server like getMessageCount(..)
 * 
 * @author Peter Chei
 *
 */
public class ActiveMqBrokerServerImpl implements IBrokerServer {
	
	private static ActiveMqBrokerServerImpl instance;
	private BrokerService brokerService;
	
	public static synchronized ActiveMqBrokerServerImpl getInstance() {
		instance = new ActiveMqBrokerServerImpl();
		return instance;
	}
	
	private ActiveMqBrokerServerImpl() {
		//create a brokerSerice for embedded server
		brokerService = new BrokerService();
	}
	
	@Override
	public void start(String aBrokerUrl) throws Exception {
				
		// create embedded broker
        brokerService.setPersistent(false);
        brokerService.addConnector(aBrokerUrl);
                
		// create and start embedded broker
		brokerService.start();	
	}

	@Override
	public void stop() throws Exception {
		//stop the running broker
        if (brokerService == null) {
            throw new IllegalStateException("Cannot stop the broker from this API: " +
                    "perhaps it was started independently from this utility");
        }
        brokerService.stop();
        brokerService.waitUntilStopped();
	}

	
	@Override
	public long getMessageCount(String destination){
		return getDestinationStatisticsFor(destination).getMessages().getCount();
	}
	
	
    private DestinationStatistics getDestinationStatisticsFor(String aDestinationName) {
        Broker regionBroker = brokerService.getRegionBroker();
        for (org.apache.activemq.broker.region.Destination destination : regionBroker.getDestinationMap().values()) {
            if (destination.getName().equals(aDestinationName)) {
                return destination.getDestinationStatistics();
            }
        }
        throw new IllegalStateException(String.format("Destination %s does not exist on broker at %s", aDestinationName, this));
    }
}