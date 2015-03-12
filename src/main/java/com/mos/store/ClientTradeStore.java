package com.mos.store;

import java.util.List;

import com.mos.domain.ClientTrade;

public class ClientTradeStore extends AbstractStore<ClientTrade>  {
	
	
	@SuppressWarnings("unchecked")
	public List<ClientTrade> getClientTradesByAllocId(long allocationId) {		
		return entityManager
				.createQuery("SELECT ct FROM ClientTrade ct WHERE ct.allocationId >= :allocationId")
				.setParameter("allocationId", allocationId).getResultList();
	}

}
