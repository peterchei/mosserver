package com.mos.workflow;

import com.mos.workflow.Transition.Action;

public abstract class AbstractWorkflow<T> {		
	
	public abstract T perform(T original, Action action, Object[] ... args);
	

}
