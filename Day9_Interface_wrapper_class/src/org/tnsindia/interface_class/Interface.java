package org.tnsindia.interface_class;



	
	
	
	public interface A 
	{
		public void print();

	}
	class B implements A
	{
		public void print()
		{
			System.out.println("Hey Guys,Welcome to the concept of interfaces");
		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj=new B();
		obj.print();
	}

}
