package com.mos.service.ordermanagement;

import java.util.ArrayList;
import java.util.List;

import com.google.inject.Inject;
import com.mos.domain.Order;
import com.mos.event.EventPublisher;
import com.mos.service.ServiceRequest;
import com.mos.store.OrderStore;

public class OrderServiceImpl implements OrderService {
	
	@Inject
	protected OrderStore store;
	
	@Inject
	private EventPublisher publisher;

	
	@Override
	public List<Order> getAllOrders(ServiceRequest request) {
		List<Order> orders = store.getAllOrders(5);
		return orders;
	}

	@Override
	public List<Order> getOrdersByIds(ServiceRequest request) {

		ArrayList<Order> odList = new ArrayList<Order>(request.getObjectIds().size());
		for (long id : request.getObjectIds()) {
			Order od = store.get(id);
			if (od != null)
				odList.add(od);
		}
		return odList;
	}

	@Override
	public Order getOrder(ServiceRequest request) {
		for (long id : request.getObjectIds()) {
			Order od = store.get(id);
			if (od != null)
				return od;
		}
		return null;
	}

}
