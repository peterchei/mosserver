package com.mos.store;

import java.util.List;

import com.mos.domain.Fill;

public class FillStore extends AbstractStore<Fill> {
	
	@SuppressWarnings("unchecked")
	public List<Fill> getFillByExternalId(String externalRef) {

		return getEntityManager()
				.createQuery("SELECT f FROM Fill f WHERE f.externalRef = :externalRef")
				.setParameter("externalRef", externalRef)
				.setMaxResults(1000).getResultList();
	}
	
	
	@SuppressWarnings("unchecked")
	public List<Fill> getFillByOrderId(long orderId) {

		return getEntityManager()
				.createQuery("SELECT f FROM Fill f WHERE f.orderId = :orderId")
				.setParameter("orderId", orderId).getResultList();
	}
	
	@SuppressWarnings("unchecked")
	public List<Fill> getFillByAveragePriceGroupId(long avpId) {

		return getEntityManager()
				.createQuery("SELECT f FROM Fill f, Order od WHERE f.orderId = od.orderId and od.averagePrcGrpId = :avpId")
				.setParameter("avpId", avpId).getResultList();
	}
	
	@SuppressWarnings("unchecked")
	public List<Fill> getAllFills(long numberOfDays) {

		return getEntityManager()
				.createQuery("SELECT f FROM Fill f")
				.setMaxResults(1000).getResultList();
	}
	
	

}
