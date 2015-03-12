package com.mos.store;

import java.util.List;

import com.mos.domain.Allocation;
import com.mos.domain.Fill;

public class FillStore extends AbstractStore<Fill> {
	
	@SuppressWarnings("unchecked")
	public List<Fill> getFillByExternalId(String externalRef) {

		return entityManager
				.createQuery("SELECT f FROM Fill f WHERE f.externalRef = :externalRef")
				.setParameter("externalId", externalRef)
				.setMaxResults(1000).getResultList();
	}
	
	
	@SuppressWarnings("unchecked")
	public List<Fill> getFillByOrderId(long orderId) {

		return entityManager
				.createQuery("SELECT f FROM Fill f WHERE f.orderId = :orderId")
				.setParameter("orderId", orderId)
				.setMaxResults(1000).getResultList();
	}
	
	

}
