package com.modith;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MathUtilsTest {
	
	MathUtils m; 
	
	@BeforeAll
	//Reasn to add static keyword here is because 
	//this will be executed even before class instance is being created
	//so we need to make it static, withut it it fails
	static void beforeAll() {
		System.out.println("Executes before all");
	}
	
	@BeforeEach
	//init gets initialise before every test method.
	void init() {
		System.out.println("Executes before every method");
		m = new MathUtils();
	}
	
	@AfterEach
	void afterEach() {
		System.out.println("After each method is exec");
	}
	
	@AfterAll
	//Similar to before all
	static void afterAll() {
		System.out.println("AfterAll are executed");
	}
	
	

	@Test
	void testAdd() {
		int expected = 3 ;
		int actual = m.add(1, 2);
		assertEquals(expected, actual, "The add method should add two numbers");
	}
	
	
	@Test
	void testArea() {
		assertEquals(314.1592653589793, m.computeAreaOfCircle(10), "Calc radius of circle");
	}
	
	@Test
	void testDivide() {
		assertThrows(ArithmeticException.class, () -> m.divide(1, 0)); 
	}

}
