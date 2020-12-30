
public class LongestCommonSubstring {

	
	 public static int lcs( String X, String Y) {
		
		int m = X.length();
		int n = Y.length();

		int max=0;

		int t[][]= new int [m+1][n+1];
		  
		    //initialization	
			for(int i =0;i<m;i++) {
				
				for(int j=0;j<n;j++)  
				{
					if( X.charAt(i)==Y.charAt(j))
						
						{
							if(i==0||j==0)  { t[i][j]=1; 

							}
					 
                           else
                           
                           {
                           	  t[i][j]= t[i-1][j-1]+1;
                             
                             }
					
						
						if(max<t[i][j])
						
					
							max=t[i][j];
					}
				   }
				 }
			
		
		return max;	
	}
	
	
	 


	public static void main(String[] args) {
		LongestCommonSubstring l= new LongestCommonSubstring();
		
		String X = "ababnmj";
		String Y = "bnmjcnmj";
		 
     	System.out.println("Longest Common Substring is: " +l.lcs(X,Y));
		
	}

}
