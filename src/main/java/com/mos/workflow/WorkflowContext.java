package com.mos.workflow;

import java.math.BigDecimal;
import java.util.concurrent.ConcurrentHashMap;

public class WorkflowContext {

	private ConcurrentHashMap<String, Object> map = new ConcurrentHashMap<String, Object>(100);
	

	public void putValue(String key, Object value) {
		map.put(key, value);
	}

	public String getValueAsString(String key) {

		Object value = map.get(key);

		if (value != null)
			return value.toString();
		return null;

	}

	public Object getValue(String key) {
		Object value = map.get(key);

		return value;
	}

	public Long getValueAsLong(String key) {

		Object value = map.get(key);

		if (value != null)
			return Long.parseLong(value.toString());
		return null;
	}

	public BigDecimal getValueAsBigDecimal(String key) {

		Object value = map.get(key);

		if (value != null && value instanceof BigDecimal)
			return (BigDecimal) value;
		return null;
	}

}
