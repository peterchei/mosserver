package com.mos.store;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.mos.domain.Allocation;

public class AllocationStore extends AbstractStore<Allocation> {

	@SuppressWarnings("unchecked")
	public List<Allocation> getAllocationByAveragePriceGroupId(long averagePriceGroupKey) {

		return entityManager
				.createQuery("SELECT alloc FROM Allocation alloc WHERE alloc.averagePrcGrpId = :avpId")
				.setParameter("avpId", averagePriceGroupKey).getResultList();

	}
	
	@SuppressWarnings("unchecked")
	public List<Allocation> getAllAllocations(long numberOfDays) {
		
		int asOfDate = Integer.parseInt(new SimpleDateFormat("yyyyMMdd").format(new Date()));
		return entityManager
				.createQuery("SELECT alloc FROM Allocation alloc WHERE alloc.tradeDate >= :asOfDate")
				.setParameter("asOfDate", asOfDate)
				.setMaxResults(1000).getResultList();
	}
	
	
	@SuppressWarnings("unchecked")
	public List<Allocation> getAllAllocationByOrderId(long orderId) {		
		return entityManager
				.createQuery("SELECT alloc FROM Allocation alloc, Order od WHERE alloc.averagePrcGrpId = od.averagePrcGrpId and od.orderId =:orderId")
				.setParameter("orderId", orderId).getResultList();
	}
	

}
