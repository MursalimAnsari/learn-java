package com.dynamicprogramming;

public class SubsetSumDp {

	
	static boolean isSubsetSum(int arr[], int n, int sum) {
		
		boolean T[][]= new boolean[sum+1][n+1];
		
		    //  initialization of set 
		    for(int i=0; i<=n;i++)    { T[0][i]=true; }
		
		    for(int i=1;i<=sum;i++)   { T[i][0]=false; }
		
		
		    //  code for subset problem  
		    
		    
		    for(int i=1;i<=n;i++)  

		    {
			
			  for(int j=1;j<=sum;j++) {
				
				 if(arr[i-1]<=j) {
					
					T[i][j]= T[i-1][j] ||  T[i-1][j-arr[i-1]];
				}
				 else if(arr[i-1]>j){
					 T[i][j]= T[i-1][j];
					
				 }
					
			}	
			
		}
		
		return T[sum][n];
	}
	
	
	
	public static void main(String[] args) {
	
		
		int arr[]= {3,2,1,4,5};
		int sum= 6;
		int n= arr.length;
		
		if(isSubsetSum(arr,n,sum)==true) {
			
		System.out.println("Found a subset " +"with given sum");
			
		}
		
		else 
			System.out.println("No subset with " +"given sum");
		
	}

}
