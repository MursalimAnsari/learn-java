package com.dynamicprogramming;

public class FibbonacciNoUsingRecursion {

         static int fib(int n) { 
		 while(n<=1)
		 { return n;
		
	 } 
		 return fib(n-1)+fib(n-2);  //Recursive code for fibonacci no
         }
 
	
	public static void main(String[] args) {
	 
     int n=4;
     System.out.println(fib(n));

}
}