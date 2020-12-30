package com.filehandling;
import java.io.*;

public class BufferedStreamExample {
	
	public static void main(String args[]) throws Exception{
		
		File f= new File("E:new folder/BufferedDemo.txt");
       
		if(f.exists()) {
			
			System.out.println("File Exists");
		}
		
		else {
			f.createNewFile();
		}
		
		FileWriter fw = new FileWriter(f);
		FileReader fr= new FileReader(f);
		BufferedWriter bw = new BufferedWriter(fw);
		BufferedReader br = new BufferedReader(fr);
		bw.write("Hello Mursu");
		char[] ch = new char[(int)f.length()];
		 br.read(ch);
		String fc= new String(ch);
		System.out.println(fc);
		br.close();
		bw.flush();
		bw.close();
	}

	
	
	
}
