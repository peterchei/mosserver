package com.mos.store;

import java.util.List;

import com.mos.domain.Order;


public class OrderStore extends AbstractStore<Order> {

   
	@SuppressWarnings("unchecked")
	public List<Order> getAllOrders(int days) {
		getEntityManager().getTransaction().begin();		
		List<Order> orders = getEntityManager().createNamedQuery("Order.findAll").getResultList();
		getEntityManager().getTransaction().commit();
		return orders;
	}
	
	@SuppressWarnings("unchecked")
	public List<Order> getOrdersByAveragePrcGrpId(long averagePrcGrpId) {
		return getEntityManager()
				.createQuery("SELECT od FROM Order od WHERE od.averagePrcGrpId = :avpId")
				.setParameter("avpId", averagePrcGrpId).getResultList();
	
	}
	
}
