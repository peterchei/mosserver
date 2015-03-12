package com.mos.web;

import javax.jws.WebService;

import com.google.inject.Inject;
import com.mos.domain.Fill;
import com.mos.service.executionmanagement.ExecutionService;
import com.mos.service.executionmanagement.ExecutionServiceImpl;

@WebService(endpointInterface = "com.mos.web.ExecutionWS") //this binds the SEI to the SIB
public class ExecutionWSImpl implements ExecutionWS {
	
	@Inject
	private ExecutionService executionService = new ExecutionServiceImpl();

	@Override
	public Fill[] getFillsByOrderId(long orderId) {		
		return executionService.getExecutionsByOrderId(orderId).toArray(new Fill[0]);
	}

	@Override
	public Fill getFillById(long fillId) {
		return executionService.getExecution(fillId);
	}

	@Override
	public Fill[] getAllFills(int numberOfDays) {
		return executionService.getAllExecutions(numberOfDays).toArray(new Fill[0]);
	}

}
