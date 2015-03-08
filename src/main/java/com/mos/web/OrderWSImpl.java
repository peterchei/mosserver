package com.mos.web;

import java.util.ArrayList;
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
@WebService(endpointInterface = "com.mos.web.OrderWS") //this binds the SEI to the SIB
public class OrderWSImpl implements OrderWS {

	@Inject
	private OrderService orderService;
	
	@Override
	public Order[] getAllOrders(ServiceRequest request) {
		return orderService.getAllOrders(request).toArray(new Order[0]);
	}

	@Override
	public Order[] getOrdersByIds(ServiceRequest request) {
		return orderService.getOrdersByIds(request).toArray(new Order[0]);
	}

	@Override
	public Order getOrder(ServiceRequest request) {
		return orderService.getOrder(request);
	}

}
