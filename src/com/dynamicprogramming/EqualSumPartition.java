/**
 * 
 */
package com.dynamicprogramming;

/**
 * @author Mursalim
 *
 */
public class EqualSumPartition {

	public boolean canPartition(int []a, int n) {
		 
	int sum=0;
	int i, j;
	
	// calculate sum 
	
	for(i=0; i<n; i++) {
		
		sum= sum+a[i];
	}
	
	
	if(sum%2!=0) {
		
		return false;
		
	}
	else {
	boolean t[][]= new boolean[sum/2+1][n+1];
	
	for(i=0; i<=n;i++)
		t[0][i]= true;
	
	for(i=1;i<=n;i++)
		t[i][0]= false;
	
	for(i=1;i<=sum/2;i++) {
		
		for(j=1;j<=n;j++) {
			
			if(i>=a[j-1]) {
				
				t[i][j]= t[i][j]||t[i-a[j-1]][j-1];
				
			}
			
			
			else
			{
				t[i][j]=t[i][j-1];
				
			}
		}
		
	}
	
		 return t[sum/2][n];
	}
	}
	public static void main(String[] args) {
		 
		EqualSumPartition e= new EqualSumPartition();
		
		int [] a = {1,3,5,7,8,9};
		int n= a.length;
		System.out.println(e.canPartition(a,n));
	}

}
