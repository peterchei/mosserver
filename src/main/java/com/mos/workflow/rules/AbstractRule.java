package com.mos.workflow.rules;

public abstract class AbstractRule<T> {

	public abstract void validate(T obj);

	public abstract void enrich(T obj);

}
