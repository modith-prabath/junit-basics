package com.modith;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class MathUtilsTest {
	
	MathUtils m = new MathUtils();
	
	int expected = 3 ;
	int actual = m.add(1, 2);

	@Test
	void test() {
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
