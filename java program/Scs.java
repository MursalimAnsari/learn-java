

//  SCS=>  Shortest common Supersequence...
//  Given Two Strings X and Y such that we have to take the common String of the two to make it shortest and print the length of the String formed...
// Example  Y="abcdaf" X="acbcf"  SCS=""...


public class Scs{
	
	static int lcs(String X, String Y, int m, int n){

      int t [][]= new int [m+1][n+1];

      for(int i=0;i<m+1;i++){

      for(int j=0;j<n+1;j++){

         t[i][j]= 0;

      }

     }

     for(int i=1;i<m+1;i++){

      for(int j=1;j<n+1;j++){

      if(X.charAt(i-1)==Y.charAt(j-1)){

      	 t[i][j]= 1+t[i-1][j-1];
      }

      else{

       t[i][j]= Math.max(t[i-1][j],t[i][j-1]);

      }


      }

     }
 
     return  t[m][n];


	}




public static void main (String [] args){
	
Scs s= new Scs();

String X= "acbcf";
String Y= "abcdaf";

int m= X.length();
int n= Y.length();


s.lcs(X,Y,m,n);

int z = m+n;

int w = z-lcs(X,Y,m,n);

System.out.println("Length of Shortest Common SuperSequence is : " +w);

}
 

  }