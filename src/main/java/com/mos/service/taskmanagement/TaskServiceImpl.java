package com.mos.service.taskmanagement;

import java.util.List;

import com.google.inject.Inject;
import com.mos.domain.DomainEnums.EntityType;
import com.mos.domain.Task;
import com.mos.store.TaskStore;

public class TaskServiceImpl implements TaskService {
	
	@Inject 
	private TaskStore store = new TaskStore();

	@Override
	public List<Task> getAllPendingTasks() {
		return store.getAllPendingTasks();
	}

	@Override
	public List<Task> getTasksByEntityId(EntityType type, long objectId) {
		return store.getTasksByEntityId(type, objectId);
	}

	@Override
	public Task getTask(long taskId) {
		return store.get(taskId);
	}

}
