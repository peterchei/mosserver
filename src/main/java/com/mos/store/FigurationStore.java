package com.mos.store;

import java.util.ArrayList;
import java.util.List;

import com.mos.domain.DomainEnums.EntityType;
import com.mos.domain.Figuration;

public class FigurationStore extends AbstractStore<Figuration>{
	
	@SuppressWarnings("unchecked")
	public Figuration getFigurationByEntityId(EntityType type, long objectId) {
		
		List<Figuration> figs =  getEntityManager()
				.createQuery("SELECT fig FROM Figuration fig WHERE fig.objectId = :objectId and fig.objectType = :type")
				.setParameter("type", type)
				.setParameter("objectId", objectId).getResultList();
		
		if (figs.size() > 0 ) {
			return figs.get(0);
		} else {
			return null;
		}
		
	}
}
