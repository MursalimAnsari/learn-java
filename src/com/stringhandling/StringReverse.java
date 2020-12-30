package com.stringhandling;
import java.util.*;
import java.io.*;

public class StringReverse {

	public static void main(String[] args) throws Exception {
	     String s, reverse="";
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the String :");
				s = sc.nextLine();
				int len= s.length();
				for (int i=len-1;i>0;i--) {
					
					reverse+= s.charAt(i);
					
				}
				
				System.out.println(reverse);
	
	}

}
