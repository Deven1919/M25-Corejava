package org.tnsindia.eum_and_regular_expression;
import org.tnsindia.eum_and_regular_expression.pizzaEnum_Example.Size;
import java.util.Scanner;
public class PizzaEnum_executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the pizza: ");
		String size=s.nextLine();
		//converting String to enum-size of the pizza
		Size s1=Size.valueOf(size.toUpperCase());
		switch(s1)
		{
			case SMALL:
				System.out.println("Preparing small pizza for the customer");
				break;
			case MEDIUM:
				System.out.println("Preparing Medium pizza for the customer");
				break;
			case LARGE:
				System.out.println("Preparing Large pizza for the customer");
				break;
			case EXTRA_LARGE:
				System.out.println("Preparing Extra-Large pizza for the customer");
				break;
				
		}
	}

}
