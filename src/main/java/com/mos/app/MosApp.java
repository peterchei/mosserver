package com.mos.app;

import com.mos.event.Util;

import org.slf4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.slf4j.LoggerFactory.getLogger;

import com.mos.messaging.IBrokerServer;
import com.sun.org.apache.xml.internal.security.Init;

public class MosApp {
	
	private static Logger logger = getLogger(MosApp.class);
	
	private IBrokerServer brokerServer;
	
	public MosApp() {
		init();
	}
	
	public void init() {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml"); 
		try {
			brokerServer = (IBrokerServer) context.getBean("embededBrokerServer");			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // start broker service at given URL.
		
	}
	
	public void start() {
		
		try {
			brokerServer.start("tcp://localhost:8081");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		logger.info("*****************************************");
		logger.info("******   All services started.  *********");
		logger.info("*****************************************");

    }

	public static void main(String args[]) {	
		MosApp myApp = new MosApp();		
		myApp.start();
	}
}
