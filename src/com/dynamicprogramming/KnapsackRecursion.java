/*  Knapsack is the first problem in DP. Knapsack is also known as a bag which we carry on shoulders...
 * a Knapsack problem contains a weight array wt[], a value array val[], and the capacity of the knapsack C...
 * In a normal knapsack problem We should have to find the optimal solution(maximum/minimum) and have a choice based on given array of wt and value  
 *  
 *  for eg.  wt[]: {1,2,4,5}
 *          val[]: {2,3,5,7}
 *          Capacity: 5
 *  we have to find the maximum profit in the kanpsack that we can have....
 * 
 *          
 *          this problem can be solve by no of mehtods 
 *          1-> Recursion
 *          2-> Memoization
 *          3-> top down (Dp)
 */
 

package com.dynamicprogramming;


public class KnapsackRecursion {

	  static int max (int a, int b) {
		  
		  

		  return (a>b)?a:b;
	  }
	  
	
	  static int knapsack(int C, int wt[], int val[] , int n) {
		  
		  
		  if(n==0||C==0)
			  return 0;
		  
		  if(wt[n-1]>C)
			  return knapsack(C, wt, val, n-1);
		  
		  else 
		 return max(val[n-1]+knapsack(C-wt[n-1], wt, val, n-1), knapsack(C, wt, val, n-1));
		  
	  }
	  
	
	
	public static void main(String[] args) {
		 
		int []val= new int []{1,6,10,16};
		int wt[] = new int[] {1,2,3,5};
		int C= 7;
		
		int n= val.length;
		
		System.out.println(knapsack(C,wt,val,n));
	}

}
