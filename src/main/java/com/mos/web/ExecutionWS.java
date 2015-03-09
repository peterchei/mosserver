package com.mos.web;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import com.mos.domain.Fill;

@WebService
@SOAPBinding(style = Style.RPC)
public interface ExecutionWS {
	
	@WebMethod
	public Fill[] getFillsByOrderId(ServiceRequest serviceRequest);
	
	@WebMethod
	public Fill[] getFillById(ServiceRequest serviceRequest);
	
	

}
