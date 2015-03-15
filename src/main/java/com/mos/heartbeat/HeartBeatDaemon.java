package com.mos.heartbeat;

import static org.slf4j.LoggerFactory.getLogger;

import org.slf4j.Logger;

import com.mos.app.MosApp;
import com.mos.event.Notification;
import com.mos.event.EventContext;

public class HeartBeatDaemon implements Runnable {

	private static Logger logger = getLogger(HeartBeatDaemon.class);

	protected int waitTime = 1000;

	@Override
	public void run() {

		while (true) {
			Notification notification = new HeartBeatNotification();
			logger.info("Heartbeat publishing a live message.");

			int mb = 1024 * 1024;

			// Getting the runtime reference from system
			Runtime runtime = Runtime.getRuntime();

			logger.info("##### Heap utilization statistics [MB] #####");

			// Print used memory
			logger.info("Used Memory: "
					+ (runtime.totalMemory() - runtime.freeMemory()) / mb  + "MB");

			// Print free memory
			logger.info("Free Memory: " + runtime.freeMemory() / mb  + "MB");

			// Print total available memory
			logger.info("Total Memory: " + runtime.totalMemory() / mb  + "MB");

			// Print Maximum available memory
			logger.info("Max Memory: " + runtime.maxMemory() / mb   + "MB");
			logger.info("############################################");

			EventContext.publish(EventContext.TOPIC_HEARTBEAT_OUT, notification);

			try {
				Thread.sleep(waitTime);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
