package es.hackerrank.day26.nestedLogic;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

class Solution {

	public static void main(String[] args) {
		int fine;
		 Scanner sc = new Scanner(System.in);
	        int dayA = sc.nextInt();
	        int monthA = sc.nextInt();
	        int yearA = sc.nextInt();
	        
	        int dayE = sc.nextInt();
	        int monthE = sc.nextInt();
	        int yearE = sc.nextInt();
	        
	        if ((dayA <=31 && dayE <=31 ) && (monthA <=12 && monthE <=12 )&& (yearA <=3000 && yearE <=3000  )) {
	        	
	        	
	        		if (yearA < yearE) {
						
					
	        		fine=0;
	        		System.out.println("fine " + fine);
					
				}else if(yearA == yearE && monthA<=monthE && dayA <= dayE){
							fine=0;
			        		System.out.println("fine " + fine);
						
						
					
				}else if (dayA > dayE && monthA == monthE && yearA ==yearE) {
					int lateDays= dayA-dayE;
					
					fine=15*lateDays;
					System.out.println("fine " + fine);
				}else if (monthA > monthE && yearA ==yearE) {
					int lateMonths=monthA-monthE ;
					
					fine=500*lateMonths;
					System.out.println("fine " + fine);
				}else if ( yearA >yearE) {
					
					
					fine=10000;
					System.out.println("fine " + fine);
				}
			}
    }
}
