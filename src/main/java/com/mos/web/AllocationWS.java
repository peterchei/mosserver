package com.mos.web;

import java.util.List;

import com.mos.domain.Allocation;

public interface AllocationWS {

	public Allocation getAllocation(long allocationId);

	public Allocation[] getAllocationsByAveragePriceGroupId(long averagePrcGrpId);

	public Allocation[] getAllAllocations(long numberOfDays);
	
}
