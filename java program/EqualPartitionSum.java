
public class EqualPartitionSum{
	
  static boolean isSubset(int arr[])
     
     {    int n = arr.length;

           int sum =0;

           for(int i=0;i<n;i++){

           sum= sum+arr[i];

           }


           if(sum%2!=0){

            return false;

           }
  else{

     boolean t[][] = new boolean[n+1][sum+1];
    

	  //initializing the matrix
	   
	    for(int i=0;i<n+1;i++){

           t[i][0]=true;
	   }
      
      for(int j=1;j<sum+1;j++){

	      t[0][j]= false;
	   }


	  
     // working for choice diagram

     for(int i = 1; i<=n;i++){

    for(int j=1;j<=sum;j++){

   
      if(arr[i-1]<=j){

        t[i][j]= t[i-1][j] || t[i-1][j-arr[i-1]];

      }

      else  {

       t[i][j]= t[i-1][j];


      }
     

    } 


     }

        return t[n][sum];    
}

}

public static void main (String args[]){

  
    int arr[]= {1,5,6,11};
   System.out.println("is Subset present :"  +isSubset(arr));
}

}