package com.mos.web;

import javax.xml.ws.Endpoint;

import org.slf4j.Logger;

import static org.slf4j.LoggerFactory.getLogger;

public class WebModule {

	public static Logger logger = getLogger(WebModule.class);

	private Endpoint endPoint;
	public void start() {

		endPoint = Endpoint.create(new OrderWSEntryPoint());		
		endPoint.publish("http://localhost:9001/mos"); 	
		

		
	}

	public void restart() {

	}

	public void stop() {
		endPoint.stop();
	}

}
