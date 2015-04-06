package com.mos.workflow;

import java.util.concurrent.ConcurrentHashMap;

public class WorkflowContext {

	private ConcurrentHashMap<String, Object> map = new ConcurrentHashMap<String, Object>(100);

	public void putValue(String key, Object value) {
		map.put(key, value);
	}

	public String getValue(String key) {

		Object value = map.get(key);

		if (value != null)
			return value.toString();
		return null;

	}

}
