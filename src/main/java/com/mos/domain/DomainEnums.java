package com.mos.domain;

public class DomainEnums {

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

	public enum PaymentMethod {
		DVP, FOP, TBA
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

}
