package com.mos.web;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import com.mos.domain.Order;
import com.mos.workflow.request.CancelOrderRequest;
import com.mos.workflow.request.CancelReplaceOrderRequest;
import com.mos.workflow.request.NewOrderRequest;


@WebService
@SOAPBinding(style = Style.RPC)
public interface OrderWS {
	
	@WebMethod
	public Order[] getAllOrders(int numberOfDays);
	
	@WebMethod
	public Order[] getOrdersByIds(long orderIds[]);
	
	@WebMethod
	public Order getOrder(long orderId);

	@WebMethod
	public void showWorkflowRequest(NewOrderRequest request, CancelOrderRequest request2, CancelReplaceOrderRequest request3);

}
