package org.tnsindia.Framework;

public abstract class Prime_Acc extends Shopping_acc {

	private boolean isPrime;
	static final private float deliveryCharges=0;
	public Prime_Acc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges);
		this.isPrime = isPrime;
	}
	
	
	public void bookproduct(float charges) {
		System.out.println("Account NO:"+this.getAccNo()+","+"Account Name:"+this.getAccNm()
		+","+"Charges is: "+this.getCharges());
	}


	@Override
	public String toString() {
		return "Prime_Acc [isPrime=" + isPrime + "]";
	}


	
	
}
