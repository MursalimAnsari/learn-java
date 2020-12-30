package com.arraypractice;

public class HeapSort {
	

		
		static void heapify(int arr[], int n, int i ) {
			
			int largest =i;
			int l=2*i+1;
			int r= 2*i+2;
			
			if(l<n && arr[l]> arr[largest])
				largest= l;
			
			if(r<n && arr[r]>arr[largest])
				largest = r;
			
			if(largest!=i) {
				
				int swap= arr[i];
				arr[i]=arr[largest];
				arr[largest]=swap;
			
				heapify(arr , n, largest);
			}
			
		}
		
		
		static void printArray(int arr[]) 
	    { 
	        int n = arr.length; 
	        for (int i=0; i<n; ++i) 
	            System.out.print(arr[i]+" "); 
	        System.out.println(); 
	    } 
	  
		
	
	

	public static void main(String[] args) {
		 
	     int arr[]= {4,1,3,2,16,9,10,14,8,7};
	     
	     int n = arr.length;
	     int i=0;
	     
	     HeapSort hs = new HeapSort();
	     
	   hs.heapify(arr, n, i);  
	     printArray(arr);
	}

}
