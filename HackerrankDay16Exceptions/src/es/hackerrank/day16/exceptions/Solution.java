package es.hackerrank.day16.exceptions;

import java.util.Scanner;

public class Solution {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        
        try {
			int valueS=Integer.parseInt(S);
			System.out.println(valueS);
		} catch (Exception e) {
			System.out.println("Bad String");
		}
        
        in.close();
        
    }

}
