package com.mos.domain;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

import com.mos.domain.DomainEnums.BookingStatus;
import com.mos.domain.DomainEnums.ConfStatus;
import com.mos.domain.DomainEnums.CtmStatus;


/**
 * The persistent class for the CLIENTTRADE database table.
 * 
 */
@Entity
@NamedQuery(name="ClientTrade.findAll", query="SELECT c FROM ClientTrade c")
public class ClientTrade implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private long clientTradeId;

	private long allocationId;

	@Enumerated(EnumType.STRING)
	private BookingStatus bookingStatus;

	private boolean bookingSuppress;

	private boolean confirmSuppress;

	@Enumerated(EnumType.STRING)
	private ConfStatus confStatus;

	@Enumerated(EnumType.STRING)
	private CtmStatus ctmStatus;

	private long exchangeId;

	private long instrumentId;

	private BigDecimal quantity;

	private int settleDate;

	private int tradeDate;

	@Column(name="\"VERSION\"")
	private int version;

	public ClientTrade() {
	}

	public long getClientTradeId() {
		return clientTradeId;
	}

	public void setClientTradeId(long clientTradeId) {
		this.clientTradeId = clientTradeId;
	}

	public long getAllocationId() {
		return allocationId;
	}

	public void setAllocationId(long allocationId) {
		this.allocationId = allocationId;
	}

	public BookingStatus getBookingStatus() {
		return bookingStatus;
	}

	public void setBookingStatus(BookingStatus bookingStatus) {
		this.bookingStatus = bookingStatus;
	}

	public boolean isBookingSuppress() {
		return bookingSuppress;
	}

	public void setBookingSuppress(boolean bookingSuppress) {
		this.bookingSuppress = bookingSuppress;
	}

	public boolean isConfirmSuppress() {
		return confirmSuppress;
	}

	public void setConfirmSuppress(boolean confirmSuppress) {
		this.confirmSuppress = confirmSuppress;
	}

	public ConfStatus getConfStatus() {
		return confStatus;
	}

	public void setConfStatus(ConfStatus confStatus) {
		this.confStatus = confStatus;
	}

	public CtmStatus getCtmStatus() {
		return ctmStatus;
	}

	public void setCtmStatus(CtmStatus ctmStatus) {
		this.ctmStatus = ctmStatus;
	}

	public long getExchangeId() {
		return exchangeId;
	}

	public void setExchangeId(long exchangeId) {
		this.exchangeId = exchangeId;
	}

	public long getInstrumentId() {
		return instrumentId;
	}

	public void setInstrumentId(long instrumentId) {
		this.instrumentId = instrumentId;
	}

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public int getSettleDate() {
		return settleDate;
	}

	public void setSettleDate(int settleDate) {
		this.settleDate = settleDate;
	}

	public int getTradeDate() {
		return tradeDate;
	}

	public void setTradeDate(int tradeDate) {
		this.tradeDate = tradeDate;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}
	
}