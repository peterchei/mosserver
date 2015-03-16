package com.mos.heartbeat;

import static org.slf4j.LoggerFactory.getLogger;

import org.slf4j.Logger;

import com.mos.event.EventContext;
import com.mos.event.Notification;

public class HeartBeatDaemon implements Runnable {

	private static Logger logger = getLogger(HeartBeatDaemon.class);

	protected int waitTime = 60000;

	@Override
	public void run() {

		while (true) {
			HeartBeatNotification notification = new HeartBeatNotification();
			logger.info("Heartbeat publishing a live message.");

			int mb = 1024 * 1024;

			// Getting the runtime reference from system
			Runtime runtime = Runtime.getRuntime();			
			
			// Print used memory
			long usedMemory = (runtime.totalMemory() - runtime.freeMemory())/ mb;
			// Print free memory
			long freeMemory = runtime.freeMemory() / mb;
			// Print total available memory
			long totalMemory = runtime.totalMemory() / mb;
			// Print Maximum available memory
			long maxMemory = runtime.maxMemory() / mb;
		
			
			notification.setFreeMemory(freeMemory);
			notification.setTotalMemory(totalMemory);
			notification.setUsedMemory(usedMemory);
			notification.setMaxMemory(maxMemory);

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
