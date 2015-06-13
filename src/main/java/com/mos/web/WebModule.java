package com.mos.web;

import static org.slf4j.LoggerFactory.getLogger;

import javax.xml.ws.Endpoint;

import org.slf4j.Logger;

/**
 * 
 * Configuration Module to bring up mos WS. 
 * 
 * TODO, uses dependence injection.
 * 
 * @author Hung
 *
 */
public class WebModule {

	public static Logger logger = getLogger(WebModule.class);

	private Endpoint endPoint;

	
	public void start() {
		
		
		logger.info("Starting webservice.");

		endPoint = Endpoint.create(new MosServices());		
		endPoint.publish("http://localhost:9001/mos"); 	
		logger.info("Service orderWS exported to http://localhost:9001/mos");

		logger.info("*****************************");
		logger.info("**** WebService started. ****");
		logger.info("*****************************");
		
	}

	public void restart() {

	}

	public void stop() {
		endPoint.stop();

	}

}
