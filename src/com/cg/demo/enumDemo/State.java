package com.cg.demo.enumDemo;

public class State {
//	MAHARASHTRA, TELANGANA, KARNATAKA, GUJRAT 

	public static final State KARNATAKA = null;
	public static final State TELANGANA = null;
	public static final State GUJRAT = null;
	public static State MAHARASHTRA;

	MAHARASHTRA("MH"), TELANGANA("TS"), KARNATAKA("KA"), GUJRAT("GJ");

	public final String stateCode;

	State(String stateCode) {
		this.stateCode = stateCode;
	}

	public String getStateCode() {
		return stateCode;
	}
}
