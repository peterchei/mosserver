package com.mos.domain;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

import com.mos.domain.DomainEnums.LegType;
import com.mos.domain.DomainEnums.Side;


/**
 * The persistent class for the TRADELEG database table.
 * 
 */
@Entity
@NamedQuery(name="TradeLeg.findAll", query="SELECT t FROM TradeLeg t")
public class TradeLeg implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8937826689250283535L;

	@Id
	private long tradeLegId;

	private long accountId;

	private long averagePrcGrpId;

	private long bookId;

	private long clientTradeId;

	private long orderId;

	@Enumerated(EnumType.STRING)
	private LegType legType;
	
	private Side side;

	public TradeLeg() {
	}


}  