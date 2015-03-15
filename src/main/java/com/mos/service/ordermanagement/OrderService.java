package com.mos.service.ordermanagement;

import java.util.List;

import com.mos.domain.Order;


public interface OrderService {
	
	public List<Order> getAllOrders(int numberOfDays);
	public List<Order> getOrdersByIds(long[] orderIds);
	public Order getOrder(long orderId);
	
}
