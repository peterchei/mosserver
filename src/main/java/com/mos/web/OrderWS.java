package com.mos.web;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;


import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import com.mos.domain.Order;
import com.mos.service.ServiceRequest;


@WebService
@SOAPBinding(style = Style.RPC)
public interface OrderWS {
	
	@WebMethod
	public Order[] getAllOrders(ServiceRequest request);
	
	@WebMethod
	public Order[] getOrdersByIds(ServiceRequest request);
	
	@WebMethod
	public Order getOrder(ServiceRequest request);


}
