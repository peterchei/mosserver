package com.mos.web;

import javax.jws.WebService;

import com.google.inject.Inject;
import com.mos.domain.Fill;
import com.mos.service.executionmanagement.ExecutionService;

@WebService(endpointInterface = "com.mos.web.ExecutionWS") //this binds the SEI to the SIB
public class ExecutionWSImpl implements ExecutionWS {
	
	@Inject
	private ExecutionService executionService;

	@Override
	public Fill[] getFillsByOrderId(long orderId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Fill[] getFillById(long fillId) {
		// TODO Auto-generated method stub
		return null;
	}

}
