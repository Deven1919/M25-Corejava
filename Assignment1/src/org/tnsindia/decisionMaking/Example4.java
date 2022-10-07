package org.tnsindia.decisionMaking;
import java.util.Scanner;
public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String a=s.nextLine();
		
		switch(a)
		{
			case "Mon":
				System.out.println("Today is Monday");
				break;
			case "Tue":
				System.out.println("Today is Tuesday");
				break;
			case "Wed":
				System.out.println("Today is Wenesday");
				break;
			case "Thu":
				System.out.println("Today is Thursday");
				break;
			case "Fri":
				System.out.println("Today is Friday");
				break;
			case "Sat":
				System.out.println("Today is Satday");
				break;
			case "Sun":
				System.out.println("Today is Sunday");
				break;
			default:
				System.out.println("Invalid input");
		}
		s.close();
	}

}
