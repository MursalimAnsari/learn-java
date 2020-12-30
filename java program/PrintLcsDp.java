
public class PrintLcsDp {

	
	 static  void lcs(String X,String Y) {

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
	 

      int index= t[m][n];
      int temp = index;

      char[]lcs = new char[index+1];
      lcs[index]='\0';

      int i=m, j=n;


      while(i>0&&j>0){

          if(X.charAt(i-1)==Y.charAt(j-1)){


               lcs[index-1]= X.charAt(i-1);
              i--;
              j--;          	
              index--;
          }

          else if(t[i-1][j]>t[i][j-1]){
          	i--;
          }

          else { j--;}

      }


      System.out.print("X : "+X+"\nY : " +Y +"\nlcs : ");

      for (int k=0;k<=temp ;k++ ) {

      	System.out.print(lcs[k]);
      	System.out.print("");
      	
      }

	}
	
	
	 


	public static void main(String[] args) {
		PrintLcsDp l= new PrintLcsDp();
		
		String X = "acbcf";
		String Y = "abcdaf";
		
         lcs(X,Y);
		
	}

}
