package com.mos.service.executionmanagement;

import java.util.List;

import com.google.inject.Inject;
import com.mos.domain.Fill;

public interface ExecutionService {


	public List<Fill> getAllExecutions(int numberOfDays);
	
	public List<Fill> getExecutionsByOrderId(long orderId);
	
	public List<Fill> getExecutionsByAveragePriceGroupId(long averagePrcGrpId);
	
	public Fill getExecution(long fillId);
		
}
