package com.mos.ordermanagement;

import java.util.List;

import com.mos.domain.Order;
import com.mos.service.ServiceRequest;


public interface OrderService {
	
	public List<Order> getAllOrders(ServiceRequest request);
	public List<Order> getOrdersByIds(ServiceRequest request);
	public Order getOrder(ServiceRequest request);
	
}
