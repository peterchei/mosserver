package com.mos.workflow;

import org.junit.Test;

import com.mos.workflow.request.NewOrderRequest;

public class TestOrderWorkflow {
	
	

	@Test
	public void testOrderWorkFlow() {
		
		new OrderWorkflow().perform(new NewOrderRequest());
		

	}


}
