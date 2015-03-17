package com.mos.web;

import com.google.inject.Inject;
import com.mos.domain.DomainEnums.EntityType;
import com.mos.domain.Task;
import com.mos.service.taskmanagement.TaskService;
import com.mos.service.taskmanagement.TaskServiceImpl;

public class TaskWSImpl implements TaskWS {
	
	@Inject
	private TaskService taskService = new TaskServiceImpl();

	@Override
	public Task[] getAllPendingTasks() {
		return taskService.getAllPendingTasks().toArray(new Task[0]);
	}

	@Override
	public Task[] getTasksByEntityId(EntityType type, long objectId) {
		return taskService.getTasksByEntityId(type, objectId).toArray(new Task[0]);
	}

	@Override
	public Task getTask(long taskId) {
		return taskService.getTask(taskId);
	}

}
