package com.mos.web;

import javax.jws.WebService;

import com.google.inject.Inject;
import com.mos.domain.Fill;
import com.mos.domain.Order;


@WebService(endpointInterface = "com.mos.web.MosServices") //this binds the SEI to the SIB
public class MosServices implements WSFacadeInterface {

	@Inject
	private AllocationWS allocateWs;
	
	@Inject
	private OrderWS orderWs;
	
	@Inject
	private ExecutionWS executionWs;
	
	@Override
	public Fill[] getFillsByOrderId(ServiceRequest serviceRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Fill[] getFillById(ServiceRequest serviceRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order[] getAllOrders(ServiceRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order[] getOrdersByIds(ServiceRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order getOrder(ServiceRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

}
