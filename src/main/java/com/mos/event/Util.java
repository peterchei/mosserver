package com.mos.event;

import javax.jms.Destination;

public class Util {


	public static void publish(Destination destination, Notification event) {
        getEventPublisher(destination).publish(event);
	}

    private static EventPublisher getEventPublisher(Destination dest) {
        //TODO

        return null;
    }
}
