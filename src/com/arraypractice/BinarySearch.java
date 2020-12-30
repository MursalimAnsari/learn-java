/*   A binary search algorithm is more efficient than a linear search 
 *   the main codition to perform binary search is that the array should be sorted, if not sorted then first sort the array and then apply the logic
 *   we use the index of the array and find the mid element of the array by using condition mid =(start+end)/2
 *   1-> if target == a[mid] return mid
 *   2-> elseif(key<a[mid]) then set end= mid-1
 *   3-> else  set start = mid+1
 * 
 * */


package com.arraypractice;

public class BinarySearch {

	
	public static int binarySearch(int a[], int key) {
		
	int start =0;
	int end = a.length-1;
	
	while(start<=end) {
		
		int mid= (start+end)/2;
		
		if(key==a[mid]) {
			return mid;
			
		}
		
		if(key<a[mid]) {
				
			end = mid-1;
			
		}
		
		else {
			
			start= mid+1;
			
		}
		
		
	}
	return -1;  
  	 
	
}
	
	
	public static void main(String[] args) {
		
		int a[] ={2,3,4,98,99};
        	int key= 4;
		System.out.println("Element found at : " +binarySearch(a, key));
		
	}

}
