package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest 
{

	// test basic add function
	@Test
	public void Addtest1() {
		Calculator calc = new Calculator();
		calc.add(5);
		calc.add(7);
		int total= calc.getTotal();
		assertEquals(total, 12);
	}
	
	// test basic add function with a negative number
	@Test
	public void Addtest2() {
		Calculator calc = new Calculator();
		calc.add(5);
		calc.add(7);
		calc.add(-2);
		int total= calc.getTotal();
		assertEquals(total, 10);
	}	
	
	// test basic subtraction function
	@Test
	public void subtractTest1() 
	{
		Calculator calc = new Calculator();
		calc.subtract(14);
		calc.subtract(6);
		int total= calc.getTotal();
		assertEquals(-20, total);
	}
	
	// test basic subtraction function with negative number
	@Test
	public void subtractTest2() 
	{
		Calculator calc = new Calculator();
		calc.subtract(14);
		calc.subtract(6);
		calc.subtract(-5);
		int total= calc.getTotal();
		assertEquals(-15, total);
	}
	
	// test basic multiplication function when empty total
	@Test
	public void multiplyTest1() 
	{
		Calculator calc = new Calculator();
		calc.multiply(3);
		int total= calc.getTotal();
		assertEquals(total, 0);
	}
	
	// test basic multiplication function with calculated total
	@Test
	public void multiplyTest2() 
	{
		Calculator calc = new Calculator();
		calc.add(7);
		calc.multiply(3);
		int total= calc.getTotal();
		assertEquals(total, 21);
	}
	// test basic multiplication function with calculated total and a negative number
		@Test
		public void multiplyTest3() 
		{
			Calculator calc = new Calculator();
			calc.add(7);
			calc.multiply(-3);
			int total= calc.getTotal();
			assertEquals(-21, total);
		}
		
	// test basic divide function
	@Test
	public void divideTest1() 
	{
		Calculator calc = new Calculator();
		calc.add(15);
		calc.divide(5);
		int total= calc.getTotal();
		assertEquals(total, 3);
	}
	
	// test basic divide function when dividing by zero
	@Test
	public void divideTest2() 
	{
		Calculator calc = new Calculator();
		calc.add(20);
		calc.divide(0);
		int total= calc.getTotal();
		assertEquals(total, 0);
	}
	
	// test basic divide function when dividing by negative number
	@Test
	public void divideTest3() 
	{
		Calculator calc = new Calculator();
		calc.add(20);
		calc.divide(-5);
		int total= calc.getTotal();
		assertEquals(-4, total);
	}
	
	// test getHistory function when no operations have been performed
	@Test
	public void getHistoryTest1() 
	{
		Calculator calc = new Calculator();
		String history = calc.getHistory();
		assertEquals("0", history);
	}
	// test getHistory with multiple operations
	@Test
	public void getHistoryTest2() 
	{
		Calculator calc = new Calculator();
		calc.add(5);
		calc.subtract(4);
		calc.multiply(10);
		calc.add(13);
		calc.divide(4);
		calc.add(7);
		String history = calc.getHistory();
		assertEquals("0 + 5 - 4 * 10 + 13 / 4 + 7", history);
	}	
	
	// test getHistory with multiple operations including negative numbers
	@Test
	public void getHistoryTest3() 
	{
		Calculator calc = new Calculator();
		calc.add(5);
		calc.subtract(4);
		calc.multiply(-10);
		calc.add(13);
		calc.divide(4);
		calc.add(-7);
		String history = calc.getHistory();
		assertEquals("0 + 5 - 4 * -10 + 13 / 4 + -7", history);
	}	
	
	// test Calculator constructor does not return null
	@Test
	public void calcTest() 
	{
		Calculator calc = new Calculator();
		int total= calc.getTotal();
		assertEquals(total, 0);
	}
}
