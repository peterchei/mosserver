package com.mos.web;

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
	public List<Order> getAllOrders(ServiceRequest request);
	
	@WebMethod
	public List<Order> getOrdersByIds(ServiceRequest request);
	
	@WebMethod
	public Order getOrder(ServiceRequest request);


}
