package org.tnsindia.eum_and_regular_expression;

public class EnumMeal_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// It can give only breakfast value
      Meal obj1=Meal.BREAKFAST;
      // For getting all the value use for loop
      
      for(Meal m: Meal.values()) {
    	  System.out.println(m.getValue());
    	  System.out.println(m);

      }
      
	}

}
