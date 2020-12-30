 
import java.util.Arrays;

public class CountSubset{
	
	  public static int minPartition(int arr[]){

	   int sum = Arrays.stream(arr).sum();

	     boolean t[][]= new boolean[arr.length+1][sum+1];

	     for(int i=0;i<=arr.length;i++){

	      t[i][0]=true;

	      for(int j=1;i>0&&j<=sum; j++){

	         t[i][j]=t[i-1][j];


	         if(arr[i-1]<=j){

	           t[i][j] |= t[i-1][j-arr[i-1]];

	         }
	         
	         }

	      }   

	        int j = sum/2;

	        while(j>=0 && !t[arr.length][j]) {
	           j--;
	     }
	         return sum-2*j;
	  }


	public static void main(String args []){
		
	    
	   int arr[]={1,6,11,5};
	   System.out.println("Minimum Differenc is :" +minPartition(arr));
	}

	}