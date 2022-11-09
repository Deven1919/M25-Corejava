package org.tnsindia.client;
import org.tnsindia.application.MMBankFactory;
import org.tnsindia.application.MMCurrentAccount;
import org.tnsindia.application.MMSavingAccount;
import org.tnsindia.framework.BankFactory;
import org.tnsindia.framework.CurrentAccount;
import org.tnsindia.framework.SavingAccount;


public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankFactory b=new MMBankFactory();
		SavingAccount s=new MMSavingAccount(112646, "A", 500000, true);
		CurrentAccount c=new MMCurrentAccount(5644 , "B", 254000 , 1554);
		System.out.println();
		System.out.println("Saving Account is : "); 
		s.withdraw(s.getAccBal());
		System.out.println();
		System.out.println("Current Account is : "); 
		c.withdraw(c.getAccBal());
		System.out.println();
		System.out.println(s); 
		System.out.println(c); 
	}

}





