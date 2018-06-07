package es.hackerrank.day20.sorting;

import java.util.Scanner;

class Solution {
	 
	 public static void main(String[] args) {
		// Scanner in = new Scanner(System.in);
	        int n = 3;
	        int[] a = {3,2,1};
	        int numberOfSwaps = 0;
	        boolean flag = true;  
	        while ( flag )
	        {
	        	flag= false; 
	        	
	            int temp=0;
	         for (int j = 0; j < n - 1; j++) {
	                if (a[j] > a[j + 1]) {
	                	
	                	temp=a[j];
	                	a[j]=a[j+1];
	                	a[j+1]=temp;
	                    numberOfSwaps++;
	                    flag=true;
	                }
	            	
                              
	            }
	             
	            }
	            
	            
	            
	                  
	        System.out.println("Array is sorted in "+numberOfSwaps +" swaps.");
		    	   System.out.print(a[0]);
		    	   System.out.print(a[a.length-1]);
	      
         
	 }

	
	 
	 
	 
}
