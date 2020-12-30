
public class CountSubsetSum{
 
 static int isSubset(int arr[],int sum)
    
    {         
       if(arr.length==0||sum<=0) {
     
             return 0;
   }
            

       int n = arr.length;

         int t[][] = new int[n+1][sum+1];
   

       //initializing the matrix
    
       for(int i=0;i<=n;i++){

          t[i][0]=0;
       }
   
      for(int j=0;j<=sum;j++){
       if(arr[0]==j) {
        t[0][j]=1;
      }
}
    // working for choice diagram

    for(int i=1;i<=n;i++){

   for(int j=1;j<=sum;j++){

      int include = 0;
      int exclude=0;


     if(arr[i-1]<=j){

       include = t[i-1][j] + t[i-1][j-arr[i-1]];

     }

     else  {

      exclude= t[i-1][j];


     }
         t[i][j]=include+exclude;

   } 


    }

       return t[n][sum];    
}


public static void main (String args[]){

 
   int arr[]= {1,5,6,11};
   int sum=11;
  

  System.out.println(CountSubsetSum.isSubset(arr,sum));
}

}