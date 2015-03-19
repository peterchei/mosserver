package com.mos.store;


import java.util.List;

import com.mos.domain.AveragePriceGroup;

public class AveragePriceGroupStore  extends AbstractStore<AveragePriceGroup>  {
	
	@SuppressWarnings("unchecked")
	public AveragePriceGroup getAveragePriceGroupByOrderId(long orderId) {		
		
		List<AveragePriceGroup> result = getEntityManager()
				.createQuery("SELECT avp FROM AveragePriceGroup avp, Order od WHERE avp.averagePrcGrpId = od.averagePrcGrpId and od.orderId =:orderId")
		.setParameter("orderId", orderId).getResultList();
		
		if (result != null && result.size() > 0) {
			return result.get(0);
		}
		return null;
	}
}
