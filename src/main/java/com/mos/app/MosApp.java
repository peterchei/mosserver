package com.mos.app;

import org.slf4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.slf4j.LoggerFactory.getLogger;

import com.mos.messaging.IBrokerServer;

public class MosApp {
	
	private static Logger logger = getLogger(MosApp.class);

	public static void main(String args[]) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	  
		
		

		try {
			IBrokerServer brokerServer = (IBrokerServer) context.getBean("embededBrokerServer");
			brokerServer.start("tcp://localhost:8081");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // start broker service at given URL.
		
		logger.info("*****************************************");
		logger.info("******   All services started.  *********");
		logger.info("*****************************************");
		
		
	}
}
