package com.mos.workflow.rules;

public abstract class AbstractRule<T> {

	public abstract boolean validate(T obj, ValidationResult result);

}
