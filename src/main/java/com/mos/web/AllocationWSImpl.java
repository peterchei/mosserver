package com.mos.web;

import com.google.inject.Inject;
import com.mos.domain.Allocation;
import com.mos.service.allocationmanagement.AllocationService;
import com.mos.service.allocationmanagement.AllocationServiceImpl;

public class AllocationWSImpl implements AllocationWS {
	
	@Inject
	private AllocationService allocService = new AllocationServiceImpl();

	@Override
	public Allocation getAllocation(long allocationId) {
		return allocService.getAllocation(allocationId);
	}

	@Override
	public Allocation[] getAllocationsByAveragePriceGroupId(long averagePrcGrpId) {
		return allocService.getAllocationsByAveragePriceGroupId(averagePrcGrpId).toArray(new Allocation[0]);
	}

	@Override
	public Allocation[] getAllAllocations(long numberOfDays) {
		return allocService.getAllAllocations(numberOfDays).toArray(new Allocation[0]);
	}

}
