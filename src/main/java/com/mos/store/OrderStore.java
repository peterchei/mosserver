package com.mos.store;

import java.util.List;

import com.mos.domain.Order;


public class OrderStore extends AbstractStore<Order> {

   
	@SuppressWarnings("unchecked")
	public List<Order> getAllOrders(int days) {
		entityManager.getTransaction().begin();		
		List<Order> orders = entityManager.createNamedQuery("Order.findAll").getResultList();
		entityManager.getTransaction().commit();
		return orders;
	}
	
	@SuppressWarnings("unchecked")
	public List<Order> getOrdersByAveragePrcGrpId(long averagePrcGrpId) {
		return entityManager
				.createQuery("SELECT f FROM Order od WHERE od.averagePrcGrpId = :avpId")
				.setParameter("avpId", averagePrcGrpId).getResultList();
	
	}
	
}
