package com.mos.refdata.domain;

public class Holiday {
	
	

	enum HolidayType {
		Trade, Settlement
	}

	private int date;
	private long marketId;

	/*
	 * Date in yyyyMMdd format
	 */
	public int getDate() {
		return date;
	}

}
