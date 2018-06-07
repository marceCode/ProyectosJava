import java.util.Arrays;
import java.util.Formatter;
import java.util.Scanner;

public class Principal{

	
	/*public  Hit obtainValue(){
		return () -> System.out.println("You hit it!");
			
		}
	*/
	public static void main(String[] args) {
		
		
		int x=0;
		int y=0;
		int num=3;
		
		x=6%2;
		y=3%2;
			
			System.out.println("x = "+x);

			System.out.println("y = "+y);
			
			if (num % 2 ==1){
				
				System.out.println("Weird");
				
			}else if(num>=2 && num<=5){
				
				System.out.println("Not Weird");
			}else if(num>=6 && num<=20){
				
				System.out.println("Weird");
			}else if(num>20){
				
				System.out.println("Not Weird");
			}
		/*
		Scanner scan = new Scanner(System.in);
		Scanner lineTokenizer;
		int lineNum = 0;
		
		    double meal_cost = 15.50;
	        int tip_percent = 15;
	        int tax_percent = 10;
		 	double totalCost;
	        double tip= meal_cost* (double)tip_percent/100;
	        double tax= meal_cost* (double)tax_percent/100;
	        
	        totalCost=  meal_cost+tip+tax;
	     int total=(int) Math.round(totalCost);
		 */
		//System.out.println("The total meal cost is "+total+" dollars.");
		//Hit h= () -> System.out.println("You hit it!");
		//h.hit();
	}
	
	interface Hit
	 {
	  void hit();
	 }
}
