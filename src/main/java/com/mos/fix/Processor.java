package com.mos.fix;

import com.google.inject.Inject;
import com.mos.workflow.FillWorkflow;
import com.mos.workflow.OrderWorkflow;
import com.mos.workflow.request.CancelOrderRequest;
import com.mos.workflow.request.CancelReplaceOrderRequest;
import com.mos.workflow.request.NewOrderRequest;
import com.mos.workflow.request.ReOpenOrderRequest;

public class Processor {

	
	@Inject 
	private OrderWorkflow orderWorkflow = new OrderWorkflow();
	
	@Inject 
	private FillWorkflow fillWorkflow = new FillWorkflow();
	
	public void processFIX(FixMessage message) {
		
		
		// Transfer to request
		
		// pass request to workflow;				
		
		switch (message.getMessageType()) {		
			
			
		case NEW_FILL:
			break;
			
		case CANCEL_FILL:
			break;
			
			
		case NEW_ORDER:			
			orderWorkflow.perform(getNewOrderRequest());
			break;
		case REOPEN_ORDER:
			orderWorkflow.perform(getReOpenOrderRequest());
			break;			
		case CANCEL_ORDER:
			orderWorkflow.perform(getCancelOrderRequest());
			break;			
		case CANCEL_REPLACE_ORDER:
			break;
		case DONE_FOR_DAY:
			
			break;
			
			
		default:
			throw new RuntimeException("Unsupported Message Type." + message.getMessageType());
		}

	}
	
	
	public NewOrderRequest getNewOrderRequest() {		
		//TODO		
		return null;
	}
	
	public ReOpenOrderRequest getReOpenOrderRequest() {		
		//TODO		
		return null;
	}

	public CancelOrderRequest getCancelOrderRequest() {		
		//TODO		
		return null;
	}
	
	public CancelReplaceOrderRequest getCancelReplaceOrderRequest() {
		//TODO
		return null;
	}
}
