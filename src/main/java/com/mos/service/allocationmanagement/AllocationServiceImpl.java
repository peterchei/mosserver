package com.mos.service.allocationmanagement;

import java.util.List;

import com.google.inject.Inject;
import com.mos.domain.Allocation;
import com.mos.store.AllocationStore;

public class AllocationServiceImpl implements AllocationService {

	
	@Inject
	private AllocationStore store = new AllocationStore();

	@Override
	public Allocation getAllocation(long allocationId) {
		return store.get(allocationId);
	}

	@Override
	public List<Allocation> getAllocationsByAveragePriceGroupId(long averagePrcGrpId) {
		return store.getAllocationByAveragePriceGroupId(averagePrcGrpId);
	}

	@Override
	public List<Allocation> getAllAllocations(long numberOfDays) {
		return store.getAllAllocations(5);
	}
}
