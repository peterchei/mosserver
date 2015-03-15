package com.mos.workflow;

import com.mos.domain.Order;
import com.mos.workflow.Transition.Action;

public class OrderWorkflow extends AbstractWorkflow<Order> {

	
	
	@Override
	public Order perform(Order original, Action action, Object[]... args) {
		
		
		return null;
	}


	public void processNewOrder() {
		
	}
	
	public void processAmendOrder() {
		
	}
	
	public void processCancelOrder() {
		
	}
	



}
