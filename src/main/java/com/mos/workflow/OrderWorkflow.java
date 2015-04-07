package com.mos.workflow;

import com.mos.domain.Order;
import com.mos.workflow.handler.NewOrderHandler;
import com.mos.workflow.request.CancelOrderRequest;
import com.mos.workflow.request.CancelReplaceOrderRequest;
import com.mos.workflow.request.NewOrderRequest;
import com.mos.workflow.request.Request;

public class OrderWorkflow extends AbstractWorkflow<Order> {
	

	@Override
	public Order perform(Request request) {		
		if (request instanceof NewOrderRequest) {
			return process((NewOrderRequest) request);
		} else if (request instanceof CancelReplaceOrderRequest) {
			return process((CancelReplaceOrderRequest) request);
		} else if (request instanceof CancelOrderRequest) {
			return process((CancelOrderRequest) request);
		} else {
			throw new RuntimeException("Unexpect Request to Order Workflow.");
		}

	}

	private Order process(NewOrderRequest request) {

		NewOrderHandler handler = new NewOrderHandler();
		return handler.process(request);
		
	}

	private Order process(CancelReplaceOrderRequest request) {

		return null;
	}

	private Order process(CancelOrderRequest request) {

		return null;
	}

}
