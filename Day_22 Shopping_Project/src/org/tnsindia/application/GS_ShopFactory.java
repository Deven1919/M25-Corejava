package org.tnsindia.application;

import org.tnsindia.Framework.Normal_acc;
import org.tnsindia.Framework.Prime_Acc;
import org.tnsindia.Framework.Shopping_Factory;

public class GS_ShopFactory  extends Shopping_Factory{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public Prime_Acc getNewPrimeAccount(int accNo, String accNm, float charges, boolean isPrime) {
	GS_PrimeAcc p = new GS_PrimeAcc(accNo,  accNm,  charges,  isPrime);
		return p;
	}

	@Override
	public Normal_acc getNewNormalAccount(int accNo, String accNm, float charges, float deliveryCharges) {
		GS_NormalAcc n= new  GS_NormalAcc( accNo,  accNm,  charges, deliveryCharges);
		return n;
	}

}
