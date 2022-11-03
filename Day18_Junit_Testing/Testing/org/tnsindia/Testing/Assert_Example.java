package org.tnsindia.Testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Assert_Example {

	@Test
   public	void equals() {
		//Execute when both parameter are matched  & vice versa.
		assertEquals(9,9);
	}

	
	@Test
	public void show() {
		// Exceute when value is  null & vice versa.
		assertNull(null);
	}
	@Test
	public void accept() {
		// It only shows the false value.
		boolean a= false;
		if(a==true) {
			assertFalse(false);
		} else {
			assertFalse(true);
		}
		
	}
	@Test
	public void print() {
	
		assertNotNull(15);
		// Execute when their is not any null value.
	}
	
	
	}


