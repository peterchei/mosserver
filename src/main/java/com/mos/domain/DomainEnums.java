package com.mos.domain;

public class DomainEnums {

	public enum OrderStatus {
		NONE, ERROR, VERIFIED, FILLED, CLOSED, CANCELLED, COMPLETED
	}

	public enum AVGStatus {
		NONE, ERROR, OPEN, CLOSED
	}

	public enum FillStatus {
		NONE, ERROR, NEW, CANCELED, AMENDED
	}

	public enum FlowType {
		SS, PT, DMA, ATS, EDG, HFT
	}

	public enum Capacity {
		Agency, Principal, Mixed
	}

	public enum CommissionType {
		BPS, CPS, FLAT, PERCENT
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
