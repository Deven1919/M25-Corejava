package org.tnsindia.framework;

public abstract class CurrentAccount extends BankAccount  {
	private final float creditLimit;
	
	
	public CurrentAccount(int accNo, String accNm, float accBal,float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit=creditLimit;
	}
	
	public void withdraw (float accBal) 
	{
		
		float totalAmount= accBal;
		if(creditLimit >=40000)
		{
			System.out.println("you exceed your limt!"+" ,"+"Your current Balance:"+this.getAccBal());
			
		}else if(creditLimit <= 40000) {
			float data=  accBal - this.creditLimit ;
			
			System.out.println("Your transcation is in process!"+", "+"Account Balance:"+data);
			
		} else {
		 // Here is money is not with drawn then it can show all the details.
		System.out.println("Account No is:"+" "+this.getAccNo()+" ,"+"Account Name is:"+this.getAccNm()+ ", "
				+"Account Balance is:"+"  "+(totalAmount));
	}
	}
	
	@Override
	public String toString() {
		return String.format("CurrentAccount [creditLimit=%s]", creditLimit);
	}

	
	
	
}






	
	

