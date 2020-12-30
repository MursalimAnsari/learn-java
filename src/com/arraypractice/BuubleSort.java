package com.arraypractice;

public class BuubleSort {

	public  void bubbleSort(int a[]) {
		
		int n = a.length;
		
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<n-i-1;j++) {
				if(a[j]>a[j+1]) {
					
					int temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
				 
			} 
			 
		}
	   
	}
	
	
	
	public void printArray(int a[]) {
		
		int n = a.length;
		
		for(int i =0; i<n;i++) {
			System.out.println(a[i]+" ");
			//System.out.println();
			
		}
		
		
	}
	
	
	public static void main(String[] args) {
	    BuubleSort b= new BuubleSort();
		int a[] = {4,5,3,2,4,6};
		 b.bubbleSort(a); 
		 System.out.println("Sorted Array");
		 b.printArray(a);
	}

}
