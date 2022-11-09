package org.tnsindia.Framework;

public abstract class Shopping_Factory {
	public abstract Prime_Acc getNewPrimeAccount(int accNo, String accNm, float charges, boolean isPrime);
	public abstract Normal_acc getNewNormalAccount(int accNo, String accNm, float charges, float deliveryCharges);

}
