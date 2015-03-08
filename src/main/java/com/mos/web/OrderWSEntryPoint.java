package com.mos.web;

import java.util.List;

import javax.jws.WebService;

import com.google.inject.Inject;
import com.mos.domain.Order;
import com.mos.service.ServiceRequest;
import com.mos.service.ordermanagement.OrderService;

/**
 * 
 * @author Peter Chei
 *
 */
@WebService(endpointInterface = "mos.OrderWS") //this binds the SEI to the SIB
public class OrderWSEntryPoint implements OrderWS {

	@Inject
	private OrderService orderService;
	
	@Override
	public List<Order> getAllOrders(ServiceRequest request) {
		return orderService.getAllOrders(request);
	}

	@Override
	public List<Order> getOrdersByIds(ServiceRequest request) {
		return orderService.getOrdersByIds(request);
	}

	@Override
	public Order getOrder(ServiceRequest request) {
		return orderService.getOrder(request);
	}

}
