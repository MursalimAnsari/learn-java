 package com.filehandling;
import java.io.*;

public class FileReaderExample {

	public static void main(String args []) throws IOException{
		
	File f = new File("E:/new folder/newFile.txt");
	
	FileReader fr = new FileReader(f);
	 
	  char [] ch = new char[(int)f.length()];
	
	fr.read(ch);
	String fc = new String(ch);
	System.out.println(fc);
		
	 
	
	
	}
	
	
}
	