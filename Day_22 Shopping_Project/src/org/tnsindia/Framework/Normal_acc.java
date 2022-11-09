package org.tnsindia.Framework;

public abstract class Normal_acc extends Shopping_acc {

	
	
	final private float deliveryCharges;

	public Normal_acc(int accNo, String accNm, float charges, float deliveryCharges) {
		super(accNo, accNm, charges);
		this.deliveryCharges = deliveryCharges;
	}
	public void bookproduct(float charges) {
		System.out.println("Account NO:"+this.getAccNo()+","+"Account Name:"+this.getAccNm()
		+","+"Charges is: "+(charges+deliveryCharges));
	}
	@Override
	public String toString() {
		return "Normal_acc [deliveryCharges=" + deliveryCharges + "]";
	}

	
}
