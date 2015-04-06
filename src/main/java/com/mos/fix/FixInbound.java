package com.mos.fix;

import javax.jms.Message;
import javax.jms.MessageListener;

import com.google.inject.Inject;


public class FixInbound implements MessageListener {
	
	@Inject
	private Processor fixProcessor = new Processor();
	
	@Override
	public void onMessage(Message message) {
		FixMessage fix = convert(message);
		fixProcessor.processFIX(fix);		
	}
		
	public FixMessage convert(Message message) {	
		//Convert JMSMessage to FIXMessage
		FixMessage fix = new FixMessage(message.toString());
		return fix;
	}
}
