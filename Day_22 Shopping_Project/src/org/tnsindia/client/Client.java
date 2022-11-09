package org.tnsindia.client;

import org.tnsindia.Framework.Normal_acc;
import org.tnsindia.Framework.Prime_Acc;
import org.tnsindia.Framework.Shopping_Factory;
import org.tnsindia.application.GS_NormalAcc;
import org.tnsindia.application.GS_PrimeAcc;
import org.tnsindia.application.GS_ShopFactory;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shopping_Factory s=new GS_ShopFactory();
		Prime_Acc p=new GS_PrimeAcc(12121, "A", 840, true);
		Normal_acc n=new GS_NormalAcc(13171, "B", 840,50 );
		
		System.out.println("Prime Account Details: ");
		p.bookproduct(p.getCharges());
		
		System.out.println();
		System.out.println("Normal Account Details: ");
		n.bookproduct(n.getCharges());
		
		//System.out.println(p);
		//System.out.println(n);

	}

}
