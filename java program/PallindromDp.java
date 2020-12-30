 
/*
    pallindrom numbers/sequences =>  12321, 1234321, abcba,aba,b,abcdcba
    
    longest pallindromic subsequences from a string  X = abcbadcba=> abcba, bcb, 


*/




public class PallindromDp{
	


   static int  lcsDp(String X, String Y, int m, int n ){

    int t[][]= new int [m+1][n+1];

    		    //initialization	
			for(int i =0;i<m+1;i++) {
				
				for(int j=0;j<n+1;j++) {
				
				t[i][j]=0;
				}
			}
			
			// working with choice diagram 
			
			for(int i=1;i<m+1;i++) {
				for(int j=1;j<n+1;j++) {

					if( X.charAt(i-1)==Y.charAt(j-1))
						{
						  t[i][j]= 1+t[i-1][j-1];
						}
					else 
					{
					  t[i][j]= Math.max(t[i-1][j],t[i][j-1]);
					}
						
				}
			}
		
		return    t[m][n];	
   

   }




public static void main(String [] args){
	
  PallindromDp pd= new PallindromDp();


  String X ="agbcba";
   int m= X.length();
  
  String Y = "";

  for(int i=m-1;i>=0;i--){
 
    Y+= X.charAt(i);
  }
  
  //System.out.println(Y);

  int n = Y.length();



System.out.println("Longest pallindromic Subsequence is : " +pd.lcsDp(X,Y,m,n));  

// minimum number of deletions to make it pallindromic subsequence... 
int z = m-lcsDp(X,Y,m,n);
System.out.println("Minimum No of deletions are : " +z);

}


}