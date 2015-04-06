package com.mos.fix;

import com.mos.workflow.OrderWorkflow;
import com.mos.workflow.request.NewOrderRequest;

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
			new OrderWorkflow().perform(getNewOrderRequest());
			break;
		case REOPEN_ORDER:
			break;
		default:
			break;
		}

	}
	
	
	public NewOrderRequest getNewOrderRequest() {
		
		//TODO
		
		return null;
	}

}
