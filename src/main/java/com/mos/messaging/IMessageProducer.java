package com.mos.messaging;

import java.io.Closeable;

/**
 * Interface to send text messages
 * 
 * @author Peter Chei
 *
 */
public interface IMessageProducer extends Closeable {

	public void send(final String aMessageToSend);

	public void close();

}
