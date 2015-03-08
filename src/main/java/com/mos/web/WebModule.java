package com.mos.web;

import javax.xml.ws.Endpoint;

import org.slf4j.Logger;

import static org.slf4j.LoggerFactory.getLogger;

public class WebModule {

	public static Logger logger = getLogger(WebModule.class);

	//private Endpoint endPoint1;
	//private Endpoint endPoint2;
	
	
	public void start() {
		
		logger.info("Starting webservice.");

		//endPoint1 = Endpoint.create(new OrderWSEntryPoint());		
		//endPoint1.publish("http://localhost:9001/mos"); 	
		logger.info("Service orderWS exported to http://localhost:9001/mos/OrderWS.");
		
		
		//endPoint2 = Endpoint.create(new ExecutionWSEntryPoint());		
		//endPoint1.publish("http://localhost:9001/mos",new ExecutionWSEntryPoint()); 	
		Endpoint.publish("http://localhost:9001/mos", new ExecutionWSImpl());
		//Endpoint.publish("http://localhost:9001/mos", new OrderWSImpl());
		
		logger.info("Service executionWS exported to http://localhost:9001/mos/ExecutionWS.");

		logger.info("*****************************");
		logger.info("**** WebService started. ****");
		logger.info("*****************************");
		
	}

	public void restart() {

	}

	public void stop() {
		//endPoint.stop();
		//endPoint.stop();
	}

}
