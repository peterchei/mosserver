package com.mos.event;

public interface EventPublisher {
	
	public abstract void publish(Notification Notification);	
	public abstract void start();
	public abstract void stop();
	
}
