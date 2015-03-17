package com.mos.web;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import com.mos.domain.DomainEnums.EntityType;
import com.mos.domain.Task;


@WebService
@SOAPBinding(style = Style.RPC)
public interface TaskWS {

	@WebMethod
	public Task[] getAllPendingTasks();
	
	@WebMethod
	public Task[] getTasksByEntityId(EntityType type, long objectId);
	
	@WebMethod
	public Task getTask(long taskId);
}
