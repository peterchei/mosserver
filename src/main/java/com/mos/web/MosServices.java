package com.mos.web;

import javax.jws.WebService;

import com.google.inject.Inject;
import com.mos.domain.Allocation;
import com.mos.domain.Fill;
import com.mos.domain.Order;
import com.sun.org.apache.bcel.internal.generic.NEW;


@WebService(endpointInterface = "com.mos.web.MosServices") //this binds the SEI to the SIB
public class MosServices implements WSFacadeInterface {

	@Inject
	private AllocationWS allocateWs = new AllocationWSImpl();
	
	@Inject
	private OrderWS orderWs = new OrderWSImpl();
	
	@Inject
	private ExecutionWS executionWs = new ExecutionWSImpl();
		
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
	
	

}
