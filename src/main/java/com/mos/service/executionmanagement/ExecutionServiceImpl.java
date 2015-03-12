package com.mos.service.executionmanagement;

import java.util.List;

import com.google.inject.Inject;
import com.mos.domain.Fill;
import com.mos.store.FillStore;


public class ExecutionServiceImpl implements ExecutionService {
	
	@Inject
	protected FillStore store = new FillStore();	

	@Override
	public List<Fill> getAllExecutions(int numberOfDays) {
		return store.getAllFills(numberOfDays);
	}

	@Override
	public List<Fill> getExecutionsByOrderId(long orderId) {
		return store.getFillByOrderId(orderId);
	}

	@Override
	public List<Fill> getExecutionsByAveragePriceGroupId(long averagePrcGrpId) {
		return store.getFillByAveragePriceGroupId(averagePrcGrpId);
	}

	@Override
	public Fill getExecution(long fillId) {		
		return store.get(fillId);
	}

}
