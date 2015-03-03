package com.mos.app;

import static org.slf4j.LoggerFactory.getLogger;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mos.messaging.IBrokerServer;

public class MosApp {

	public static void main(String args[]) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");


		try {
			IBrokerServer brokerServer = (IBrokerServer) context.getBean("embededBrokerServer");
			brokerServer.start("tcp://localhost:8081");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // start broker service at given URL.
	}
}
