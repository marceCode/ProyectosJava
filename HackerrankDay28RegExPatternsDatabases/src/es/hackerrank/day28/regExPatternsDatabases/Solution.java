package es.hackerrank.day28.regExPatternsDatabases;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

	
	
	public static void main(String[] args) {
       
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String datos=null;
        Pattern pattern = Pattern.compile("^.*@gmail.com");
        Pattern pattern2 = Pattern.compile(".*[a-z]{0,20}.*");
        ArrayList<String> lstNames= new ArrayList<>();
        String myDelimiter = " ";
       
        if (n>=2 && n<=30) {
			for (int i = 0; i <= n; i++) {
				datos=sc.nextLine();
				Matcher mat = pattern.matcher(datos);
				if (null!=datos && !("").equals(datos)) {
					if (mat.matches()) {
						
						Matcher matCodition = pattern2.matcher(datos);
						if (matCodition.matches()) {
							String[] s1array = datos.split(myDelimiter);
							lstNames.add(s1array[0]);
							
							
						}
						 
				     } 
				}
				 
				
				
				
		}
        
		}
        lstNames.sort((p1, p2) -> p1.compareTo(p2));
        for (String name : lstNames) {
			System.out.println(name);
		}
	}
}
