package org.tnsindia.client;
import org.tnsindia.application.MMBankFactory;
import org.tnsindia.application.MMCurrentAccount;
import org.tnsindia.application.MMSavingAccount;
import org.tnsindia.framework.BankFactory;
import org.tnsindia.framework.CurrentAccount;
import org.tnsindia.framework.SavingAccount;
import java.util.Scanner;


public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		BankFactory b=new MMBankFactory();
		SavingAccount s=new MMSavingAccount(112646, "Adi", 50000, true);
		CurrentAccount c=new MMCurrentAccount(5644 , "Bavna", 50000 , 4000);
		
		System.out.println();
		System.out.println("Saving Account details : "); 
		s.withdraw(s.getAccBal());
		System.out.println();
		System.out.println("Current Account details : "); 
		c.withdraw(c.getAccBal());
		System.out.println();
		System.out.println(s); 
		System.out.println(c); 
	}

}





