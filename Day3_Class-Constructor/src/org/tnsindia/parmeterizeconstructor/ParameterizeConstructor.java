package org.tnsindia.parmeterizeconstructor;




class Bus{
	
 public int speed;


     Bus(int s1)
  {
	speed=s1;
	System.out.println("The speed is: "+speed+"km/hr");
}
//Default constructor
    public Bus() {
	
	System.out.println("Default Constructor");
}

}



public class ParameterizeConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Bus b= new Bus();
           Bus b1=new Bus(60);
           
	}

}
