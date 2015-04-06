package com.mos.workflow;

import com.mos.workflow.Action;
import com.mos.workflow.request.Request;

public abstract class AbstractWorkflow<T> {		
	
	public abstract T perform(T object, Request request);
	

}
