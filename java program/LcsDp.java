
public class LcsDp {

	
  int lcs(String X,String Y) {

		int m = X.length();
		int n = Y.length();
		
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

					if( X.charAt(i-1) == Y.charAt(j-1))
						{
						  t[i][j]= 1+t[i-1][j-1];
						}
					else 
					{
					  t[i][j]= Math.max(t[i-1][j],t[i][j-1]);
					}
						
				}
			}
		
		return t[m][n];	
	}
	
	
	 


	public static void main(String[] args) {
		LcsDp l= new LcsDp();
		/*
		String X = "ababcxdam";
		String Y = "abcbcmd";
		*/

              String X= "AXY";
              String Y= "ABCXMNY";

		System.out.println("Longest Common Subsequence is: " +l.lcs(X,Y));
		
	}

}
