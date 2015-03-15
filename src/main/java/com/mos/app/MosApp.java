package com.mos.app;


import static org.slf4j.LoggerFactory.getLogger;

import org.slf4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mos.event.EventContext;
import com.mos.heartbeat.HeartBeatDaemon;
import com.mos.messaging.IBrokerServer;
import com.mos.web.WebModule;


public class MosApp {
	
	private static Logger logger = getLogger(MosApp.class);
	
	private IBrokerServer brokerServer;	
	private WebModule webModule;
	private Thread heartBeat;
	
	public MosApp() {
		init();
	}
	
	public void init() {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml"); 
		try {
			brokerServer = (IBrokerServer) context.getBean("embededBrokerServer");			
		} catch (Exception e) {

		} 
		heartBeat = new Thread(new HeartBeatDaemon());
		
		
		webModule = new WebModule();
		
	}
	
	public void start() throws Exception {
		

		brokerServer.start("tcp://localhost:8081");
		webModule.start();
		heartBeat.start();
		EventContext.getInstance();
		logger.info("*****************************************");
		logger.info("******   All services started.  *********");
		logger.info("*****************************************");

    }

	public static void main(String args[]) {	
	
		try {
			MosApp myApp = new MosApp();	
			myApp.start();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
