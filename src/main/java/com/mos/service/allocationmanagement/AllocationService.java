package com.mos.service.allocationmanagement;

import java.util.List;

import com.google.inject.Inject;
import com.mos.domain.Allocation;

public interface AllocationService {

	public Allocation getAllocation(long allocationId);

	public List<Allocation> getAllocationsByAveragePriceGroupId(long averagePrcGrpId);

	public List<Allocation> getAllAllocations(long numberOfDays);

}
