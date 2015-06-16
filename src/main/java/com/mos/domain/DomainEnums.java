package com.mos.domain;

public interface DomainEnums {

	public enum OrderStatus {
		NONE, ERROR, VERIFIED, FILLED, CLOSED, CANCELLED, COMPLETED
	}

	public enum AllocStatus {
		NEW, ERROR, AMEND, CANCELLED
	}

	public enum AVGStatus {
		NONE, ERROR, OPEN, CLOSED
	}

	public enum FillStatus {
		NONE, ERROR, NEW, AMEND, CANCELLED
	}

	public enum ConfStatus {
		NONE, PENDING_SEND, SENT, ACKED, CONFIRMED
	}

	public enum CtmStatus {
		NONE, SENT, RBT, RBC, AFFRIAMED, REJECTED, CANCELLED
	}

	public enum BookingStatus {
		NONE, SENT, ACKED, BOOKED, REJECTED
	}

	public enum TaskStatus {
		NONE, NEW, IN_PROGRESS, CLOSED, CANCELLED
	}

	public enum Priority {
		LOW, NORMAL, HIGH, URGENT
	}

	public enum FlowType {
		SS, PT, DMA, ATS, EDG, HFT, CVB, SYC
	}

	public enum AllocType {
		BLOCK, TRADE, EOD
	}

	public enum Capacity {
		Agency, Principal, Mixed
	}

	public enum CommissionType {
		BPS, CPS, FLAT, PERCENT
	}

	public enum TaskType {
		FIGURATION, CLIENTSERVICING, BOOKING, TRADEMANAGEMENT, CONFIRMATION, SETTLEMENT, REFDATA
	}

	public enum PaymentMethod {
		DVP, FOP, TBA
	}

	public enum EntityType {
		ORDER, FILL, ALLOC, APG, TRADE
	}

	public enum ClientRegion {
		AS, EM, JP, AM, AU
	}

	public enum Side {
		B("Buy"), S("Sell"), SS("ShortSell"), SE("ShortSellExcempt");

		private String displayName;

		private Side(String displayName) {
			this.displayName = displayName;
		}

		public String getDisplayName() {
			return displayName;
		}
	}

	public enum LegType {
		TRADE, EOD, BOOKTRANSFER
	}

}
