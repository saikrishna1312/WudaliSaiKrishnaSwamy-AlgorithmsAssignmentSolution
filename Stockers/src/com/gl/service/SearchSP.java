package com.gl.service;

public class SearchSP {
	
	public static void binarySearch(double arr[], int first, int last, double key){  
		   int mid = (first + last)/2;  
		   while( first <= last ){  
		      if ( arr[mid] < key ){  
		        first = mid + 1;     
		      }else if ( arr[mid] == key ){  
		        System.out.println("Stock of value " + arr[mid] + " is present.");  
		        break;  
		      }else{  
		         last = mid - 1;  
		      }  
		      mid = (first + last)/2;  
		   }  
		   if ( first > last ){  
		      System.out.println("Value not found!");  
		   }  
		 }  
	
}
