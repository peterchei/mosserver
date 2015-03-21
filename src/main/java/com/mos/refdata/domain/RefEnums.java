package com.mos.refdata.domain;

import javax.persistence.Entity;

public interface RefEnums {

	public enum AccountType {
		TOP, SUB, REG
	}

	public enum InstrumentType {
		COM, EDG, OTC
	}

	public enum InstrumentSubType {
		STK, ETF, WAR, BON, NOTE, RET
	}

	enum HolidayType {
		Trade, Settlement
	}
}
