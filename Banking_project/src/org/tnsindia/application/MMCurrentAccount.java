package org.tnsindia.application;

import org.tnsindia.framework.CurrentAccount;

public class MMCurrentAccount extends CurrentAccount {

	public MMCurrentAccount(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "MMCurrentAccount []";
	}


	

}