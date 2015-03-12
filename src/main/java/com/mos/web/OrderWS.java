package com.mos.web;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;


import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import com.mos.domain.Order;


@WebService
@SOAPBinding(style = Style.RPC)
public interface OrderWS {
	
	@WebMethod
	public Order[] getAllOrders(int numberOfDays);
	
	@WebMethod
	public Order[] getOrdersByIds(long orderIds[]);
	
	@WebMethod
	public Order getOrder(long orderId);


}
