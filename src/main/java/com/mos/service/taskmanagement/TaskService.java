package com.mos.service.taskmanagement;

import java.util.List;

import com.mos.domain.DomainEnums.EntityType;
import com.mos.domain.Task;

public interface TaskService {

	public List<Task> getAllPendingTasks();
	
	public List<Task> getTasksByEntityId(EntityType type, long objectId);	
	
	public Task getTask(long taskId);

}
