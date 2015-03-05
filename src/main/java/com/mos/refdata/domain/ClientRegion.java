package com.mos.refdata.domain;

import org.omg.CORBA.PRIVATE_MEMBER;

public enum ClientRegion {

	AS("ASIA"), EM("EMEA"), AM("AM"), AN("AM"), CA("CA"), AU("AU"), JP("JAPAN");

	private ClientRegion(String aName) {
		name = aName;
	}

	private String name;

}
