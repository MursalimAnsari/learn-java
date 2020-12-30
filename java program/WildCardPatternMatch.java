import java.util.*;

public class WildCardPatternMatch{

  public static boolean solution(String str, String pattern){


     boolean t[][] = new boolean [pattern.length()+1][str.length()+1];

      for(int i= t.length-1;i>=0;i--){

       for(int j=t[0].length-1;j>=0;j--){

      if(i==t[0].length-1 && j==t[0].length-1){

        t[i][j]=true;

       } else if(i== t.length-1){

           t[i][j]= false;

       } else if(j== t[0].length-1){
  
           if(pattern.charAt(i)== '*'){

              t[i][j]=t[i+1][j];
           
           } else{
            
              t[i][j]=false;

           }       


       } else{

           
           if(pattern.charAt(i)=='?'){

                t[i][j]= t[i+1][j+1];

           }  else if(pattern.charAt(i)=='*'){

              t[i][j]= t[i+1][j]||t[i][j+1];

           } else if(pattern.charAt(i)==str.charAt(j)){


               t[i][j]= t[i+1][j+1];

           }  else{

                t[i][j]=false;

           }    

       }
     }
   }

    return t[0][0];

 }

public static void main(String [] args){
	

 Scanner sc= new Scanner(System.in);

 String X= sc.next();
 String Y = sc.next();

 System.out.println(solution(X,Y)); 

 }

}