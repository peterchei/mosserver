package com.mos.workflow.request;

import java.math.BigDecimal;
import java.util.Date;


/**
 * 
 * A base class wrapper that decode FIX messages
 * @author peter
 *
 */
public class MessageWrapper {
	
	private String clientId;
	private String side;
	private long ordQty;
	private BigDecimal price;
	private String basketName;
	private String exchangeName;
	private String symbol;
	private Date tradeDate;
	private Date settlementDate;
	
	

	
}
