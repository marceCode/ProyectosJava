package es.hackerrank.challenge30days;

import java.util.*;

public class Day10 {

	
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        
		
		 int remainder;
		 int i=0 ,tempo=0, f=0;
		 while (n>0) {
			 remainder = n%2;
			    n = n/2;
			    
			    
			    if (remainder==1) {
					i++;
					tempo=i;
				}else{
					
					i=0;
					
				}
			    
			    if (tempo>=i) {
			    	if (f!=0 ) {
			    		if (tempo>f) {
							f=tempo;
						}
					}else{
						f=tempo;
					}
				}
			   
		}
		 
		
		 
		 System.out.println(f);
		
	    }
	 
	 
	
}
