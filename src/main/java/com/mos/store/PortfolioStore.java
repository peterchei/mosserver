package com.mos.store;

import java.util.List;

import com.mos.domain.Portfolio;

public class PortfolioStore extends AbstractStore<Portfolio> {

	
	@SuppressWarnings("unchecked")
	public List<Portfolio> getPortfolioByName(String name) {		
		return getEntityManager()
				.createQuery("SELECT pf FROM Portfolio pf WHERE pf.name = :name")
				.setParameter("name", name).getResultList();
		
	}
	
	@SuppressWarnings("unchecked")
	public List<Portfolio> getPortfolioByDate(int tradeDate) {		
		return getEntityManager()
				.createQuery("SELECT pf FROM Portfolio pf WHERE pf.tradeDate = :tradeDate")
				.setParameter("tradeDate", tradeDate).getResultList();
		
	}
}
