package com.mos.workflow;

import com.mos.workflow.Action;

public abstract class AbstractWorkflow<T> {		
	
	public abstract T perform(T object, Request request);
	

}
