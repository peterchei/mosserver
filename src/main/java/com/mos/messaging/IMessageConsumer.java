package com.mos.messaging;

import java.io.Closeable;

/**
 * Interface to retrieve messages from broker
 *
 * @author Peter Chei
 *
 */
public interface IMessageConsumer extends Closeable {

	public String retrieve(final int aTimeout);

	public void close();

}
