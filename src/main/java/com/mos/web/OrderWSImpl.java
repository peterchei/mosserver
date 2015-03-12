package com.mos.web;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import com.google.inject.Inject;
import com.mos.domain.Order;
import com.mos.service.ordermanagement.OrderService;
import com.mos.service.ordermanagement.OrderServiceImpl;
import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * 
 * @author Peter Chei
 *
 */
@WebService(endpointInterface = "com.mos.web.OrderWS") //this binds the SEI to the SIB
public class OrderWSImpl implements OrderWS {

	@Inject
	private OrderService orderService = new OrderServiceImpl();
	
	@Override
	public Order[] getAllOrders(int numberOfDays) {
		return orderService.getAllOrders(numberOfDays).toArray(new Order[0]);
	}

	@Override
	public Order[] getOrdersByIds(long[] orderIds) {
		return orderService.getOrdersByIds(orderIds).toArray(new Order[0]);
	}

	@Override
	public Order getOrder(long orderId) {
		return orderService.getOrder(orderId);
	}

}
