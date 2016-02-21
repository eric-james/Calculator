package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void Addtest1() {
		Calculator calc = new Calculator();
		calc.add(5);
		calc.add(7);
		int total= calc.getTotal();
		assertEquals(total, 12);
	}
	@Test
	public void Addtest2() {
		Calculator calc = new Calculator();
		calc.add(5);
		calc.add(7);
		calc.add(-2);
		int total= calc.getTotal();
		assertEquals(total, 10);
	}	
	@Test
	public void subtractTest1() 
	{
		Calculator calc = new Calculator();
		calc.subtract(14);
		calc.subtract(6);
		int total= calc.getTotal();
		assertEquals(-20, total);
	}
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
	@Test
	public void multiplyTest1() 
	{
		Calculator calc = new Calculator();
		calc.multiply(3);
		int total= calc.getTotal();
		assertEquals(total, 0);
	}
	@Test
	public void multiplyTest2() 
	{
		Calculator calc = new Calculator();
		calc.add(7);
		calc.multiply(3);
		int total= calc.getTotal();
		assertEquals(total, 21);
	}
	@Test
	public void divideTest1() 
	{
		Calculator calc = new Calculator();
		calc.add(15);
		calc.divide(5);
		int total= calc.getTotal();
		assertEquals(total, 3);
	}
	@Test
	public void divideTest2() 
	{
		Calculator calc = new Calculator();
		calc.add(20);
		calc.divide(0);
		int total= calc.getTotal();
		assertEquals(total, 0);
	}
	@Test
	public void calcTest() 
	{
		Calculator calc = new Calculator();
		int total= calc.getTotal();
		assertEquals(total, 0);
	}
}
