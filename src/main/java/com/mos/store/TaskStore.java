package com.mos.store;

import java.util.List;

import com.mos.domain.DomainEnums.EntityType;
import com.mos.domain.Task;

public class TaskStore extends AbstractStore<Task> {
	
	
	@SuppressWarnings("unchecked")
	public List<Task> getTasksByEntityId(EntityType type, long objectId) {
		
		return getEntityManager()
				.createQuery("SELECT t FROM Task t WHERE t.objectId = :objectId and t.objectType = :type")
				.setParameter("objectId", objectId)
				.setParameter("type", type).getResultList();
	}

}
