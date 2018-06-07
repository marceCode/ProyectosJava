package es.hackerrank.challenge30days;

import java.util.Scanner;

public class Day9 {
	static int factorial(int n) {
		
		if (n == 0) {
            return 1;
      } else {
    	  
    		  return n * factorial(n - 1);
		
            
      }
		
    }
/*
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        if (n>=2 && n<=12) {
        	int result = factorial(n);
        	System.out.println(result);	
		}
        
        
    }*/
}
