package org.tnsindia.eum_and_regular_expression;

public enum Meal {
BREAKFAST(10),LUNCH(4),DINNER(8);
	
	private int value;
	
	
	private Meal (int value) {
		this.value=value;
	}
	
	
	
	

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	
	
}
