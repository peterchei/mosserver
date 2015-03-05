package com.mos.refdata.domain;

public class Holiday {

	enum HolidayType {
		Trade, Settlement
	}

	private int date;

	/*
	 * Date in yyyyMMdd format
	 */
	public int getDate() {
		return date;
	}

}
