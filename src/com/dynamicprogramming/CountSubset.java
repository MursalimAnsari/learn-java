package com.dynamicprogramming;
 

/**
 * @author Mursalim
 *
 */

  
public class CountSubset {
  
  
  public static int isCount(int []arr , int sum) {
    
    if(arr.length==0||sum<=0) {
      
      return 0;
    }
    
    int n= arr.length;
    
    int T[][]= new int[n+1][sum+1];
    
    for(int i=0; i<=n;i++) {T[i][0]=1;}
    for(int j=0; j<=sum;j++) {
    
      if(arr[0]==j) {
    T[0][j]=1;
      }
    }
    
    
    for(int i=1;i<=n;i++) {
      
      for(int j=1;j<=sum;j++) {
        
        int include=0;
        int exclude=0;
        
        
        if(arr[i-1]<=j) {
          
          include= T[i-1][j] + T[i-1][j-arr[i-1]];
        }
        
        else {
          
          exclude= T[i-1][j];
          
        }
        
        
        T[i][j]=include+exclude;
     }
   }
     
    
    return T[n][sum];
  }
  
  public static void main(String[] args)   {
  
    
    int arr[]= {1,5,6,11};
    int sum= 11;
    //int n= arr.length;
    
    System.out.println(CountSubset.isCount(arr,sum));
    
     
  }
 
}
 