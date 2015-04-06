package com.mos.fix;

public class Processor {

	public void processFIX(FixMessage message) {
		
		
		// Transfer to request
		
		// pass request to workflow;
		
		
		
		switch (message.getMessageType()) {
		case CANCEL_FILL:
			break;
		case CANCEL_ORDER:
			break;
		case CANCEL_REPLACE_ORDER:
			break;
		case DONE_FOR_DAY:
			break;
		case NEW_FILL:
			break;
		case NEW_ORDER:
			break;
		case REOPEN_ORDER:
			break;
		default:
			break;
		}

	}

}
