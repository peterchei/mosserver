package com.mos.web;

import javax.jws.WebService;


import com.google.inject.Inject;
import com.mos.domain.Allocation;
import com.mos.domain.DomainEnums.EntityType;
import com.mos.domain.Fill;
import com.mos.domain.Order;
import com.mos.domain.Task;
import com.mos.workflow.request.CancelOrderRequest;
import com.mos.workflow.request.CancelReplaceOrderRequest;
import com.mos.workflow.request.NewOrderRequest;


@WebService(endpointInterface = "com.mos.web.MosServices") //this binds the SEI to the SIB
public class MosServices implements AllocationWS, OrderWS, ExecutionWS, TaskWS {

	@Inject
	private AllocationWS allocateWs = new AllocationWSImpl();
	
	@Inject
	private OrderWS orderWs = new OrderWSImpl();
	
	@Inject
	private ExecutionWS executionWs = new ExecutionWSImpl();
	
	@Inject
	private TaskWS taskWs = new TaskWSImpl();
		
	@Override
	public Fill[] getFillsByOrderId(long orderId) {
		return executionWs.getFillsByOrderId(orderId);	
	}

	@Override
	public Fill getFillById(long fillId) {
		return executionWs.getFillById(fillId);
	}
	
	@Override
	public Fill[] getAllFills(int numberOfDays) {		
		return executionWs.getAllFills(numberOfDays);
	}

	@Override
	public Order[] getAllOrders(int numberOfDays) {
		return orderWs.getAllOrders(numberOfDays);
	}

	@Override
	public Order[] getOrdersByIds(long[] orderIds) {
		return orderWs.getOrdersByIds(orderIds);
	}

	@Override
	public Order getOrder(long orderId) {
		return orderWs.getOrder(orderId);
	}

	@Override
	public Allocation getAllocation(long allocationId) {
		return allocateWs.getAllocation(allocationId) ;
	}

	@Override
	public Allocation[] getAllocationsByAveragePriceGroupId(long averagePrcGrpId) {
		return allocateWs.getAllocationsByAveragePriceGroupId(averagePrcGrpId);
	}

	@Override
	public Allocation[] getAllAllocations(long numberOfDays) {
		return allocateWs.getAllAllocations(numberOfDays);
	}

	@Override
	public Task[] getAllPendingTasks() {		
		return taskWs.getAllPendingTasks();
	}

	@Override
	public Task[] getTasksByEntityId(EntityType type, long objectId) {
		return taskWs.getTasksByEntityId(type, objectId);
	}

	@Override
	public Task getTask(long taskId) {
		return taskWs.getTask(taskId);
	}

	@Override
	public void showWorkflowRequest(NewOrderRequest request,
			CancelOrderRequest request2, CancelReplaceOrderRequest request3) {
		// TODO Auto-generated method stub
		
	}
	
	

}
