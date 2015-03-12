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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Allocation[] getAllocationsByAveragePriceGroupId(long averagePrcGrpId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Allocation[] getAllAllocations(long numberOfDays) {
		// TODO Auto-generated method stub
		return null;
	}

}
