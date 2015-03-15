package com.mos.service.ordermanagement;

import java.util.ArrayList;
import java.util.List;

import com.google.inject.Inject;
import com.mos.domain.Order;
import com.mos.store.OrderStore;


public class OrderServiceImpl implements OrderService {
	
	@Inject
	protected OrderStore store = new OrderStore();
	
	
	@Override
	public List<Order> getAllOrders(int numberOfDays) {
		List<Order> orders = store.getAllOrders(numberOfDays);
		return orders;
	}

	@Override
	public List<Order> getOrdersByIds(long orderIds[]) {

		ArrayList<Order> odList = new ArrayList<Order>(orderIds.length);
		for (long id : orderIds) {
			Order od = store.get(id);
			if (od != null)
				odList.add(od);
		}
		return odList;
	}

	@Override
	public Order getOrder(long orderId) {
		//for (long id : request.getObjectIds()) {
			Order od = store.get(orderId);
			if (od != null)
				return od;
		//}
		return null;
	}

}
