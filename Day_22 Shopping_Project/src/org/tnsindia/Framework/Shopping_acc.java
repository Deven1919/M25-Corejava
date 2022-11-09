package org.tnsindia.Framework;

public abstract class Shopping_acc {
// It contain abstract & non abstract method
// any method inside the Interface is by default abstract.
	
	private int accNo;
	private String accNm;
	private float charges;
	public Shopping_acc(int accNo, String accNm, float charges) {
		super();
		this.accNo = accNo;
		this.accNm = accNm;
		this.charges = charges;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getAccNm() {
		return accNm;
	}
	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}
	public float getCharges() {
		return charges;
	}
	public void setCharges(float charges) {
		this.charges = charges;
	}
	@Override
	public String toString() {
		return "Shopping_acc [accNo=" + accNo + ", accNm=" + accNm + ", charges=" + charges + "]";
	}
	
	abstract public void bookproduct (float charges);
	
	public void items(float charges) {
		System.out.println(charges);
	}
}
	
	
