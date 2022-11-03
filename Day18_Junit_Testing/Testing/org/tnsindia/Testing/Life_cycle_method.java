package org.tnsindia.Testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
@TestInstance(Lifecycle.PER_METHOD)
interface Life_cycle_method {

	@Test
	 default void display() {
		System.out.println("Display method"); // default only use with the interface
	}
	
	@Test
     @BeforeAll   // we cannot create the obj for interface so we have to use another class f
                    // for creating object.
	 default void show() {
		System.out.println("Show method");
	}
	@Test
    @AfterEach
	 default void print() {
		System.out.println("Print method");
	}

}
