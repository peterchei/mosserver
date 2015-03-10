package com.mos.web;

import javax.jws.WebService;

import com.google.inject.Inject;
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
	public Fill[] getFillsByOrderId(ServiceRequest serviceRequest) {
		return executionWs.getFillsByOrderId(serviceRequest);	
	}

	@Override
	public Fill[] getFillById(ServiceRequest serviceRequest) {
		return executionWs.getFillById(serviceRequest);
	}

	@Override
	public Order[] getAllOrders(ServiceRequest request) {
		return orderWs.getAllOrders(request);
	}

	@Override
	public Order[] getOrdersByIds(ServiceRequest request) {
		return orderWs.getOrdersByIds(request);
	}

	@Override
	public Order getOrder(ServiceRequest request) {
		return orderWs.getOrder(request);
	}

}
