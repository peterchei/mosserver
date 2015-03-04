package com.mos.event;

public interface EventPublisher {
	
	public void publish(Notification Notification);	
	public void start();
	public void stop();
	
}
