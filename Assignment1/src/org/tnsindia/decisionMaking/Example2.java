package org.tnsindia.decisionMaking;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=11,b=7, c=23;
		if(a>b && a>c) //Cascaded if...else if loop
		{
			System.out.println(a);
		}
		else if (b>a && b>c)
		{
			System.out.println(b);
		}
		else 
		{
			System.out.println(c);
		}
		
	}

}
