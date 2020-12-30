public class SequencePatternMatching{
	

static  int lcs (String X, String Y){


    	int m = X.length();
        int n = Y.length();
  
       int t[][] = new int [m+1][n+1];

       for(int i=0; i<m+1; i++){

         for(int j=0; j<n+1; j++){

             t[i][j]=0;

         }

       }


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


 public static void main(String []args){
  
   SequencePatternMatching spm = new SequencePatternMatching();

   /*
   String X= "AXY";
   String Y= "ABCXMNY";  
*/
    

  String X= "amdf";
  String Y="abcmxgd";

 //System.out.println("LCS : " +spm.lcs(X,Y));

  int len = lcs(X,Y);

  if(X.length()==len){

    System.out.println("true");

  }

  else { 

       System.out.println("False");
   }



 }

}







          







