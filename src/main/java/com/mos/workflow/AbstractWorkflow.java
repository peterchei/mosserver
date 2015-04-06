package com.mos.workflow;

import com.google.inject.Inject;
import com.mos.workflow.request.Request;

public abstract class AbstractWorkflow<T> {
	
	@Inject
	private WorkflowContext context = new WorkflowContext();
	
	public abstract T perform(Request request);
	
	protected WorkflowContext getContext() {
		return context;
	}
	

}
