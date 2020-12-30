/**
 * 
 */
package com.recursion;
import javax.swing.*;
/**
 * @author Mursalim
 *
 */
public class FactorialUsingRecursionAndJfx {

	  
	public static void main(String[] args) {
		
		String input;
		long number;
		  
		  input = JOptionPane.showInputDialog("Enter a " + "nonnegative integer :");
		
		  number = Long.parseLong(input);
		  
		  JOptionPane.showMessageDialog(null, number + "! is "+  factorial(number));

		  System.exit(0);
		  
	}

	private static long factorial(long number) {
		 
		if(number==0) {
			return 1;
		}
		
		
		else {
			
			return number*factorial(number-1);
			
		}
			
			
		 
	}

}
