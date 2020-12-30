package com.filehandling;

import java.io.*;


public class FileWriterExample {
	
	 public static void main(String args[]) throws IOException{
		 
		 File f = new File("E:new folder/newFile.txt");
		 
	        if(f.createNewFile()) {
			 
			 System.out.println("file is created!");
		 }
		 
		 else {
			System.out.println("File already Exists!");
		}
		 
		 
		 
		 FileWriter fw =  new FileWriter(f, true);
		  fw.write("Mursu "); 
		  System.out.println("\n");
		 fw.close();
		 
		 
			
		 
		 
	 }
	

}
