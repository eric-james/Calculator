
package cse360assign3;

/**
 * Class to perform basic calculator functions such as adding, subtracting, multiplying, etc. 
 * 
 * @author Eric-James Bryan
 * PIN: 202
 * 
 */

public class Calculator 
{

	private int total;
	private String history;
	
	public Calculator () 
	{
		total = 0;  // not needed - included for clarity
		history = "0";   // initializes the history with a zero
	}
	
	/**
	 * Returns the current running total for the calculator's calculations.
	 * 
	 * @param none
	 * @return an integer total
	 */
	
	public int getTotal () 
	{
		return total;
	}
	
	/**
	 * Takes in an integer and adds it to the calculations list and the total
	 * 
	 * @param new integer to be added
	 */
	
	public void add (int value) 
	{
		total += value;
		
		history = history + " + " + value;
	}
	
	/**
	 * Takes in an integer and subtracts it from the calculations list and the total
	 * 
	 * @param new integer to be subtracted
	 */
	
	public void subtract (int value) 
	{
		total -= value;
		
		history = history + " - " + value;
	}
	
	/**
	 * Takes in an integer and multiplies the current total by this integer.
	 * 
	 * @param new integer to be multiplied
	 */
	
	public void multiply (int value) 
	{
		total = total * value;
		
		history = history + " * " + value;
	}
	
	/**
	 * Takes in an integer and divides the current total by this integer.
	 * 
	 * @param new integer to be divided
	 */
	
	public void divide (int value) 
	{
		if (value == 0)
			total = 0;
		else
			total = total / value;
		
		history = history + " / " + value;
	}
		
	
	/**
	 * Returns the total list of calculations that have been performed by the calculator method
	 * 
	 * @param none
	 * @return string of calculations
	 */
	
	public String getHistory () 
	{
		//System.out.println(history);
		return history;
	}
}