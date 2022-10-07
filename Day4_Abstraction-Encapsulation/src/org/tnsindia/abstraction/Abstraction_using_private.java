package org.tnsindia.abstraction;



class Salary
{
	//private variable
	private float salary;

	//setters and getters to access private data members into another class
	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	
}


public class Abstraction_using_private {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Salary a = new  Salary();
		  a.setSalary(50000);
		System.out.println("The monthly salary:"+a.getSalary());

	}

}
