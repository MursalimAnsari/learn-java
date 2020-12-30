package com.filehandling;
import java.io.*;
import java.util.*;



public class JavaUtilScannerExample {

	public static void main (String args[]) throws IOException {
		
		 String s= "Welcome Mursu";
		 Scanner sc = new Scanner(s);
        	System.out.println("Boolean Result:" +sc.hasNext());
        		
        	System.out.println("String:" +sc.nextLine());
		   sc.close();
		
		 System.out.println(" <------ Enter your details ------> :");
		 
		 Scanner in = new Scanner(System.in);
		   
		 System.out.println("Enter your name:");
		 String name= in.next();
		 System.out.println("Name: " +name);
		 
		 System.out.println("Enter your age:");
		 int age= in.nextInt();
		 System.out.println("Age: " +age);
		 
		 System.out.println("Enter your salary:");
		 double salary= in.nextDouble();
		 System.out.println("Salary: " +salary);
		 
		 
		   
	}
	
	
}
