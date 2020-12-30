package com.arraypractice;

public class LinearSearch {

	public static int linearSearch(int a[] , int key) {
		 int size = a.length;
		 
		 for(int i=0; i<size;i++) {
			 
			 if(a[i]==key) {return i;}
		 }
		 return -1;
		
		
	}
	
	
	public static void main(String[] args) {
		
		int a[]= {1,4,3,5,-6,6,40,65,7};
		int key=7;
	 
		System.out.println("key found at : " + linearSearch(a, key));
		
	}

}
