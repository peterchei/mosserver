package com.mos.heartbeat;

import com.mos.event.EventPublisher;
import com.mos.event.Notification;

public class HeartBeatDaemon implements Runnable {

	// TODO dependence injection
	protected EventPublisher publisher;
	protected int waitTime;

	@Override
	public void run() {

		while (true) {
			Notification notification = new HeartBeatNotification();
			publisher.publish(notification);
			try {
				this.wait(waitTime);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
